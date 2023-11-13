package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MetaData extends JFrame{
	private transient Path d=null;
	private JLabel a1=null;
	private JLabel a2=null;
	private JLabel a3=null;
	private JLabel a4=null;
	private JLabel a5=null;
	private JLabel a6=null;
	private JLabel a7=null;
	private JLabel a8=null;
	private JLabel a9=null;
	private String cooper="Cooper Black";
public JLabel geta1() {return a1;}
public JLabel geta2() {return a2;}
public JLabel geta3() {return a3;}
public JLabel geta4() {return a4;}
public JLabel geta5() {return a5;}
public JLabel geta6() {return a6;}
public JLabel geta7() {return a7;}
public JLabel geta8() {return a8;}
public JLabel geta9() {return a9;}
	public String toString() {
		return "\nPath:"+d+"\nCreationTime:"+a1.getText()+"\nLastAccessTime:"+a2.getText()+"\nLastModifiedTime:"+a3.getText()+"\nIsDirectory:"+a4.getText()+"\nisOther:"+a5.getText()+"\nisRegularFile:"+a6.getText()+"\nisSymbolicLink:"+a7.getText()+"\nSize:"+a8.getText();
	}
	public MetaData(Path a) {
		d=a;
		BasicFileAttributes s=null;
		try {
			 s=Files.readAttributes(a,BasicFileAttributes.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setSize(500,400);
		setLocation(63,350);
		setTitle(a.getFileName().toString());
		setLayout(new GridLayout(9,2));
		JLabel j9=new JLabel("  Path");
		JLabel j1=new JLabel("  CreationTime");
		JLabel j2=new JLabel("  LastAccessTime");
		JLabel j3=new JLabel("  LastModifiedTime");
		JLabel j4=new JLabel("  isDirectory");
		JLabel j5=new JLabel("  isOther");
		JLabel j6=new JLabel("  isRegularFile");
		JLabel j7=new JLabel("  isSymbolicLink");
		JLabel j8=new JLabel("  Size");
		j9.setFont(new Font(cooper,Font.PLAIN,14));
		j1.setFont(new Font(cooper,Font.PLAIN,14));
		j2.setFont(new Font(cooper,Font.PLAIN,14));
		j3.setFont(new Font(cooper,Font.PLAIN,14));
		j4.setFont(new Font(cooper,Font.PLAIN,14));
		j5.setFont(new Font(cooper,Font.PLAIN,14));
		j6.setFont(new Font(cooper,Font.PLAIN,14));
		j7.setFont(new Font(cooper,Font.PLAIN,14));
		j8.setFont(new Font(cooper,Font.PLAIN,14));
		 a1=new JLabel();
		 a2=new JLabel();
		 a3=new JLabel();
		 a4=new JLabel();
		 a5=new JLabel();
		 a6=new JLabel();
		 a7=new JLabel();
		 a8=new JLabel();
		 a9=new JLabel();
	
	a9.setText(a.toString());
	a1.setText(s.creationTime().toString());
	a2.setText(s.lastAccessTime().toString());
	a3.setText(s.lastModifiedTime().toString());
	a4.setText(String.valueOf(s.isDirectory()));
	a5.setText(String.valueOf(s.isOther()));
	a6.setText(String.valueOf(s.isRegularFile()));
	a7.setText(String.valueOf(s.isSymbolicLink()));
	a8.setText(Long.toString(s.size())+" bytes");
	
	
	add(new JLabel(""));
	add(new JLabel(""));
	add(j9);
	add(a9);
	add(new JLabel(""));
	add(new JLabel(""));
		add(j1);
		add(a1);
		add(new JLabel(""));
		add(new JLabel(""));
		add(j2);
		add(a2);
		add(new JLabel(""));
		add(new JLabel(""));
		add(j3);
		add(a3);
		add(new JLabel(""));
		add(new JLabel(""));
		
		setVisible(true);
	}

}
