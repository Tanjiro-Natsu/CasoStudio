package main;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.commons.io.FilenameUtils;
public class Reader {
	static File o=null;
	static  String rty;
	private static String g="";
	public static void writer(final JTextPane j) {
	String separetor=File.separator;	
		
		final JFrame t=new JFrame("Selezione nome file");
		t.setSize(300,280);
    	t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    	t.setLayout(new GridLayout(6,1));
    	t.setLocation(650, 200);
    	t.setVisible(true);
    	t.add(new JLabel(""));
    	 final JTextField aq=new JTextField();
    	t.add(aq);
    	t.add(new JLabel(""));
    	t.add(new JLabel(""));
    	 JPanel fg=new JPanel();
    	 fg.setLayout(new GridLayout(1,2));
    	 JButton ok=new JButton("Ok");
    	 JButton cancel =new JButton("Cancel");
    	 Path path=Paths.get("");
  	    final String v=path.toAbsolutePath().normalize().toString();
    	 fg.add(ok);
    	 fg.add(cancel);
    	 t.add(fg);
    	 t.add(new JLabel());
    	 ok.addActionListener(e->{if(e.getActionCommand().equals("Ok")) {rty=aq.getText();t.dispose();rty=v+separetor+rty;PrintWriter xx=null;try {	
 			String path11=FilenameUtils.normalize(rty);
 			xx=new PrintWriter(new File(path11));
 			xx.write(j.getText());
 			xx.close();
 		}
 		catch(IOException e1){System.out.println(e1.getMessage());}}});
    	 cancel.addActionListener(e-> {if(e.getActionCommand().equals("Cancel")) {aq.setText("");}});
    	
    	    
		
	}
	public static File chooser(JPanel a) {
		JFileChooser chooser1=new JFileChooser("C:\\");   
		  FileNameExtensionFilter filter1=new FileNameExtensionFilter("Text","txt");
		  chooser1.setFileFilter(filter1);
         int returnVal1=chooser1.showOpenDialog(a);
        if(returnVal1==JFileChooser.APPROVE_OPTION){System.out.println("approved");}
		return chooser1.getSelectedFile();
	}
	
	public static String reader(String z) {
		
		try (Scanner b=new Scanner(new BufferedReader(new FileReader(z)));){
			
			int t=0;
			while(b.hasNext()){
				
				if(t==0) {
					g=b.nextLine();
				}
				else {
					g=new StringBuilder().append(g).append(" ").append(b.nextLine()).toString();
				}
				
				t++;
			}
			b.close();
		}
		
		
		catch(Exception  e) {System.out.println(e.getMessage());}
		
		
		return g;
	}
	

}
