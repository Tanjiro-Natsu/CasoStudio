package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Search extends JFrame {
	private ArrayList<String> Filetxt=new ArrayList<String>();
	private ArrayList<String> Fileimage=new ArrayList<String>();
	private  JTextField s=null;
	private  JTextField s1=null;
	private String argomento="";
	private static String Argomento="argomento";
	private static String cooper="Cooper Black";
	private String fonte="";
	private static ResultSet k;
	private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
 public ArrayList<String> getFileTxt(){return Filetxt;}
 public ArrayList<String> getFileimage(){return Fileimage;}
 public String getArgomento() {return argomento;}
 public String getFonte() {return fonte;}
	private void sets() {s.setText("");}private void sets1() {s1.setText("");}
	public static void main(String[] args) {
		Search a=new Search();
		a.ok();
		a.error(Argomento, "ciao");
				
	}
	public Search() {
		setTitle("Search");
		setSize(400,250);
		setLayout(new GridLayout(3,1));
		JPanel a=new JPanel();
		JPanel a1=new JPanel();
		JPanel a2=new JPanel();
		a.setLayout(new GridLayout(1,2));
		JLabel r=new JLabel("   Inserire Fonte");
		r.setFont(new Font(cooper,Font.PLAIN,14));
		a.add(r);
		s=new JTextField();
		JPanel l=new JPanel();
		l.setLayout(new GridLayout(3,1));
		l.add(new JLabel());
		l.add(s);
		l.add(new JLabel());
		a.add(l);
		a1.setLayout(new GridLayout(1,2));
		JLabel r1=new JLabel("   Inserire Argomento");
		r1.setFont(new Font(cooper,Font.PLAIN,14));
		a1.add(r1);
		s1=new JTextField();
		JPanel l1=new JPanel();
		l1.setLayout(new GridLayout(3,1));
		l1.add(new JLabel());
		l1.add(s1);
		l1.add(new JLabel());
		a1.add(l1);
		add(a);
		add(a1);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		  this.setLocation(550,200);
		  JButton ok=new JButton("Ok");
		  JButton cancel=new JButton("Annulla");
		  ok.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {ok();}});
		  cancel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {s1.setText("");s.setText("");}});
		a2.setLayout(new GridLayout(1,5));
		a2.add(new JLabel(""));
		JPanel i=new JPanel();
		i.setLayout(new GridLayout(3,1));
		i.add(new JLabel(""));
		i.add(ok);
		i.add(new JLabel(""));
		a2.add(i);
		a2.add(new JLabel(""));
		JPanel i1=new JPanel();
		i1.setLayout(new GridLayout(3,1));
		i1.add(new JLabel(""));
		i1.add(cancel);
		i1.add(new JLabel(""));
		a2.add(i1);
		a2.add(new JLabel(""));
		add(a2);
		  setVisible(true);
	}
	private static String query;
	
	
	public void ok() {
		fonte=s.getText();
		argomento=s1.getText();
		int u=0;
		try {
			 Class.forName(driver);
			 
	          String sqlUser = Accesso.getUser();
	          String sqlPassword = Accesso.getPassword(); //passwrod sa account
	          String connectionUrl =Accesso.getjdbc()+";encrypt=false";
	          Class.forName(driver);

	          
	         
	          Connection conn = DriverManager.getConnection(connectionUrl, sqlUser, sqlPassword);
	          Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
	      	
	          if(argomento.equals("")){
	        	 u=split1(stmt);   	
	  		}
	  		else if(fonte.equals("")){
	  	
	  			u=split2(stmt);
	  		}
	  		else if(s.getText().equals("")!=true && s1.getText().equals("")!=true ) {
	  		
	        u=split3(stmt);
	  		}
	         
	        	
	          }
		catch(SQLException e) {}
		catch (ClassNotFoundException j) {}
		catch(Exception e) {}
		for(int i=0;i<Filetxt.size();i++) {System.out.println(Filetxt.get(i));}
		for(int y=0;y<Fileimage.size();y++) {System.out.println(Fileimage.get(y));}
		if(u==0) {
		FileChooser k=new FileChooser(Filetxt,Fileimage);}
			Filetxt.removeAll(Filetxt);
			Fileimage.removeAll(Fileimage);
		
	}
	public void error(String b,String b1) {
		final JFrame a=new JFrame("Errore");
		a.setSize(500,170);
		a.setLocation(500,300);
		a.setLayout(new GridLayout(5,1));
		a.add(new JLabel("     "));
		JPanel a2=new JPanel();
		a2.setLayout(new BorderLayout());
		JLabel t=null;
		if(b.equals(Argomento)) {
			t=new JLabel("Errore:L'argomento \""+b1+"\" non e presente nella lista");	
		}
		if(b.equals("fonte")) {
		 t=new JLabel("Errore:La fonte  \""+b1+"\" non e presente nella lista");	
		
		}
		t.setFont(new Font(cooper,Font.PLAIN,14));
		a2.add(new JLabel(""),BorderLayout.NORTH);
		a2.add(new JLabel(""),BorderLayout.SOUTH);
		a2.add(new JLabel(""),BorderLayout.EAST);
		a2.add(new JLabel(""),BorderLayout.WEST);
		a2.add(t,BorderLayout.CENTER);
		a.add(a2);
		add(new JLabel("     "));
		JButton ok=new JButton("Ok");
		JButton cancel=new JButton("Cancel");
		ok.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {a.dispose();sets();sets1();}});
		cancel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {a.dispose();sets();sets1();}});
		JPanel s=new JPanel();
		s.setLayout(new GridLayout(1,3));
		s.add(ok);
		s.add(new JLabel("  "));
		s.add(cancel);
		a.add(new JLabel(""));
		a.add(s);
		a.setVisible(true);
		
	}
	public void errore1() {
		final JFrame a=new JFrame("Errore");
		a.setSize(500,170);
		a.setLocation(500,300);
		a.setLayout(new GridLayout(5,1));
		a.add(new JLabel("     "));
		JPanel a2=new JPanel();
		a2.setLayout(new BorderLayout());
		JLabel t=new JLabel("Errore:Argomento o fonte inseriti errati");	
		t.setFont(new Font(cooper,Font.PLAIN,14));
		a2.add(new JLabel(""),BorderLayout.NORTH);
		a2.add(new JLabel(""),BorderLayout.SOUTH);
		a2.add(new JLabel(""),BorderLayout.EAST);
		a2.add(new JLabel(""),BorderLayout.WEST);
		a2.add(t,BorderLayout.CENTER);
		a.add(a2);
		add(new JLabel("     "));
		JButton ok=new JButton("Ok");
		JButton cancel=new JButton("Cancel");
		ok.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {a.dispose();sets();sets1();}});
		cancel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {a.dispose();sets();sets1();}});
		JPanel s=new JPanel();
		s.setLayout(new GridLayout(1,3));
		s.add(ok);
		s.add(new JLabel("  "));
		s.add(cancel);
		a.add(new JLabel(""));
		a.add(s);
		a.setVisible(true);
	}

	public int split1(Statement stmt) {
		int u=0;
		try {
			
	
  	  query="SELECT t.name FROM Notizie as n JOIN TESTO as t on n.Stream_File=t.stream_id WHERE n.Fonte='"+fonte+"';"; 
      	 k=stmt.executeQuery(query);
      	
      		
      	 while(k.next()) {
      		 Filetxt.add(k.getString(1));
      	 }
      	 if(Filetxt.size()<1) {
      		 error("fonte",fonte);
      		 u=1;
      	 }
      	
      	 k=null;
      	 query="SELECT t.name FROM Notizie as n JOIN IMMAGINI as t on n.Stream_File=t.stream_id WHERE  n.Fonte='"+fonte+"';"; 
      	 k=stmt.executeQuery(query);
      	
      	 while(k.next()) {
      		 Fileimage.add(k.getString(1));
      	 }
      	 if(Fileimage.size()<1 || Filetxt.size()<1) {
      		 error("fonte",fonte);
      		 u=1;
      	 } 
      	}
		catch(Exception e) {}

		return u;
	}
public int split2(Statement stmt) {
	int u=0;
	try{
		
			query="SELECT t.name FROM Notizie as n JOIN TESTO as t on n.Stream_File=t.stream_id WHERE n.Argomento='"+argomento+"';"; 
    	 k=stmt.executeQuery(query);
    	
        	
    	 while(k.next()) {
    		 Filetxt.add(k.getString(1));
    	 }
    	 if(Filetxt.size()<1) {
    		 error(Argomento,argomento);
    		 u=1;
    	 }
    	  k=null;
    	 query="SELECT t.name FROM Notizie as n JOIN IMMAGINI as t on n.Stream_File=t.stream_id WHERE n.Argomento='"+argomento+"';"; 
    	 k=stmt.executeQuery(query);
    	
        	
    	 while(k.next()) {
    		 Fileimage.add(k.getString(1));
    		 
    	 }
    	 if(Fileimage.size()<1 || Filetxt.size()<1) {
    		 error(Argomento,argomento);
    		 u=1;
    	 }
    	
	}
	catch(Exception e) {}
	return u;
		
	}
public int split3(Statement stmt) {
	int u=0;
	try {
		
			 query="SELECT t.name FROM Notizie as n JOIN TESTO as t on n.Stream_File=t.stream_id WHERE n.Fonte='"+fonte+"'and n.Argomento='"+argomento+"';"; 
   	 k=stmt.executeQuery(query);
   	 
   	 while(k.next()) {
   		 Filetxt.add(k.getString(1));
   	 }
   	 if(Filetxt.size()<1) {
   		 errore1();
   		 u=1;
   	 }
   	 k=null;
   	 query="SELECT t.name FROM Notizie as n JOIN IMMAGINI as t on n.Stream_File=t.stream_id WHERE n.Fonte='"+fonte+"'and n.Argomento='"+argomento+"';"; 
   	 k=stmt.executeQuery(query);
   	 while(k.next()) {
   		 Fileimage.add(k.getString(1));
   	 }
   	 if(Fileimage.size()<1 || Filetxt.size()<1) {
   		 errore1();
   		 u=1;
   	 }
	}
	catch(Exception e) {}
	return u;
}

}
