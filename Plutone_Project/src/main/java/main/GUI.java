package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI extends JFrame  implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private static Menu ss1;
	 private static  MetaData dc1=null;
	 private static boolean result1;
	 private static String cooper="Cooper Blank";
	private static String blankSpace1="^\\s+";
	 private static JTextField t11=new JTextField(" ");
	  private static JTextField t21=new JTextField(" ");
	 private static JTextField t31=new JTextField(" ");
	 private static JTextField t41=new JTextField(" ");
	 private static JButton button1=null;
	 private static JPanel j11=new JPanel();
	 private static JPanel j21=new JPanel();
	 private JPanel a1=null;
	   private    static String v1=null;
	   private static String fonte1=null;
	    private   static String argomento1=null;
	    private   static double percentuale1=0;
	private static Color COLORE11=Color.GREEN;
	private static  Color COLORE21=Color.RED;
	 public static String metadatisave( ) {
		return dc1.toString();
	}
	 public Menu getMenu() {
		 return ss1;
	 }
	 public static void setcolor1(Color a) {
		 COLORE11=a;
	}
	 public static void metadata() {
		dc1.dispose();
	}
	 public static void setcolor2(Color a) {
		 COLORE21=a;
	}
	 public static boolean getresult() {
		return result1;}
	 public static void refresh() {
		j11.setBackground(Color.WHITE);
		j21.setBackground(Color.WHITE);	
		button1.setEnabled(false);
	}
	 public static void Color1() {
		j11.setBackground(COLORE11);
	}
	 public static void Color2() {
		j21.setBackground(COLORE21);
	}
	 public static void sett1() {
		t11.setText(" ");
	}
	 public static void sett2() {
		t21.setText(" ");
	}
	 public static void sett3() {
		t31.setText(" ");
	}
	 public static void sett4() {
		t41.setText(" ");
	}
	 public static String getText3() {
		return t31.getText();
	}
	 public static String getText4() {
		return t41.getText();
	}
	public GUI() {	
		
		this.setResizable(false);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setTitle("MisInformation");
	        setSize(470, 700);
	      
	        this.setLocation(550,50 );
	        BufferedImage imght=null;;
	        try {
	        	Path path=Paths.get("");
	        	
	        	  String a23=path.toAbsolutePath().toString();
	      
				this.setIconImage(ImageIO.read(new File(a23+"//Icon//icona.ICO")));
				 imght=ImageIO.read(new File(a23+"//Icon//icona.ICO"));
	        	
	        
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		setLayout(new GridLayout(3,1));
		JLabel a111=new JLabel();
		ImageIcon ww=new ImageIcon(imght);
		a111.setIcon(ww);
		this.setJMenuBar(new Menu());
	
		JPanel a11=new JPanel();
		

	add(a111);
	
	a11.setLayout(new GridLayout(5,2));
	JLabel r=new JLabel("   Inserire la fonte ");
	r.setFont(new Font(cooper,Font.PLAIN,14));
	a11.add(r);
	a11.add(new JLabel());
	

	 button1=new JButton("Cerca..");
	button1.addActionListener(this);
	
	
	a11.add(t11);
	
	JPanel u=new JPanel();
    u.setLayout(new GridLayout(3,9));
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());

   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
  
   j11.setBackground(Color.WHITE);
   j11.setBorder(BorderFactory.createLineBorder(Color.black));
   u.add(j11);
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   
   
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   u.add(new JLabel());
   a11.add(u);

	JLabel r1=new JLabel("   Inserire l'argomento");
	r1.setFont(new Font(cooper,Font.PLAIN,14));
	a11.add(r1);
	a11.add(new JLabel());
	
	
	a11.add(t21);
JPanel a2=new JPanel();
a2.setLayout(new GridLayout(1,3));
a2.add(new JLabel());
a2.add(button1);
a2.add(new JLabel());
	a11.add(a2);

	
	a11.add(new JLabel());
	
	a11.add(new JLabel());
	
	 
	add(a11);
	JPanel b=new JPanel();
	
	b.setLayout(new GridLayout(2,1));
	b.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),""));
	JPanel b1=new JPanel();
	b1.setLayout(new GridLayout(2,2));
	JLabel r2=new JLabel("   File da verificare");
	r2.setFont(new Font(cooper,Font.PLAIN,14));
	b1.add(r2);
	b1.add(new JLabel());
	t31.setEditable(false);
	t31.setBackground(Color.WHITE);
	t31.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),""));
	   b1.add(t31);
	JPanel u1=new JPanel();
    u1.setLayout(new GridLayout(3,9));
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());

   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
 
   j21.setBackground(Color.WHITE);
   j21.setBorder(BorderFactory.createLineBorder(Color.black));
   u1.add(j21);
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   
   
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   u1.add(new JLabel());
   b1.add(u1);
   
   
   b.add(b1);

   JPanel b2=new JPanel();
   b2.setLayout(new BorderLayout());
   
    
    


   
    JLabel r3=new JLabel("   Fonti certificate ");
    r3.setFont(new Font(cooper,Font.PLAIN,14));
    b2.add(r3,BorderLayout.NORTH);
    t41.setEditable(false);
    t41.setBackground(Color.WHITE);
	t41.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),""));
b2.add(t41,BorderLayout.CENTER);
b2.add(new JPanel(),BorderLayout.SOUTH);
   
    
   b.add(b2);
  
add(b);
new Thread(new Runnable() {public void run() {
	boolean r=true;
	int r1=0;
	while(r) {
		if(r1!=0) {r=false;}
	if(t11.getText().equalsIgnoreCase(" ") || t21.getText().equalsIgnoreCase(" ")){button1.setEnabled(false);}
	
	
	else if(t11.getText().equalsIgnoreCase(" ")!=true && t21.getText().equalsIgnoreCase(" ")!=true) {button1.setEnabled(true);}
	
	
	if(t31.getText().equalsIgnoreCase(" ")  ) {
		
		Menu.setSave(false);
	}
	else if(t31.getText().equalsIgnoreCase(" ")!=true ) {
		Menu.setSave(true);
		
		
	}
	
	
	
	
}}
}).start();
	
		
	}
	public static String getv() {
	    	    	return v1;
	    	    }
	public static  String getfonte() {
	    	    	return fonte1;
	    	    }
	public static String getargomento() {
	    	    	return argomento1;
	    	    }
				
	public  void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase("Cerca..")) {
			String ciao=verificaFonte();
		JFileChooser chooser1=new JFileChooser("C:\\");
        FileNameExtensionFilter filter1=new FileNameExtensionFilter("Text","txt","Image","jpg");
        chooser1.setFileFilter(filter1);
        int returnVal1=chooser1.showOpenDialog(a1);
        if(returnVal1==JFileChooser.APPROVE_OPTION){System.out.println("approved");}
            
            t31.setText(chooser1.getSelectedFile().getName());
            int s=chooser1.getSelectedFile().toString().length();
            char q[]=new char [s];
            for(int i=0;i<s;i++){
                q[i]=chooser1.getSelectedFile().toString().charAt(i);
            }
          
            
            
cicla(q,s);
System.out.println(chooser1.getSelectedFile().getAbsolutePath().toString());
            metav(chooser1.getSelectedFile());
            
 t41.setText(ciao);
}        
            
      
} 
	 private void cicla(char [] q,int s) {
		 int f=0;
		 int y=0;
		             for(int w=0;w<s;w++){
		                 
		                 if(y==1){
		 if(f==0 ){
		     v1=Character.toString(q[w]);
		 }
		 else{
		               v1+=Character.toString(q[w]);  }
		               f++;}
		              
		               if(q[w]=='.'){
		                 y=1;
		             }
		             }
	 }  
	 public static String verificaFonte() {
	   	 argomento1=t21.getText();
				argomento1=argomento1.replaceAll(blankSpace1,"");
				String ciao=VerificaFonte.fonteverificata(argomento1);
				String [] ciao1=ciao.split(" ");
				int t=0;
				int f1=0;
				String h=new StringBuilder().append("").append(t11.getText()).toString();
				System.out.println(h.replaceAll(blankSpace1,""));
				for(int i=0;i<ciao1.length;i++) {
						if(t11.getText().replaceAll(blankSpace1,"").equalsIgnoreCase(ciao1[i])) {
							t=1;
							f1=0;
							break;
						}	
						else {
							f1=1;
						}
						
				}
				if(t==1) {
					j11.setBackground(COLORE11);
				}
				if(f1==1) {
					j11.setBackground(COLORE21);
				}
				return ciao;
	    }   
		public static void  metav(File a) {
			 dc1=new MetaData(a.toPath());
			   
	 		
	 		if(v1.equalsIgnoreCase("txt")){
	 			
	             percentuale1=VeerificaTesto.reader(a.getAbsolutePath())*100;
	            
	             if(percentuale1>60.00) {
	             	j21.setBackground(COLORE11);
	             	result1=true;
	             }
	             else if(percentuale1<60.00) {
	             	j21.setBackground(COLORE21);
	             	result1=false;
	             }}
	         else if(v1.equalsIgnoreCase("jpg")){
	          	
	          	percentuale1=VerificaFonte.databasejpg(a.getAbsolutePath().toString());
	          	
	              if(percentuale1==0.00) {
	              	j21.setBackground(COLORE11);
	              	result1=true;
	              }
	              else if(percentuale1>0.00) {
	              	j21.setBackground(COLORE21);
	              	result1=false;
	              }
	          	
	          }
		}
	
}
