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
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class FileChooser extends JFrame implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private JPanel k=null;
	private JPanel k1=null;
	private static   BufferedImage imgB;
	private static  JLabel s;
	private static String jdbc="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public JPanel getk() {return k;}
	public JPanel getk1() {return k1;}
	
	
	public FileChooser(List<String> txt,List<String> image) {
		setTitle("Choose");
		setSize(800,600);
		  this.setLocation(350,100);
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
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
		  g.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		  
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
	private static  JFrame b;
	private transient static ByteArrayInputStream bis;
	public ByteArrayInputStream getbis() {return bis;} 
	public JFrame getb() {return b;}
	public static void Finestraimage(String v)  {
		b=new JFrame(v);
		b.setSize(1500, 900);
		b.setLocation(50,10);
		b.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		
		
	 bis = new ByteArrayInputStream(getbyteimg(v));
		 s=new JLabel();
		try {
			imgB = ImageIO.read(bis);
			setJLabel(imgB,v);
		} catch (IOException e) {
			
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
		
		e.printStackTrace();
	}}
	public static void setJLabel(BufferedImage dd,String v) {
		
		
		try {
			ImageIO.write(dd, "jpg", new File(v));
			ImageIcon icon=new ImageIcon(ImageIO.read(new File(v)));
			 s.setIcon(icon);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public String getext(String v) {
		String dd = null;
		  byte []e=null;
			try {
				 Class.forName(jdbc);
				 
		          String sqlUser = Accesso.getUser();
		          String sqlPassword = Accesso.getPassword(); //passwrod sa account
		          String connectionUrl =Accesso.getjdbc()+";encrypt=false";
		          Class.forName(jdbc);
		          Connection conn = DriverManager.getConnection(connectionUrl, sqlUser, sqlPassword);
		         
		          String query="SELECT file_stream FROM  Testo  WHERE name=?;";
		     	 java.sql.PreparedStatement stmt=conn.prepareStatement(query);
		     	 stmt.setString(1,v);
		          ResultSet k=stmt.executeQuery();
		      
			        	
		        	 while(k.next()) {
		        		
		        		e=k.getBytes(1);
		        		 
		        	 }
		        	 
		        	 dd=new  String(e);
		        	 stmt.close();
		        	conn.close();
		        	
		          }
			catch(Exception e2) {}
			String []h=dd.split(" ");
			String xx="";
			int o=0;
			for(int i=0;i<h.length;i++) {
				if(o==14) {
					xx=new StringBuilder().append(xx).append(" ").append(h[i]).append(" \n").toString();
					o=0;
				}
				else {
					xx=new StringBuilder().append(xx).append(" ").append(h[i]).toString();
				}
				o++;
			}
		
			return xx;
	}
	
	public static byte[] getbyteimg(String v) {
		
		  byte []e=null;
			try {
				 Class.forName(jdbc);
				 
		          String sqlUser = Accesso.getUser();
		          String sqlPassword = Accesso.getPassword(); //passwrod sa account
		          String connectionUrl =Accesso.getjdbc()+";encrypt=false";
		          Class.forName(jdbc);

		          
		         
		          Connection conn = DriverManager.getConnection(connectionUrl, sqlUser, sqlPassword);
		          
		          String query="SELECT file_stream FROM  Immagini  WHERE name=?;"; 
		          java.sql.PreparedStatement stmt=conn.prepareStatement(query);
		          stmt.setString(1, v);
		          ResultSet k=stmt.executeQuery();
		      
			        	
		        	 while(k.next()) {
		        		
		        		e=k.getBytes(1);
		        		 
		        	 }
		        	 conn.close();
		        	 stmt.close();
		          }
			catch(Exception e2) {}
		
			return e;
	}
	
}
