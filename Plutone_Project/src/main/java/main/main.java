package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class main {
	
	
	static public Accesso b=null;
	static public GUI a=null;
	static private boolean r=false;
	static private boolean r1=false;
	
	public static void close() {
		a.dispose();
	}
	
    public static void main(String [] args) {
       // windows a=new windows();

    	final JFrame b=new JFrame("Scelta Utente");
    	b.setSize(300,280);
    	b.setDefaultCloseOperation(b.EXIT_ON_CLOSE);
    	b.setLayout(new GridLayout(2,1));
    	b.setLocation(650, 200);
    	JLabel s=new JLabel("                    Chi deve usare il sistema?");
    	s.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),"  "));
    	JPanel f=new JPanel();
    	f.setLayout(new GridLayout(1,2));
    	f.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),"   "));
    	ButtonGroup i=new ButtonGroup();
    	JRadioButton left=new JRadioButton("Checker");
    	JRadioButton right=new JRadioButton("Ceo");
    	left.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
    		if(e.getActionCommand().equals("Checker")) {
    			b.dispose();
    			a=new GUI();
    			a.getMenu().getjMenu().disable();
    	    	a.setVisible(true);
    			
    		}
    	}});
    	right.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
    		if(e.getActionCommand().equals("Ceo")) {
    			final JFrame d=new JFrame("Password");
    			d.setSize(300,100);
    	    	d.setDefaultCloseOperation(b.EXIT_ON_CLOSE);
    	    	d.setLayout(new GridLayout(2,1));
    	    	d.setLocation(850, 300);
    	    	d.add(new JLabel("                    Inserire la password "));
    	    	JPanel f=new JPanel();
    	    	f.setLayout(new GridLayout(1,2));
    	    	final JTextField w=new JTextField(50);
    	    	f.add(w);
    	    	JButton q=new JButton("Ok");
    	    	f.add(q);
    	    	d.add(f);
    	    	q.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {if(e.getActionCommand().equals("Ok")) {
    	    	String g=w.getText();
    	    		g=g.replaceAll("^\\s+","");
    	    		if(g.equals("Password")) {
    	    			b.dispose();
    	    			d.dispose();
    	    			a=new GUI();
    	    	    	a.setVisible(true);
    	    	    	
    	    		}
    	    		else {
    	    			JFrame d1=new JFrame("Password Errata");
    	    			d.dispose();
    	    			d1.setSize(400,100);
    	    	    	d1.setDefaultCloseOperation(b.DISPOSE_ON_CLOSE);
    	    	    d1.add(new JLabel("Password Errata"));
    	    	    	d1.setLocation(650, 300);
    	    			d1.setVisible(true);
    	    		}
    	    	}}});
    	    	d.setVisible(true);

    			
    		}
    	}});
    	
    	i.add(right);
    	i.add(left);
    	f.add(left);
    	f.add(right);
    	b.add(s);
    	b.add(f);
    	b.setVisible(true);
    	
    	
    	
    	
    	//a=new GUI();
    	//a.setVisible(true);
    	
    	
    	
      
       
    	
    
     
   
    }

	
    
	
	

    }