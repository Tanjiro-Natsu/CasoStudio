package main;


import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class main {
	
	 private static JFrame d;private static JFrame b;
	 public static  GUI a=null;
	 
	public static void close() {
		a.dispose();
	}
	public JFrame getb(){return b;}

	

	
    public main() {
    	b=new JFrame("Scelta Utente");
    	b.setSize(300,280);
    	b.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
    	left.addActionListener(e-> {
    		if(e.getActionCommand().equals("Checker")) {
    			b.dispose();
    			new GUI2().setVisible(true);
    			
    		}
    	});
    	right.addActionListener(e-> {
    		if(e.getActionCommand().equals("Ceo")) {
    			 d=new JFrame("Password");
    			d.setSize(300,100);
    	    	d.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    	    	d.setLayout(new GridLayout(2,1));
    	    	d.setLocation(850, 300);
    	    	d.add(new JLabel("                    Inserire la password "));
    	    	JPanel fa=new JPanel();
    	    	fa.setLayout(new GridLayout(1,2));
    	    	final JTextField w=new JTextField(50);
    	    	fa.add(w);
    	    	JButton q=new JButton("Ok");
    	    	fa.add(q);
    	    	d.add(fa);
    	    	q.addActionListener(ee-> {if(ee.getActionCommand().equals("Ok")) {
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
    	    	    	d1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    	    	    d1.add(new JLabel("Password Errata"));
    	    	    	d1.setLocation(650, 300);
    	    			d1.setVisible(true);
    	    		}
    	    	}});
    	    	d.setVisible(true);

    			
    		}
    	});
    	
    	i.add(right);
    	i.add(left);
    	f.add(left);
    	f.add(right);
    	b.add(s);
    	b.add(f);
    	b.setVisible(true);
    }
    }