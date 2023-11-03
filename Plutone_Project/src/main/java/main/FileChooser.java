package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class FileChooser extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JPanel k=null;
	private JPanel k1=null;
	private   BufferedImage imgB;
	private static  JLabel s;
	
	public void setimg(BufferedImage dd) {imgB=dd;}
	public JPanel getk() {return k;}
	public JPanel getk1() {return k1;}
	
	
	public FileChooser(ArrayList<String> txt,ArrayList<String> image) {
		setTitle("Choose");
		setSize(800,600);
		  this.setLocation(350,100 );
		setDefaultCloseOperation(this.HIDE_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		k=new JPanel();
		k1=new JPanel();
		 k.setBorder(BorderFactory.createLineBorder(Color.black));
		 k1.setBorder(BorderFactory.createLineBorder(Color.black));
		 TitledBorder f=new TitledBorder("File Testo");
		 f.setTitleJustification(TitledBorder.LEFT);
		 f.setTitlePosition(TitledBorder.TOP);
		 TitledBorder f1=new TitledBorder("Immagini");
		 f1.setTitleJustification(TitledBorder.LEFT);
		 f1.setTitlePosition(TitledBorder.TOP);
		 k.setBorder(f);
		 k1.setBorder(f1);
		 k.setLayout(new GridLayout(txt.size(),1));
		 k1.setLayout(new GridLayout(image.size(),1));
		 final ButtonGroup d=new ButtonGroup();
		 
		 ArrayList<JRadioButton> ss=new ArrayList<JRadioButton>(txt.size()+image.size());
		 for(int i=0;i<txt.size();i++) {
			
JRadioButton dd=new JRadioButton(txt.get(i));
d.add(dd);
 final String xx=txt.get(i);
dd.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {Finestratxt(xx);}});
k.add(dd);
ss.add(dd);
		 }
		 for(int i=0;i<image.size();i++) {
			 JRadioButton dd=new JRadioButton(image.get(i));
			 d.add(dd);
			 final String xx=image.get(i);
			 dd.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {Finestraimage(xx);
			 }});
			 k1.add(dd);
			 ss.add(dd);
		 }
		 
		 add(k);
		 add(k1);
		 setVisible(true);
	}
	
	public void Finestratxt(String v) {
		JFrame g=new JFrame(v);
		g.setSize(800,600);
		  g.setLocation(350,100 );
		  g.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
		  
		  JTextArea b=new JTextArea();
		  MenuSearch jj=new MenuSearch(b);
		  g.setJMenuBar(jj);
		  g.setLayout(new BorderLayout());
		  g.add(new JLabel("                                              "),BorderLayout.NORTH);
		  g.add(new JLabel("                                              "),BorderLayout.SOUTH);
		  g.add(new JLabel("                        "),BorderLayout.EAST);
		  g.add(new JLabel("                        "),BorderLayout.WEST);
		  JScrollPane scrollPane = new JScrollPane(b);
     	 g.add(scrollPane,BorderLayout.CENTER);
		  
	b.setText(getext(v));
			
		  g.setVisible(true);
	}
	private JFrame b;
	private ByteArrayInputStream bis;
	public ByteArrayInputStream getbis() {return bis;} 
	public JFrame getb() {return b;}
	public void Finestraimage(String v)  {
		b=new JFrame(v);
		b.setSize(1500, 900);
		b.setLocation(50,10);
		b.setDefaultCloseOperation(b.HIDE_ON_CLOSE);
		
		
	 bis = new ByteArrayInputStream(getbyteimg(v));
		 s=new JLabel();
		try {
			imgB = ImageIO.read(bis);
			setJLabel(imgB,v);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		b.setJMenuBar(new ImageMenu(imgB,v,getbyteimg(v)));
		
         b.add(s);
		 s.setLayout(new BorderLayout());
         b.setVisible(true);
		
	}
	public static void reset(String v) {try {
		
		ImageIcon icon=new ImageIcon(ImageIO.read(new File(v)));
		 s.setIcon(icon);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	public static void setJLabel(BufferedImage dd,String v) {
		
		
		try {
			ImageIO.write(dd, "jpg", new File(v));
			ImageIcon icon=new ImageIcon(ImageIO.read(new File(v)));
			 s.setIcon(icon);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getext(String v) {
		String dd = null;
		  byte []e=null;
			try {
				 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				 
		          String sqlUser = Accesso.getUser();
		          String sqlPassword = Accesso.getPassword(); //passwrod sa account
		          String connectionUrl =Accesso.getjdbc()+";encrypt=false";
		          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		          
		         
		          Connection conn = DriverManager.getConnection(connectionUrl, sqlUser, sqlPassword);
		          Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
		          String query="SELECT file_stream FROM  Testo  WHERE name='"+v+"';"; 
		          ResultSet k=stmt.executeQuery(query);
		      
			        	
		        	 while(k.next()) {
		        		
		        		e=k.getBytes(1);
		        		 
		        	 }
		        	 
		        	 dd=new  String(e);
		        	
		        	
		          }
			catch(SQLException e1) {}
			catch (ClassNotFoundException j) {}
			catch(Exception e2) {}
			String h[]=dd.split(" ");
			String xx="";
			int o=0;
			for(int i=0;i<h.length;i++) {
				if(o==14) {
					xx=xx+" "+h[i]+" \n";
					o=0;
				}
				else {
					xx=xx+" "+h[i];
				}
				o++;
			}
		
			return xx;
	}
	
	public byte[] getbyteimg(String v) {
		
		  byte []e=null;
			try {
				 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				 
		          String sqlUser = Accesso.getUser();
		          String sqlPassword = Accesso.getPassword(); //passwrod sa account
		          String connectionUrl =Accesso.getjdbc()+";encrypt=false";
		          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		          
		         
		          Connection conn = DriverManager.getConnection(connectionUrl, sqlUser, sqlPassword);
		          Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
		          String query="SELECT file_stream FROM  Immagini  WHERE name='"+v+"';"; 
		          ResultSet k=stmt.executeQuery(query);
		      
			        	
		        	 while(k.next()) {
		        		
		        		e=k.getBytes(1);
		        		 
		        	 }
		          }
			catch(SQLException e1) {}
			catch (ClassNotFoundException j) {}
			catch(Exception e2) {}
		
			return e;
	}
	
}
