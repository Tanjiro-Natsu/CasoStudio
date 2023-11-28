package main;

import java.nio.file.*;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Menu extends JMenuBar implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private JFrame prova=null;
	private JFrame xc=null;
	private JButton v=null;
	private static int counter=1;
private static String cooper="Cooper Blank";
	private static JMenu menu1 ;
	private static JMenu fonti;
	private static JMenu helpmenu;
	private static JMenuItem Refresh;
	private static JMenuItem Exit ;
	private static JMenuItem Properties;
	private static JMenuItem Save;
	private static JMenuItem Info;
	private static JMenuItem Manuale;
	private static JMenuItem Sito;
	private JLabel versione;
	private JMenuItem colore10=new JMenuItem("Rosso");
	private  JMenuItem colore11=new JMenuItem("Blue");
	private JMenuItem colore12=new JMenuItem("Verde");
	private  JMenuItem colore13=new JMenuItem("Arancione");
	private JMenuItem colore14=new JMenuItem("Giallo");
	private  JMenuItem colore15=new JMenuItem("Magenta");
	private JMenuItem colore16=new JMenuItem("Nero");
	private JMenuItem colore17=new JMenuItem("Rosa");
	private JMenuItem colore18=new JMenuItem("Grigio");
	private JMenuItem colore20=new JMenuItem("Rosso");
	private JMenuItem colore21=new JMenuItem("Blue");
	private JMenuItem colore22=new JMenuItem("Verde");
	private JMenuItem colore23=new JMenuItem("Arancione");
	private JMenuItem colore24=new JMenuItem("Giallo");
	private JMenuItem colore25=new JMenuItem("Magenta");
	private JMenuItem colore26=new JMenuItem("Nero");
	private JMenuItem colore27=new JMenuItem("Rosa");
	private JMenuItem colore28=new JMenuItem("Grigio");
	private ImageIcon Image1=null;
	private ImageIcon Image2=null;
	private ImageIcon Image3=null;
	private ImageIcon Image4=null;
	private ImageIcon Image5=null;
	private ImageIcon Image6=null;
	private ImageIcon Image7=null;
	private ImageIcon Image8=null;
	private ImageIcon Image9=null;
	private ImageIcon Image10=null;
	private JMenuItem bloccaFonte;
	private JMenuItem sbloccaFonte;
	private JButton accetta=null;
	private JButton accetta1=null;
	private JButton rifiuta=null;
	private JButton rifiuta1=null;
	private JTextArea zzz=null;
private String versioneprodotto="1.0.0";
public  JMenuItem getColor10() {return colore10;}
public  JMenuItem getColor11() {return colore11;}
public  JMenuItem getColor12() {return colore12;}
public  JMenuItem getColor13() {return colore13;}
public  JMenuItem getColor14() {return colore14;}
public  JMenuItem getColor15() {return colore15;}
public  JMenuItem getColor16() {return colore16;}
public  JMenuItem getColor17() {return colore17;}
public  JMenuItem getColor18() {return colore18;}
public  JMenuItem getColor20() {return colore20;}
public  JMenuItem getColor21() {return colore21;}
public  JMenuItem getColor22() {return colore22;}
public  JMenuItem getColor23() {return colore23;}
public  JMenuItem getColor24() {return colore24;}
public  JMenuItem getColor25() {return colore25;}
public  JMenuItem getColor26() {return colore26;}
public  JMenuItem getColor27() {return colore27;}
public  JMenuItem getColor28() {return colore28;}
public ImageIcon getImageIcon1() {return Image1;}
public ImageIcon getImageIcon2() {return Image2;}
public ImageIcon getImageIcon3() {return Image3;}
public ImageIcon getImageIcon4() {return Image4;}
public ImageIcon getImageIcon5() {return Image5;}
public ImageIcon getImageIcon6() {return Image6;}
public ImageIcon getImageIcon7() {return Image7;}
public ImageIcon getImageIcon8() {return Image8;}
public ImageIcon getImageIcon9() {return Image9;}
public ImageIcon getImageIcon10() {return Image10;}
public JButton getaccetta() {return accetta;}
public JButton getaccetta1() {return accetta1;}
public JButton getrifiuta() {return rifiuta;}
public JButton getrifiuta1() {return rifiuta1;}

public static void setSave(boolean a) {
	 Save.setEnabled(a);
}
public JMenu getjMenu() {
	return fonti;
}

	public Menu(){
		
		

try {
	

	
	  Path path=Paths.get("");
    String a=path.toAbsolutePath().toString();
   
	 Image1=new ImageIcon(ImageIO.read(new File(a+"\\Icon\\Refresh.png")));
	 Image2=new ImageIcon(ImageIO.read(new File(a+"\\Icon\\i.png")));
	 Image3=new ImageIcon(ImageIO.read(new File(a+"\\Icon\\save.png")));
	 Image4=new ImageIcon(ImageIO.read(new File(a+"\\Icon\\check.png")));
	 Image5=new ImageIcon(ImageIO.read(new File(a+"\\Icon\\exit.png")));
	 Image6=new ImageIcon(ImageIO.read(new File(a+"\\Icon\\info.png")));
	 Image7=new ImageIcon(ImageIO.read(new File(a+"\\Icon\\manuale.png")));
	 Image8=new ImageIcon(ImageIO.read(new File(a+"\\Icon\\web.png")));
	 Image9=new ImageIcon(ImageIO.read(new File(a+"\\Icon\\lock.png")));
	 Image10=new ImageIcon(ImageIO.read(new File(a+"\\Icon\\unlock.png")));
	
	
	
} catch (IOException e){
	e.printStackTrace();
}

bloccaFonte=new JMenuItem("Blocca Fonte");
bloccaFonte.setIcon(Image9);
sbloccaFonte=new JMenuItem("Sblocca Fonte");
sbloccaFonte.setIcon(Image10);
menu1=new JMenu("File");
fonti=new JMenu("Fonti");
helpmenu=new JMenu("Help");
Refresh=new JMenuItem("Refresh");
Refresh.setIcon(Image1);
Save=new JMenuItem("Save");
Save.setIcon(Image3);
Properties=new JMenu("Properties");
Properties.setIcon(Image2);
Exit=new JMenuItem("Exit");
Exit.setIcon(Image5);
Info=new JMenuItem("Info");
Info.setIcon(Image6);
Manuale=new JMenuItem("Manuale");
Manuale.setIcon(Image7);
Sito=new JMenuItem("Sito");
Sito.setIcon(Image8);
JMenu colori=new JMenu("Colori");
JMenu coloriTrue=new JMenu("ColoriTrue");
JMenu coloriFalse=new JMenu("ColoriFalse");



Refresh.addActionListener(this);
Save.addActionListener(this);
Properties.addActionListener(this);
Exit.addActionListener(this);
Info.addActionListener(this);
Manuale.addActionListener(this);
Sito.addActionListener(this);
colore10.addActionListener(this);
colore11.addActionListener(this);
colore12.addActionListener(this);
colore13.addActionListener(this);
colore14.addActionListener(this);
colore15.addActionListener(this);
colore16.addActionListener(this);
colore17.addActionListener(this);
colore18.addActionListener(this);
colore20.addActionListener(this);
colore21.addActionListener(this);
colore22.addActionListener(this);
colore23.addActionListener(this);
colore24.addActionListener(this);
colore25.addActionListener(this);
colore26.addActionListener(this);
colore27.addActionListener(this);
colore28.addActionListener(this);
bloccaFonte.addActionListener(this);
sbloccaFonte.addActionListener(this);


fonti.add(bloccaFonte);
fonti.add(sbloccaFonte);
Properties.add(colori);
colori.add(coloriTrue);
coloriTrue.add(colore10);
coloriTrue.add(colore11);
coloriTrue.add(colore12);
colore12.setIcon(Image4);
coloriTrue.add(colore13);
coloriTrue.add(colore14);
coloriTrue.add(colore15);
coloriTrue.add(colore16);
coloriTrue.add(colore17);
coloriTrue.add(colore18);
colori.add(coloriFalse);
coloriFalse.add(colore20);
colore20.setIcon(Image4);
coloriFalse.add(colore21);
coloriFalse.add(colore22);
coloriFalse.add(colore23);
coloriFalse.add(colore24);
coloriFalse.add(colore25);
coloriFalse.add(colore26);
coloriFalse.add(colore27);
coloriFalse.add(colore28);
menu1.add(Refresh);
menu1.add(Save);
menu1.add(Properties);
menu1.add(Exit);
helpmenu.add(Info);
helpmenu.add(Manuale);
helpmenu.add(Sito);

add(menu1);
add(fonti);
add(helpmenu);
	}

	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==bloccaFonte) {
		
split1();
		}
		if(e.getSource()==accetta){
		
			split2();
		}
		if(e.getSource()==rifiuta){
			prova.dispose();
			
		}
		
		
if(e.getSource()==sbloccaFonte) {
	
	split3();
			
			
		}
if(e.getSource()==accetta1) {
split4();
}

if(e.getSource()==v) {
	xc.dispose();
}
if(e.getSource()==rifiuta1) {
prova.dispose();
}
		if(e.getSource()==Refresh) {
			GUI.sett1();
			GUI.sett2();
			GUI.sett3();
			GUI.sett4();
			GUI.refresh();
			GUI.Metadata();
			 
			
			
		}
		else if(e.getSource()==Exit) {
			main.close();
		}
		else if(e.getSource()==Save) {
			split5();
			
		}
		else if(e.getSource()==colore10) {
			colore10.setIcon(Image4);
			colore11.setIcon(null);
			colore12.setIcon(null);
			colore13.setIcon(null);
			colore14.setIcon(null);
			colore15.setIcon(null);
			colore16.setIcon(null);
			colore17.setIcon(null);
			colore18.setIcon(null);
		
			
			GUI.setColor1(Color.RED);
		}
		else if(e.getSource()==colore11) {
			colore10.setIcon(null);
			colore11.setIcon(Image4);
			colore12.setIcon(null);
			colore13.setIcon(null);
			colore14.setIcon(null);
			colore15.setIcon(null);
			colore16.setIcon(null);
			colore17.setIcon(null);
			colore18.setIcon(null);
			
			GUI.setColor1(Color.BLUE);
		}
		else if(e.getSource()==colore12) {
			colore12.setIcon(Image4);
			colore10.setIcon(null);
			colore11.setIcon(null);
			colore13.setIcon(null);
			colore14.setIcon(null);
			colore15.setIcon(null);
			colore16.setIcon(null);
			colore17.setIcon(null);
			colore18.setIcon(null);
			colore20.setIcon(null);
			colore21.setIcon(null);
			colore22.setIcon(null);
			colore23.setIcon(null);
			colore24.setIcon(null);
			colore25.setIcon(null);
			colore26.setIcon(null);
			colore27.setIcon(null);
			colore28.setIcon(null);
			GUI.setColor1(Color.GREEN);
		}
		else if(e.getSource()==colore13) {
			colore13.setIcon(Image4);
			colore10.setIcon(null);
			colore11.setIcon(null);
			colore12.setIcon(null);
			colore14.setIcon(null);
			colore15.setIcon(null);
			colore16.setIcon(null);
			colore17.setIcon(null);
			colore18.setIcon(null);
			
			GUI.setColor1(Color.ORANGE);
		}
		else if(e.getSource()==colore14) {
			colore14.setIcon(Image4);
			colore10.setIcon(null);
			colore11.setIcon(null);
			colore12.setIcon(null);
			colore13.setIcon(null);
			colore15.setIcon(null);
			colore16.setIcon(null);
			colore17.setIcon(null);
			colore18.setIcon(null);
			
			GUI.setColor1(Color.YELLOW);
		}
		else if(e.getSource()==colore15) {
			colore15.setIcon(Image4);
			colore10.setIcon(null);
			colore11.setIcon(null);
			colore12.setIcon(null);
			colore13.setIcon(null);
			colore14.setIcon(null);
			colore16.setIcon(null);
			colore17.setIcon(null);
			colore18.setIcon(null);
			
			GUI.setColor1(Color.MAGENTA);
		}
		else if(e.getSource()==colore16) {
			colore16.setIcon(Image4);
			colore10.setIcon(null);
			colore11.setIcon(null);
			colore12.setIcon(null);
			colore13.setIcon(null);
			colore14.setIcon(null);
			colore15.setIcon(null);
			colore17.setIcon(null);
			colore18.setIcon(null);
			
			GUI.setColor1(Color.BLACK);
		}
		else if(e.getSource()==colore17) {
			colore17.setIcon(Image4);
			colore10.setIcon(null);
			colore11.setIcon(null);
			colore12.setIcon(null);
			colore13.setIcon(null);
			colore14.setIcon(null);
			colore15.setIcon(null);
			colore16.setIcon(null);
			colore18.setIcon(null);
			
			GUI.setColor1(Color.PINK);
		}else if(e.getSource()==colore18) {
			colore18.setIcon(Image4);
			colore10.setIcon(null);
			colore11.setIcon(null);
			colore12.setIcon(null);
			colore13.setIcon(null);
			colore14.setIcon(null);
			colore15.setIcon(null);
			colore16.setIcon(null);
			colore17.setIcon(null);
			
			GUI.setColor1(Color.GRAY);
		}
		else if(e.getSource()==colore20) {
			colore20.setIcon(Image4);
			colore21.setIcon(null);
			colore22.setIcon(null);
			colore23.setIcon(null);
			colore24.setIcon(null);
			colore25.setIcon(null);
			colore26.setIcon(null);
			colore27.setIcon(null);
			colore28.setIcon(null);
			GUI.setColor2(Color.RED);
		}
		else if(e.getSource()==colore21) {
			colore21.setIcon(Image4);
			colore20.setIcon(null);
			colore22.setIcon(null);
			colore23.setIcon(null);
			colore24.setIcon(null);
			colore25.setIcon(null);
			colore26.setIcon(null);
			colore27.setIcon(null);
			colore28.setIcon(null);
			GUI.setColor2(Color.BLUE);
		}
		else if(e.getSource()==colore22) {
			colore22.setIcon(Image4);
			colore20.setIcon(null);
			colore21.setIcon(null);
			colore23.setIcon(null);
			colore24.setIcon(null);
			colore25.setIcon(null);
			colore26.setIcon(null);
			colore27.setIcon(null);
			colore28.setIcon(null);
			GUI.setColor2(Color.GREEN);
		}
		else if(e.getSource()==colore23) {
			colore23.setIcon(Image4);
			colore20.setIcon(null);
			colore21.setIcon(null);
			colore22.setIcon(null);
			colore24.setIcon(null);
			colore25.setIcon(null);
			colore26.setIcon(null);
			colore27.setIcon(null);
			colore28.setIcon(null);
			GUI.setColor2(Color.ORANGE);
		}
		else if(e.getSource()==colore24) {
			colore24.setIcon(Image4);
			colore20.setIcon(null);
			colore21.setIcon(null);
			colore22.setIcon(null);
			colore23.setIcon(null);
			colore25.setIcon(null);
			colore26.setIcon(null);
			colore27.setIcon(null);
			colore28.setIcon(null);
			GUI.setColor2(Color.YELLOW);
		}
		else if(e.getSource()==colore25) {
			colore25.setIcon(Image4);
			colore20.setIcon(null);
			colore21.setIcon(null);
			colore22.setIcon(null);
			colore23.setIcon(null);
			colore24.setIcon(null);
			colore26.setIcon(null);
			colore27.setIcon(null);
			colore28.setIcon(null);
			GUI.setColor2(Color.MAGENTA);
		}
		else if(e.getSource()==colore26) {
			colore26.setIcon(Image4);
			colore20.setIcon(null);
			colore21.setIcon(null);
			colore22.setIcon(null);
			colore23.setIcon(null);
			colore24.setIcon(null);
			colore25.setIcon(null);
			colore27.setIcon(null);
			colore28.setIcon(null);
			GUI.setColor2(Color.BLACK);
		}
		else if(e.getSource()==colore27) {
			colore27.setIcon(Image4);
			colore20.setIcon(null);
			colore21.setIcon(null);
			colore22.setIcon(null);
			colore23.setIcon(null);
			colore24.setIcon(null);
			colore25.setIcon(null);
			colore26.setIcon(null);
			colore28.setIcon(null);
			GUI.setColor2(Color.PINK);
		}else if(e.getSource()==colore28) {
			colore28.setIcon(Image4);
			colore20.setIcon(null);
			colore21.setIcon(null);
			colore22.setIcon(null);
			colore23.setIcon(null);
			colore24.setIcon(null);
			colore25.setIcon(null);
			colore26.setIcon(null);
			colore27.setIcon(null);
			GUI.setColor2(Color.GRAY);
		}
		else if(e.getSource()==Info) {
			JFrame a=new JFrame("Info");
			a.setSize(500,200);
			a.setLocation(650, 100);
			a.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			a.setVisible(true);
			a.setLayout(new GridLayout(4,1));
			a.add(new JLabel("  Misinformation for scienze disseminator "));
			versione =new JLabel("  Versione : "+versioneprodotto);
			a.add(versione);
			a.add(new JLabel("  (c)Copyrights Misinformation contributors and other 2023,2023"));
			a.add(new JLabel("  All right reserved.Misinformation and his logo are trademark of the Plutone_project"));
			
		}
		else if(e.getSource()==Manuale) {
			JFrame a=new JFrame("Manuale");
			a.setLocation(550, 200);
			a.setSize(400,300);
			a.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			
			JTextArea b=new JTextArea(400,300);
			b.setEditable(false);
			b.setFont(new Font(cooper,Font.PLAIN,16));
			b.setText("Per poter utilizzare l'applicazione bisogna      essere in possesso di un file txt,jpg ,  fonte e    argomento della notizia che si desidera           verificare.                                                                      Inserire i dati negli appositi contenitori, per abilitare il pulsante di ricerca del file.Dopo   aver inserito il file da verificare,                         il programma  colorerà il  box bianco affianco al box nel quale avete inserito la fonte .                            -GREEN fonte verificata                                          -RED fonte non verificata                        Il programma restiruira una lista con le           fonti certificate che trattano principalemte quell'argomento e riempirà il box affianco al file selezionato con la stessa tipologia di           colori precedenti ,per affermare o negare la verifica del file selezionato.                                     E' possibile cambiare i colori di verifica         dal menu nella sezione 'Properties'.                   E' possibile bloccare o sboccare una fonte        nella sezione 'Fonti.'");
			b.setLineWrap(true);
			JScrollPane c=new JScrollPane(b);
			c.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants .VERTICAL_SCROLLBAR_ALWAYS);
			a.add(c);
			a.setVisible(true);
		}
		else if(e.getSource()==Sito) {
			Path path=Paths.get("");
		    String a=path.toAbsolutePath().toString();
			
			File file=new File(a+"\\sito.bat");
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		
	}


	public void split1() {
		prova=new JFrame("Bloccare Fonte");
		prova.setVisible(true);
		
	
		 
			prova.setSize(300,200);
			prova.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			prova.setLocation(650,200);
			zzz=new JTextArea(3,20);
			zzz.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),""));
			
			prova.setLayout(new FlowLayout());
			prova.add(new JLabel("                                                                                                                       "));
			prova.add(zzz);
			prova.add(new JLabel("                                                      "));
			
			 accetta=new JButton("Conferma");
			prova.add(new JLabel("                         "));
		     rifiuta=new JButton("Annulla");
			
			accetta.addActionListener(this);
			rifiuta.addActionListener(this);
			prova.add(accetta);
			prova.add(rifiuta);
			Path path=Paths.get("");
			String a=path.toAbsolutePath().toString();
			File file1=new File(a+"\\FontiBloccate");
			if(file1.isDirectory()) {
				
				
			}
			else {
				file1.mkdirs();
			}
			
		
	}
public void split2() {
	Path path=Paths.get("");
    String a=path.toAbsolutePath().toString();

	try {
		
		PrintWriter xx=new PrintWriter(new FileOutputStream(new File(a+"\\FontiBloccate\\FontiBloccate.txt"),true));
		
		xx.printf(zzz.getText().replaceAll("//s", "")+"\n");
		zzz.setText(" ");
		xx.close();

	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	}

	xc=new JFrame("Azione Eseguita");
      xc.setSize(400,150);
      xc.setLocation(650,300);
      xc.setLayout(new FlowLayout());
      JLabel xc1=new JLabel("Fonte bloccata con successo");
      xc1.setFont(new Font(cooper,Font.PLAIN,14));
      xc.add(new JLabel("   "));
      xc.add(xc1);
       v=new JButton ("OK");
       v.addActionListener(this);
      xc.add(new JLabel("                                                                                                                                       "));
      xc.add(v);
      xc.setVisible(true);
		
	}
public void split3() {
	 prova=new JFrame("Sbloccare Fonte");
		prova.setSize(300,200);
		prova.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		prova.setLocation(650,200);
		zzz=new JTextArea(3,20);
		zzz.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),""));
		prova.setLayout(new FlowLayout());
		prova.add(new JLabel("                                                                                                                       "));
		prova.add(zzz);
		prova.add(new JLabel("                                                      "));
		
		accetta1=new JButton("Conferma");
		prova.add(new JLabel("                         "));
	    rifiuta1=new JButton("Annulla");
		
		accetta1.addActionListener(this);
		rifiuta1.addActionListener(this);
		prova.add(accetta1);
		prova.add(rifiuta1);
		prova.setVisible(true);
}
public void split4() {
	 Path path=Paths.get("");
	    String a=path.toAbsolutePath().toString();
	Scanner scanner=null;
	PrintWriter writer=null;
	String delete=null;
	File file=null;
	File file1=null;
	int gh=0;
	try {
		
		 file=new File(a+"\\FontiBloccate\\FontiBloccate.txt");
		delete=a+"\\FontiBloccate\\FontiBloccate1.txt";
		 file1=new File(delete);
		
	if(file.exists()==false) {
		gh=2;
	}
	else {
		scanner=new Scanner(file);
		writer=new PrintWriter(file1);
		String hl=null;
		while(scanner.hasNext()) {
			hl=scanner.next();
			if(hl.equalsIgnoreCase(zzz.getText())) {
				gh=1;
			}
			else {
				writer.write(hl+"\n");
			}
			
		}
		
		
		
		}
	
		String n1="";
		String n2="";
		if(gh==0) {
			n1="Fonte non presente nella lista";
			n2="La Fonte inserita non è presente nell'elenco";
		}
		else if(gh==2) {
			n1="Empty List";
			n2="L'elenco non contine nessuna Fonte";
		}
		else {
			n1="Azione Eseguita";
			n2="La fonte è stata rimossa dalla lista con successo";
		}
		 xc=new JFrame(n1);
	      xc.setSize(400,150);
	      xc.setLocation(650,300);
	      xc.setLayout(new FlowLayout());
	      JLabel xc1=new JLabel(n2);
	      xc1.setFont(new Font(cooper,Font.PLAIN,14));
	      xc.add(new JLabel("   "));
	      xc.add(xc1);
	       v=new JButton ("OK");
	       v.addActionListener(this);
	      xc.add(new JLabel("                                                                                                                                       "));
	      xc.add(v);
	      xc.setVisible(true);
		
	
	}
	catch(Exception e44) {
		
	}
	finally {
		if(scanner!=null) {
		scanner.close();}
		if(writer!=null) {
		writer.close();}
		try {
			Files.copy(file1.toPath(), file.toPath(),StandardCopyOption.REPLACE_EXISTING);
			file1.delete();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	prova.dispose();
}
public void split5() {
	Path path=Paths.get("");
    String a=path.toAbsolutePath().toString();
	
	File file=new File(a+"\\Save");
	if(file.isDirectory()) {
		
	}
	else {
		file.mkdir();
	}
	
	try {
		
		Integer z=(Integer)(counter);
		PrintWriter xx=new PrintWriter(new File(a+"\\Save\\Save"+z.toString()+".txt"));
		counter++;
		String risultato=null;
		if(GUI.getresult()) {
			risultato=" Approvato ";
		}
		else {
			risultato=" Non approvato ";
		}
		xx.printf("Risultato verifica:"+risultato+"\nFile selezionato: "+GUI.getText3()+"\nFonti certificate che ne parlano: "+GUI.getText4()+GUI.metadatisave());
		xx.close();

	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	}
}

	
	}
