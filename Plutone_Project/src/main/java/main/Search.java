package main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



public class Search extends JFrame {
	private static String query;
	private static String stringafonte="fonte";
	private static final long serialVersionUID = 1L;
	private ArrayList<String> filetxt=new ArrayList<String>();
	private ArrayList<String> fileimage=new ArrayList<String>();
	private  JTextField s=null;
	private  JTextField s1=null;
	private String argomento="";
	private static String ARGOMENTO="argomento";
	private static String cooper="Cooper Black";
	private String fonte="";
	private static ResultSet k;
	private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
 public List<String> getFileTxt(){return filetxt;}
 public List<String> getFileimage(){return fileimage;}
 public String getArgomento() {return argomento;}
 public String getFonte() {return fonte;}
	private void sets() {s.setText("");}private void sets1() {s1.setText("");}

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
		  ok.addActionListener(e->{ok();});
		  cancel.addActionListener(e-> {s1.setText("");s.setText("");});
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
	
	
	
	public void ok() {
		
		fonte=s.getText();
		argomento=s1.getText();
		int u=0;
		 Connection conn=null;
		 
		try {
			 Class.forName(driver);
			 
	          String sqlUser = Accesso.getUser();
	          String sqlPassword = Accesso.getPassword(); 
	          String connectionUrl =new StringBuilder().append(Accesso.getjdbc()).append(";encrypt=false").toString();
	         

	          
	          
	          conn= DriverManager.getConnection(connectionUrl, sqlUser, sqlPassword);
	          if(argomento.equals("")){
	        	 u=split1(conn);   	
	  		}
	  		else if(fonte.equals("")){
	  	
	  			u=split2(conn);
	  		}
	  		else if(s.getText().equals("")!=true && s1.getText().equals("")!=true ) {
	  		
	        u=split3(conn);
	  		}
	         
	        	
	        	
	          }
	
		catch(Exception e) {System.out.println(e.getMessage());}
		finally {try {conn.close();} catch (SQLException e) {System.out.println(e.getMessage());
		}}
		
		for(int i=0;i<filetxt.size();i++) {System.out.println(filetxt.get(i));}
		for(int y=0;y<fileimage.size();y++) {System.out.println(fileimage.get(y));}
		if(u==0 ) {
		new FileChooser(filetxt,fileimage);}
			filetxt.removeAll(filetxt);
			fileimage.removeAll(fileimage);
		
	}
	public void error(String b,String b1,int kk) {
		final JFrame a=new JFrame("Errore");
		a.setSize(500,170);
		a.setLocation(500,300);
		a.setLayout(new GridLayout(5,1));
		a.add(new JLabel("     "));
		JPanel a2=new JPanel();
		a2.setLayout(new BorderLayout());
		JLabel t=null;
		if(b.equals("argomento")) {
			t=new JLabel("Errore:L'argomento \""+b1+"\" non e presente nella lista");	
		}
		if(b.equals(stringafonte)) {
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
		ok.addActionListener(e-> {a.dispose();sets();sets1();});
		cancel.addActionListener(e-> {a.dispose();sets();sets1();});
		JPanel sq=new JPanel();
		sq.setLayout(new GridLayout(1,3));
		sq.add(ok);
		sq.add(new JLabel("  "));
		sq.add(cancel);
		a.add(new JLabel(""));
		a.add(sq);
		if(kk==2) {a.setVisible(true);}
		else {a.setVisible(false);}
		
		
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
		ok.addActionListener(e->{a.dispose();sets();sets1();});
		cancel.addActionListener(e-> {a.dispose();sets();sets1();});
		JPanel sw=new JPanel();
		sw.setLayout(new GridLayout(1,3));
		sw.add(ok);
		sw.add(new JLabel("  "));
		sw.add(cancel);
		a.add(new JLabel(""));
		a.add(sw);
		a.setVisible(true);
	}

	public int split1(Connection conn) {
		int u=0;
		try {
			
			 query="SELECT t.name FROM Notizie as n JOIN TESTO as t on n.Stream_File=t.stream_id WHERE n.Fonte=?;"; 
      	 java.sql.PreparedStatement stmt=conn.prepareStatement(query);
      	 stmt.setString(1,fonte);
			k=stmt.executeQuery();
      	
      		
      	 while(k.next()) {
      		 filetxt.add(k.getString(1));
      	 }
      	 if(filetxt.isEmpty()) {
      		 error(stringafonte,fonte,2);
      		 u=1;
      	 }
      	
      	 k=null;
      	 query="SELECT t.name FROM Notizie as n JOIN IMMAGINI as t on n.Stream_File=t.stream_id WHERE  n.Fonte=?;"; 
    stmt=conn.prepareStatement(query);
      	 stmt.setString(1,fonte);
      	 k=stmt.executeQuery();
      	
      	 while(k.next()) {
      		 fileimage.add(k.getString(1));
      	 }
      	 if(fileimage.isEmpty() || filetxt.isEmpty()) {
      		 error(stringafonte,fonte,2);
      		 u=1;
      	 } 
      	stmt.close();
      	}
		catch(Exception e) {System.out.println(e.getMessage());}

		return u;
	}
public int split2(Connection conn) {
	int u=0;
	
	try{
		
			  query="SELECT t.name FROM Notizie as n JOIN TESTO as t on n.Stream_File=t.stream_id WHERE n.Argomento= ?;"; 
			java.sql.PreparedStatement stmt= conn.prepareStatement(query);
			 conn.setAutoCommit(false);
			 stmt.setString(1,argomento);
			 k=stmt.executeQuery();
    	
        	
    	 while(k.next()) {
    		 filetxt.add(k.getString(1));
    	 }
    	 if(filetxt.isEmpty()) {
    		 error(ARGOMENTO,argomento,2);
    		 u=1;
    	 }
    	  k=null;
    	 
    	  query="SELECT t.name FROM Notizie as n JOIN IMMAGINI as t on n.Stream_File=t.stream_id WHERE n.Argomento=?;"; 
    	  stmt= conn.prepareStatement(query);
    	  stmt.setString(1,argomento);
    	  k=stmt.executeQuery();
    	
        	
    	 while(k.next()) {
    		 fileimage.add(k.getString(1));
    		 
    	 }
    	 if(fileimage.isEmpty() || filetxt.isEmpty()) {
    		 error(ARGOMENTO,argomento,2);
    		 u=1;
    	 }
    	 stmt.close();
	}
	catch(Exception e) {System.out.println(e.getMessage());}
	return u;
		
	}
public int split3(Connection conn) {
	int u=0;
	try {
		
			  
		 query="SELECT t.name FROM Notizie as n JOIN TESTO as t on n.Stream_File=t.stream_id WHERE n.Fonte= ? and n.Argomento=?;"; 
		java.sql.PreparedStatement stmt=conn.prepareStatement(query);
		stmt.setString(1,fonte);
		stmt.setString(2,argomento);
		k=stmt.executeQuery();
   	 
   	 while(k.next()) {
   		 filetxt.add(k.getString(1));
   	 }
   	 if(filetxt.isEmpty()) {
   		 errore1();
   		 u=1;
   	 }
   	 k=null;
   	 
   	 query="SELECT t.name FROM Notizie as n JOIN IMMAGINI as t on n.Stream_File=t.stream_id WHERE n.Fonte=? and n.Argomento=?;"; 
    stmt=conn.prepareStatement(query);
    stmt.setString(1,fonte);
    stmt.setString(2,argomento);
   	 k=stmt.executeQuery();
   	 while(k.next()) {
   		 fileimage.add(k.getString(1));
   	 }
   	 if(fileimage.isEmpty() || filetxt.isEmpty()) {
   		 errore1();
   		 u=1;
   	 }
   	stmt.close();
	}
	catch(Exception e) {System.out.println(e.getMessage());}
	return u;
}

}
