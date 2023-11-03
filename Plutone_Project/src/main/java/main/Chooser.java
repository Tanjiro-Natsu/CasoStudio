package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Chooser extends JFrame{
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
    	Search.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
	 if(e.getActionCommand().equals("Search Information")) {dispose();Search a =new Search();}
 }
    	});
    	Write.addActionListener(new ActionListener() {
    		 public void actionPerformed(ActionEvent e) {
    			 if(e.getActionCommand().equals("Write Information")) {
    				 dispose();
    				 WriteInformation a=new WriteInformation();
    			 }
    		 }
    		    	});
    	Check.addActionListener(new ActionListener() {
    		 public void actionPerformed(ActionEvent e) {
    			 if(e.getActionCommand().equals("Check Information")) {
    				 dispose();
    				 main a=new main();
    			 }
    		 }
    		    	});
    	
    	i.add(Check);
    	i.add(Write);
    	i.add(Search);
add(Check);
add(Write);
add(Search);
setVisible(true);
    	
	}
	public static void main(String[] args) {
		Chooser a=new Chooser();
	}

}
