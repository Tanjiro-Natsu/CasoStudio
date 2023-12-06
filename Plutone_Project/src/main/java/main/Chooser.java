package main;

import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Chooser extends JFrame{
	
	private static final long serialVersionUID = 1L;
	public Chooser() {
		setTitle("Choose Action");
		setSize(300,280);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setLayout(new GridLayout(3,1));
    	setLocation(650, 200);
    	ButtonGroup i=new ButtonGroup();
    	JRadioButton Search=new JRadioButton("Search Information");
    	JRadioButton Write=new JRadioButton("Write Information");
    	JRadioButton Check=new JRadioButton("Check Information");
    	Search.addActionListener( e-> {if(e.getActionCommand().equals("Search Information")) {dispose();new Search();}});
    		    	Write.addActionListener(e->{if(e.getActionCommand().equals("Write Information")) {dispose();new WriteInformation();}});
    		    	Check.addActionListener(e-> {{if(e.getActionCommand().equals("Check Information")) {dispose();new main();}}});
    	
    	i.add(Check);
    	i.add(Write);
    	i.add(Search);
add(Check);
add(Write);
add(Search);
setVisible(true);
    	
	}
	public static void main(String[] args) {
		new Chooser();
	}}


