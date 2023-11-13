package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.annotation.processing.FilerException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Reader {
	static File o=null;
	static  String rty;
	private static String g="";
	public static void writer(final JTextPane j) {
		
		
		final JFrame t=new JFrame("Selezione nome file");
		t.setSize(300,280);
    	t.setDefaultCloseOperation(t.EXIT_ON_CLOSE);
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
 	    final String v=path.toAbsolutePath().toString();
    	 fg.add(ok);
    	 fg.add(cancel);
    	 t.add(fg);
    	 t.add(new JLabel());
    	 ok.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(e.getActionCommand().equals("Ok")) {rty=aq.getText();t.dispose();rty=v+"\\"+rty;PrintWriter xx=null;try {	
 			System.out.println(rty);
 			xx=new PrintWriter(new File(rty) );
 			xx.write(j.getText());
 			xx.close();
 		}
 		catch(IOException e1){}}}});
    	 cancel.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(e.getActionCommand().equals("Cancel")) {aq.setText("");}}});
    	
    	    
		
	}
	public static File chooser(JPanel a) {
		JFileChooser chooser1=new JFileChooser("C:\\");   
		  FileNameExtensionFilter filter1=new FileNameExtensionFilter("Text","txt");
		  chooser1.setFileFilter(filter1);
        int returnVal1=chooser1.showOpenDialog(a);
        if(returnVal1==JFileChooser.APPROVE_OPTION){}
		return chooser1.getSelectedFile();
	}
	public static String reader(String z) {
		Scanner b=null;
		
		System.out.println(z);
		try {
			b=new Scanner(new BufferedReader(new FileReader(z))); 
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch(Exception  e) {System.out.println(e.getMessage());}
		int t=0;
		while(b.hasNext()){
			
			if(t==0) {
				g=b.nextLine();
			}
			else {
				g=g+" "+b.nextLine();
			}
			
			t++;
		}
		
		b.close();
		return g;
	}
	public static void main(String [] args) {
		JFrame k=new JFrame();
	JButton h=new JButton("Ciao");
	k.setDefaultCloseOperation(k.EXIT_ON_CLOSE);
	final JPanel d=new JPanel();
	d.add(h);
	k.add(d);
	k.setSize(400,400);
	k.setVisible(true);
	
	h.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(e.getActionCommand().equals("Ciao")) {o=Reader.chooser(d);Reader.reader(o.getAbsolutePath());}}});
	
	}

}
