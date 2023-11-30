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
	private static String separetor=File.separator;
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
	private ImageIcon Image11=null;
	private ImageIcon Image21=null;
	private ImageIcon Image31=null;
	private ImageIcon Image41=null;
	private ImageIcon Image51=null;
	private ImageIcon Image61=null;
	private ImageIcon Image71=null;
	private ImageIcon Image81=null;
	private ImageIcon Image91=null;
	private ImageIcon Image101=null;
	private JMenuItem bloccaFonte;
	private JMenuItem sbloccaFonte;
	private JButton accetta=null;
	private JButton accetta1=null;
	private JButton rifiuta=null;
	private JButton rifiuta1=null;
	private JTextArea zzz=null;
private String versioneprodotto="1.0.0";
public ImageIcon getImageIcon10() {return Image101;}
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
   
    Image11=new ImageIcon(ImageIO.read(new File(a+separetor+"Icon"+separetor+"Refresh.png")));
	 Image21=new ImageIcon(ImageIO.read(new File(a+separetor+"Icon"+separetor+"i.png")));
	 Image31=new ImageIcon(ImageIO.read(new File(a+separetor+"Icon"+separetor+"save.png")));
	 Image41=new ImageIcon(ImageIO.read(new File(a+separetor+"Icon"+separetor+"check.png")));
	 Image51=new ImageIcon(ImageIO.read(new File(a+separetor+"Icon"+separetor+"exit.png")));
	 Image61=new ImageIcon(ImageIO.read(new File(a+separetor+"Icon"+separetor+"info.png")));
	 Image71=new ImageIcon(ImageIO.read(new File(a+separetor+"Icon"+separetor+"manuale.png")));
	 Image81=new ImageIcon(ImageIO.read(new File(a+separetor+"Icon"+separetor+"web.png")));
	 Image91=new ImageIcon(ImageIO.read(new File(a+separetor+"Icon"+separetor+"lock.png")));
	 Image101=new ImageIcon(ImageIO.read(new File(a+separetor+"Icon"+separetor+"unlock.png")));
	
	
	
} catch (IOException e){
	e.printStackTrace();
}

bloccaFonte=new JMenuItem("Blocca Fonte");
bloccaFonte.setIcon(Image91);
sbloccaFonte=new JMenuItem("Sblocca Fonte");
sbloccaFonte.setIcon(Image101);
menu1=new JMenu("File");
fonti=new JMenu("Fonti");
helpmenu=new JMenu("Help");
Refresh=new JMenuItem("Refresh");
Refresh.setIcon(Image11);
Save=new JMenuItem("Save");
Save.setIcon(Image31);
Properties=new JMenu("Properties");
Properties.setIcon(Image21);
Exit=new JMenuItem("Exit");
Exit.setIcon(Image51);
Info=new JMenuItem("Info");
Info.setIcon(Image61);
Manuale=new JMenuItem("Manuale");
Manuale.setIcon(Image71);
Sito=new JMenuItem("Sito");
Sito.setIcon(Image81);
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
colore12.setIcon(Image41);
coloriTrue.add(colore13);
coloriTrue.add(colore14);
coloriTrue.add(colore15);
coloriTrue.add(colore16);
coloriTrue.add(colore17);
coloriTrue.add(colore18);
colori.add(coloriFalse);
coloriFalse.add(colore20);
colore20.setIcon(Image41);
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
			colore10.setIcon(Image41);
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
			colore11.setIcon(Image41);
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
			colore12.setIcon(Image41);
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
			colore13.setIcon(Image41);
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
			colore14.setIcon(Image41);
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
			colore15.setIcon(Image41);
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
			colore16.setIcon(Image41);
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
			colore17.setIcon(Image41);
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
			colore18.setIcon(Image41);
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
			colore20.setIcon(Image41);
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
			colore21.setIcon(Image41);
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
			colore22.setIcon(Image41);
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
			colore23.setIcon(Image41);
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
			colore24.setIcon(Image41);
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
			colore25.setIcon(Image41);
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
			colore26.setIcon(Image41);
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
			colore27.setIcon(Image41);
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
			colore28.setIcon(Image41);
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
			
			File file=new File(a+separetor+"sito.bat");
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
			File file1=new File(a+separetor+"FontiBloccate");
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
		
		PrintWriter xx=new PrintWriter(new FileOutputStream(new File(a+separetor+"FontiBloccate"+separetor+"FontiBloccate.txt"),true));
		
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
		
		 file=new File(a+separetor+"FontiBloccate"+separetor+"FontiBloccate.txt");
		delete=a+separetor+"FontiBloccate"+separetor+"FontiBloccate1.txt";
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
	
	File file=new File(a+separetor+"Save");
	if(file.isDirectory()) {
		
	}
	else {
		file.mkdir();
	}
	
	try {
		
		Integer z=(Integer)(counter);
		PrintWriter xx=new PrintWriter(new File(a+separetor+"Save"+separetor+"Save"+z.toString()+".txt"));
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
