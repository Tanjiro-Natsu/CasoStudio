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
	private static  String fontebloccata="FontiBloccate"; 
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
	private JMenuItem colore101=new JMenuItem("Rosso");
	private  JMenuItem colore111=new JMenuItem("Blue");
	private JMenuItem colore121=new JMenuItem("Verde");
	private  JMenuItem colore131=new JMenuItem("Arancione");
	private JMenuItem colore141=new JMenuItem("Giallo");
	private  JMenuItem colore151=new JMenuItem("Magenta");
	private JMenuItem colore161=new JMenuItem("Nero");
	private JMenuItem colore171=new JMenuItem("Rosa");
	private JMenuItem colore181=new JMenuItem("Grigio");
	private JMenuItem colore201=new JMenuItem("Rosso");
	private JMenuItem colore211=new JMenuItem("Blue");
	private JMenuItem colore221=new JMenuItem("Verde");
	private JMenuItem colore231=new JMenuItem("Arancione");
	private JMenuItem colore241=new JMenuItem("Giallo");
	private JMenuItem colore251=new JMenuItem("Magenta");
	private JMenuItem colore261=new JMenuItem("Nero");
	private JMenuItem colore271=new JMenuItem("Rosa");
	private JMenuItem colore281=new JMenuItem("Grigio");
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
	private JMenuItem bloccaFonte1;
	private JMenuItem sbloccaFonte1;
	private JButton accetta2=null;
	private JButton accetta11=null;
	private JButton rifiuta2=null;
	private JButton rifiuta11=null;
	private JTextArea zzz1=null;
private String versioneprodotto="1.0.0";
public ImageIcon getImageIcon10() {return Image101;}
public JButton getaccetta() {return accetta2;}
public JButton getaccetta1() {return accetta11;}
public JButton getrifiuta() {return rifiuta2;}
public JButton getrifiuta1() {return rifiuta11;}

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

bloccaFonte1=new JMenuItem("Blocca Fonte");
bloccaFonte1.setIcon(Image91);
sbloccaFonte1=new JMenuItem("Sblocca Fonte");
sbloccaFonte1.setIcon(Image101);
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
colore101.addActionListener(this);
colore111.addActionListener(this);
colore121.addActionListener(this);
colore131.addActionListener(this);
colore141.addActionListener(this);
colore151.addActionListener(this);
colore161.addActionListener(this);
colore171.addActionListener(this);
colore181.addActionListener(this);
colore201.addActionListener(this);
colore211.addActionListener(this);
colore221.addActionListener(this);
colore231.addActionListener(this);
colore241.addActionListener(this);
colore251.addActionListener(this);
colore261.addActionListener(this);
colore271.addActionListener(this);
colore281.addActionListener(this);
bloccaFonte1.addActionListener(this);
sbloccaFonte1.addActionListener(this);


fonti.add(bloccaFonte1);
fonti.add(sbloccaFonte1);
Properties.add(colori);
colori.add(coloriTrue);
coloriTrue.add(colore101);
coloriTrue.add(colore111);
coloriTrue.add(colore121);
colore121.setIcon(Image41);
coloriTrue.add(colore131);
coloriTrue.add(colore141);
coloriTrue.add(colore151);
coloriTrue.add(colore161);
coloriTrue.add(colore171);
coloriTrue.add(colore181);
colori.add(coloriFalse);
coloriFalse.add(colore201);
colore201.setIcon(Image41);
coloriFalse.add(colore211);
coloriFalse.add(colore221);
coloriFalse.add(colore231);
coloriFalse.add(colore241);
coloriFalse.add(colore251);
coloriFalse.add(colore261);
coloriFalse.add(colore271);
coloriFalse.add(colore281);
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
		
		
		if(e.getSource()==bloccaFonte1) {
		
split1();
		}
		if(e.getSource()==accetta2){
		
			split2();
		}
		if(e.getSource()==rifiuta2){
			prova.dispose();
			
		}
		
		
if(e.getSource()==sbloccaFonte1) {
	
	split3();
			
			
		}
if(e.getSource()==accetta11) {
split4();
}

if(e.getSource()==v) {
	xc.dispose();
}
if(e.getSource()==rifiuta11) {
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
		else {
			sceltacolore(e);
		}
		
		
	}

private void sceltacolore(ActionEvent e ) {
	 if(e.getSource()==colore101) {
		colore101.setIcon(Image41);
		colore111.setIcon(null);
		colore121.setIcon(null);
		colore131.setIcon(null);
		colore141.setIcon(null);
		colore151.setIcon(null);
		colore161.setIcon(null);
		colore171.setIcon(null);
		colore181.setIcon(null);
	
		
		GUI.setColor1(Color.RED);
	}
	else if(e.getSource()==colore111) {
		colore101.setIcon(null);
		colore111.setIcon(Image41);
		colore121.setIcon(null);
		colore131.setIcon(null);
		colore141.setIcon(null);
		colore151.setIcon(null);
		colore161.setIcon(null);
		colore171.setIcon(null);
		colore181.setIcon(null);
		
		GUI.setColor1(Color.BLUE);
	}
	else if(e.getSource()==colore121) {
		colore121.setIcon(Image41);
		colore101.setIcon(null);
		colore111.setIcon(null);
		colore131.setIcon(null);
		colore141.setIcon(null);
		colore151.setIcon(null);
		colore161.setIcon(null);
		colore171.setIcon(null);
		colore181.setIcon(null);
		colore201.setIcon(null);
		colore211.setIcon(null);
		colore221.setIcon(null);
		colore231.setIcon(null);
		colore241.setIcon(null);
		colore251.setIcon(null);
		colore261.setIcon(null);
		colore271.setIcon(null);
		colore281.setIcon(null);
		GUI.setColor1(Color.GREEN);
	}
	else if(e.getSource()==colore131) {
		colore131.setIcon(Image41);
		colore101.setIcon(null);
		colore111.setIcon(null);
		colore121.setIcon(null);
		colore141.setIcon(null);
		colore151.setIcon(null);
		colore161.setIcon(null);
		colore171.setIcon(null);
		colore181.setIcon(null);
		
		GUI.setColor1(Color.ORANGE);
	}
	else if(e.getSource()==colore141) {
		colore141.setIcon(Image41);
		colore101.setIcon(null);
		colore111.setIcon(null);
		colore121.setIcon(null);
		colore131.setIcon(null);
		colore151.setIcon(null);
		colore161.setIcon(null);
		colore171.setIcon(null);
		colore181.setIcon(null);
		
		GUI.setColor1(Color.YELLOW);
	}
	else if(e.getSource()==colore151) {
		colore151.setIcon(Image41);
		colore101.setIcon(null);
		colore111.setIcon(null);
		colore121.setIcon(null);
		colore131.setIcon(null);
		colore141.setIcon(null);
		colore161.setIcon(null);
		colore171.setIcon(null);
		colore181.setIcon(null);
		
		GUI.setColor1(Color.MAGENTA);
	}
	else if(e.getSource()==colore161) {
		colore161.setIcon(Image41);
		colore101.setIcon(null);
		colore111.setIcon(null);
		colore121.setIcon(null);
		colore131.setIcon(null);
		colore141.setIcon(null);
		colore151.setIcon(null);
		colore171.setIcon(null);
		colore181.setIcon(null);
		
		GUI.setColor1(Color.BLACK);
	}
	else if(e.getSource()==colore171) {
		colore171.setIcon(Image41);
		colore101.setIcon(null);
		colore111.setIcon(null);
		colore121.setIcon(null);
		colore131.setIcon(null);
		colore141.setIcon(null);
		colore151.setIcon(null);
		colore161.setIcon(null);
		colore181.setIcon(null);
		
		GUI.setColor1(Color.PINK);
	}else if(e.getSource()==colore181) {
		colore181.setIcon(Image41);
		colore101.setIcon(null);
		colore111.setIcon(null);
		colore121.setIcon(null);
		colore131.setIcon(null);
		colore141.setIcon(null);
		colore151.setIcon(null);
		colore161.setIcon(null);
		colore171.setIcon(null);
		
		GUI.setColor1(Color.GRAY);
	}
	else if(e.getSource()==colore201) {
		colore201.setIcon(Image41);
		colore211.setIcon(null);
		colore221.setIcon(null);
		colore231.setIcon(null);
		colore241.setIcon(null);
		colore251.setIcon(null);
		colore261.setIcon(null);
		colore271.setIcon(null);
		colore281.setIcon(null);
		GUI.setColor2(Color.RED);
	}
	else if(e.getSource()==colore211) {
		colore211.setIcon(Image41);
		colore201.setIcon(null);
		colore221.setIcon(null);
		colore231.setIcon(null);
		colore241.setIcon(null);
		colore251.setIcon(null);
		colore261.setIcon(null);
		colore271.setIcon(null);
		colore281.setIcon(null);
		GUI.setColor2(Color.BLUE);
	}
	else if(e.getSource()==colore221) {
		colore221.setIcon(Image41);
		colore201.setIcon(null);
		colore211.setIcon(null);
		colore231.setIcon(null);
		colore241.setIcon(null);
		colore251.setIcon(null);
		colore261.setIcon(null);
		colore271.setIcon(null);
		colore281.setIcon(null);
		GUI.setColor2(Color.GREEN);
	}
	else if(e.getSource()==colore231) {
		colore231.setIcon(Image41);
		colore201.setIcon(null);
		colore211.setIcon(null);
		colore221.setIcon(null);
		colore241.setIcon(null);
		colore251.setIcon(null);
		colore261.setIcon(null);
		colore271.setIcon(null);
		colore281.setIcon(null);
		GUI.setColor2(Color.ORANGE);
	}
	else if(e.getSource()==colore241) {
		colore241.setIcon(Image41);
		colore201.setIcon(null);
		colore211.setIcon(null);
		colore221.setIcon(null);
		colore231.setIcon(null);
		colore251.setIcon(null);
		colore261.setIcon(null);
		colore271.setIcon(null);
		colore281.setIcon(null);
		GUI.setColor2(Color.YELLOW);
	}
	else if(e.getSource()==colore251) {
		colore251.setIcon(Image41);
		colore201.setIcon(null);
		colore211.setIcon(null);
		colore221.setIcon(null);
		colore231.setIcon(null);
		colore241.setIcon(null);
		colore261.setIcon(null);
		colore271.setIcon(null);
		colore281.setIcon(null);
		GUI.setColor2(Color.MAGENTA);
	}
	else if(e.getSource()==colore261) {
		colore261.setIcon(Image41);
		colore201.setIcon(null);
		colore211.setIcon(null);
		colore221.setIcon(null);
		colore231.setIcon(null);
		colore241.setIcon(null);
		colore251.setIcon(null);
		colore271.setIcon(null);
		colore281.setIcon(null);
		GUI.setColor2(Color.BLACK);
	}
	else if(e.getSource()==colore271) {
		colore271.setIcon(Image41);
		colore201.setIcon(null);
		colore211.setIcon(null);
		colore221.setIcon(null);
		colore231.setIcon(null);
		colore241.setIcon(null);
		colore251.setIcon(null);
		colore261.setIcon(null);
		colore281.setIcon(null);
		GUI.setColor2(Color.PINK);
	}else if(e.getSource()==colore281) {
		colore281.setIcon(Image41);
		colore201.setIcon(null);
		colore211.setIcon(null);
		colore221.setIcon(null);
		colore231.setIcon(null);
		colore241.setIcon(null);
		colore251.setIcon(null);
		colore261.setIcon(null);
		colore271.setIcon(null);
		GUI.setColor2(Color.GRAY);
	}
}
	public void split1() {
		prova=new JFrame("Bloccare Fonte");
		prova.setVisible(true);
		
	
		 
			prova.setSize(300,200);
			prova.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			prova.setLocation(650,200);
			zzz1=new JTextArea(3,20);
			zzz1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),""));
			
			prova.setLayout(new FlowLayout());
			prova.add(new JLabel("                                                                                                                       "));
			prova.add(zzz1);
			prova.add(new JLabel("                                                      "));
			
			 accetta2=new JButton("Conferma");
			prova.add(new JLabel("                         "));
		     rifiuta2=new JButton("Annulla");
			
			accetta2.addActionListener(this);
			rifiuta2.addActionListener(this);
			prova.add(accetta2);
			prova.add(rifiuta2);
			Path path=Paths.get("");
			String a=path.toAbsolutePath().toString();
			File file1=new File(a+separetor+fontebloccata);
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
		
		PrintWriter xx=new PrintWriter(new FileOutputStream(new File(a+separetor+fontebloccata+separetor+"FontiBloccate.txt"),true));
		
		xx.printf(zzz1.getText().replaceAll("//s", "")+"\n");
		zzz1.setText(" ");
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
		zzz1=new JTextArea(3,20);
		zzz1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),""));
		prova.setLayout(new FlowLayout());
		prova.add(new JLabel("                                                                                                                       "));
		prova.add(zzz1);
		prova.add(new JLabel("                                                      "));
		
		accetta11=new JButton("Conferma");
		prova.add(new JLabel("                         "));
	    rifiuta11=new JButton("Annulla");
		
		accetta11.addActionListener(this);
		rifiuta11.addActionListener(this);
		prova.add(accetta11);
		prova.add(rifiuta11);
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
		
		 file=new File(a+separetor+fontebloccata+separetor+"FontiBloccate.txt");
		delete=a+separetor+fontebloccata+separetor+"FontiBloccate1.txt";
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
			if(hl.equalsIgnoreCase(zzz1.getText())) {
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
