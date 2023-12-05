package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import  java.awt.event.ActionEvent;
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

public class GUI2 extends JFrame  implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	 private static  MetaData dc=null;
	 private String cooper="Cooper Black";
	 private static boolean result;
	private static String blankSpace="^\\s+";
	 private static JTextField t1=new JTextField(" ");
	  private static JTextField t2=new JTextField(" ");
	 private static JTextField t3=new JTextField(" ");
	 private static JTextField t4=new JTextField(" ");
	 private static JButton button=null;
	 private static JPanel j1=new JPanel();
	 private static JPanel j2=new JPanel();
	 private JPanel a=null;
	   private    static String v=null;
	   private static String fonte=null;
	    private   static String argomento=null;
	    private   static double percentuale=0;
	private static Color colore1=Color.GREEN;
	private static  Color colore2=Color.RED;
	 public static String metadatisave( ) {
		return dc.toString();
	}
	
	 public static void setcolor1(Color a) {
		colore1=a;
	}
	 public static void metadata() {
		dc.dispose();
	}
	 public static void setcolor2(Color a) {
		colore2=a;
	}
	 public static boolean getresult() {
		return result;}
	 public static void refresh() {
		j1.setBackground(Color.WHITE);
		j2.setBackground(Color.WHITE);	
		button.setEnabled(false);
	}
	 public static void COLOR1() {
		j1.setBackground(colore1);
	}
	 public static void COLOR2() {
		j2.setBackground(colore2);
	}
	 public static void sett1() {
		t1.setText(" ");
	}
	 public static void sett2() {
		t2.setText(" ");
	}
	 public static void sett3() {
		t3.setText(" ");
	}
	 public static void sett4() {
		t4.setText(" ");
	}
	 public static String getText3() {
		return t3.getText();
	}
	 public static String getText4() {
		return t4.getText();
	}
	public GUI2() {	
		
		this.setResizable(false);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setTitle("MisInformation");
	        setSize(470, 700);
	      
	        this.setLocation(550,50 );
	        BufferedImage imght=null;;
	        try {
	        	Path path=Paths.get("");
	        	
	            String a1=path.toAbsolutePath().toString();
	            System.out.println(a1);
				this.setIconImage(ImageIO.read(new File(a1+"//Icon//icona.ICO")));
				 imght=ImageIO.read(new File(a1+"//Icon//icona.ICO"));
	        	
	        
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		setLayout(new GridLayout(3,1));
		JLabel a1=new JLabel();
		ImageIcon ww=new ImageIcon(imght);
		a1.setIcon(ww);
		
		this.setJMenuBar(new Menu2());
		JPanel a=new JPanel();

	add(a1);
	
	a.setLayout(new GridLayout(5,2));
	JLabel r=new JLabel("   Inserire la fonte ");
	r.setFont(new Font(cooper,Font.PLAIN,14));
	a.add(r);
	a.add(new JLabel());
	

	 button=new JButton("Cerca..");
	button.addActionListener(this);
	
	
	a.add(t1);
	
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
  
   j1.setBackground(Color.WHITE);
   j1.setBorder(BorderFactory.createLineBorder(Color.black));
   u.add(j1);
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
   a.add(u);

	JLabel r1=new JLabel("   Inserire l'argomento");
	r1.setFont(new Font(cooper,Font.PLAIN,14));
	a.add(r1);
	a.add(new JLabel());
	
	
	a.add(t2);
JPanel a2=new JPanel();
a2.setLayout(new GridLayout(1,3));
a2.add(new JLabel());
a2.add(button);
a2.add(new JLabel());
	a.add(a2);

	
	a.add(new JLabel());
	
	a.add(new JLabel());
	
	 
	add(a);
	
	
	
	//Seconda Parte o Output
	
	JPanel b=new JPanel();
	
	b.setLayout(new GridLayout(2,1));
	b.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),""));
	JPanel b1=new JPanel();
	b1.setLayout(new GridLayout(2,2));
	JLabel r2=new JLabel("   File da verificare");
	r2.setFont(new Font(cooper,Font.PLAIN,14));
	b1.add(r2);
	b1.add(new JLabel());
	t3.setEditable(false);
	t3.setBackground(Color.WHITE);
	t3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),""));
	   b1.add(t3);
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
 
   j2.setBackground(Color.WHITE);
   j2.setBorder(BorderFactory.createLineBorder(Color.black));
   u1.add(j2);
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
 
  
    t4.setEditable(false);
    t4.setBackground(Color.WHITE);
	t4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),""));
b2.add(t4,BorderLayout.CENTER);
    //b2.add(scroll,BorderLayout.CENTER);
b2.add(new JPanel(),BorderLayout.SOUTH);
   
    
   b.add(b2);
  
add(b);
new Thread(new Runnable() {public void run() {
	while(true) {
	if(t1.getText().equalsIgnoreCase(" ") || t2.getText().equalsIgnoreCase(" ")){button.setEnabled(false);}
	
	
	else if(t1.getText().equalsIgnoreCase(" ")!=true && t2.getText().equalsIgnoreCase(" ")!=true) {button.setEnabled(true);}
	
	
	if(t3.getText().equalsIgnoreCase(" ")  ) {
		
		Menu2.setSave(false);
	}
	else if(t3.getText().equalsIgnoreCase(" ")!=true ) {
		Menu2.setSave(true);
		
		
	}
	
}}}).start();
	
		
	}
	public static String getv() {
	    	    	return v;
	    	    }
	public static  String getfonte() {
	    	    	return fonte;
	    	    }
	public static String getargomento() {
	    	    	return argomento;
	    	    }	
	
	private  JFileChooser chooserr() {JFileChooser chooser1=new JFileChooser("C:\\");FileNameExtensionFilter filter1=new FileNameExtensionFilter("Text","txt","Image","jpg");chooser1.setFileFilter(filter1);return chooser1;
	}
	public  void actionPerformed(ActionEvent e) {
    		if(e.getActionCommand().equalsIgnoreCase("Cerca..")) {
    			String ciao=verificaFonte();
    			JFileChooser chooser1=chooserr();
    			int returnVal1=chooser1.showOpenDialog(a);
            if(returnVal1==JFileChooser.APPROVE_OPTION){}
                
                t3.setText(chooser1.getSelectedFile().getName());
                int s=chooser1.getSelectedFile().toString().length();
                char q[]=new char [s];
                for(int i=0;i<s;i++){
                    q[i]=chooser1.getSelectedFile().toString().charAt(i);
                }
    int f=0;
    int y=0;
                for(int w=0;w<s;w++){
                    
                    if(y==1){
    if(f==0 ){
        v=Character.toString(q[w]);
    }
    else{
                  v+=Character.toString(q[w]);  }
                  f++;}
                 
                  if(q[w]=='.'){
                    y=1;
                }
                }
                metav(chooser1.getSelectedFile());
     t4.setText(ciao);
}        
                
             
	} 
    public static String verificaFonte() {
   	 argomento=t2.getText();
			argomento=argomento.replaceAll(blankSpace,"");
			String ciao=VerificaFonte.fonteverificata(argomento);
			String [] ciao1=ciao.split(" ");
			int t=0;
			int f1=0;
			String h=new StringBuilder().append("").append(t1.getText()).toString();
			System.out.println(h.replaceAll(blankSpace,""));
			for(int i=0;i<ciao1.length;i++) {
					if(t1.getText().replaceAll(blankSpace,"").equalsIgnoreCase(ciao1[i])) {
						t=1;
						f1=0;
						break;
					}	
					else {
						f1=1;
					}
					
			}
			if(t==1) {
				j1.setBackground(colore1);
			}
			if(f1==1) {
				j1.setBackground(colore2);
			}
			return ciao;
    }   
	public static void  metav(File a) {
		 dc=new MetaData(a.toPath());
		   
 		
 		if(v.equalsIgnoreCase("txt")){
             percentuale=VeerificaTesto.reader(a.getAbsolutePath())*100;
            
             if(percentuale>60.00) {
             	j2.setBackground(colore1);
             	result=true;
             }
             else if(percentuale<60.00) {
             	j2.setBackground(colore2);
             	result=false;
             }}
         else if(v.equalsIgnoreCase("jpg")){
          	
          	percentuale=VerificaFonte.databasejpg(a.getAbsolutePath());
          	
              System.out.println(percentuale);
              if(percentuale==0.00) {
              	j2.setBackground(colore1);
              	result=true;
              }
              else if(percentuale>0.00) {
              	j2.setBackground(colore2);
              	result=false;
              }
          	
          }
	}
	
	
	
}
