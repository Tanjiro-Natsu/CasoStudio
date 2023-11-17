package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat.Style;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


public class MenuSearch extends JMenuBar{
	private static JFrame n;
	private static JTextArea t=null;
    private static String s1=Font.DIALOG;
    private static String s2=Font.DIALOG_INPUT;
    private static String s3=Font.MONOSPACED;
    private static String s4=Font.SANS_SERIF;
    private static String s5=Font.SERIF;
    private int y1=Font.BOLD;
    private int y2=Font.CENTER_BASELINE;
    private int y3=Font.HANGING_BASELINE;
    private int y4=Font.ITALIC;
    private int y5=Font.LAYOUT_LEFT_TO_RIGHT;
    private int y6=Font.LAYOUT_NO_LIMIT_CONTEXT;
    private int y7=Font.LAYOUT_NO_START_CONTEXT;
    private int y8=Font.LAYOUT_RIGHT_TO_LEFT;
    private int y9=Font.PLAIN;
    private int y10=Font.ROMAN_BASELINE;
    private int y11=Font.TRUETYPE_FONT;
    private int y12=Font.TYPE1_FONT;
	private Color q1=Color.RED	;
	private Color q2=Color.GREEN;
	private Color q3=Color.BLUE;
	private Color q4=Color.YELLOW;
	private Color q5=Color.PINK;
	private Color q6=Color.WHITE;
	private Color q7=Color.BLACK;
	private Color q8=Color.GRAY;
	private Color q9=Color.ORANGE;
	private Color q10=Color.CYAN;
	private Color q11=Color.DARK_GRAY;
	private Color q12=Color.MAGENTA;
	private Color previousColor=Color.BLACK;
	private JMenuItem f1=new JMenuItem("10");
	private JMenuItem f2=new JMenuItem("12");
	private JMenuItem f3=new JMenuItem("14");
	private JMenuItem f4=new JMenuItem("16");
	private JMenuItem f5=new JMenuItem("18");
	private JMenuItem f6=new JMenuItem("20");
	private JMenuItem f7=new JMenuItem("22");
	private JMenuItem f8=new JMenuItem("26");
	private JMenuItem f9=new JMenuItem("30");
	private JMenuItem f10=new JMenuItem("34");
	private JMenuItem f11=new JMenuItem("38");
	private JMenuItem f12=new JMenuItem("40");
	private JMenuItem f13=new JMenuItem("42");
	private JMenuItem f14=new JMenuItem("44");
	private JMenuItem f15=new JMenuItem("48");
	private JMenuItem f16=new JMenuItem("50");
	private JMenuItem f17=new JMenuItem("55");
	private JMenuItem f18=new JMenuItem("60");
	public Color getq1() {return q1;}
	public Color getq2() {return q2;}
	public Color getq3() {return q3;}
	public Color getq4() {return q4;}
	public Color getq5() {return q5;}
	public Color getq6() {return q6;}
	public Color getq7() {return q7;}
	public Color getq8() {return q8;}
	public Color getq9() {return q9;}
	public Color getq10() {return q10;}
	public Color getq11() {return q11;}
	public Color getq12() {return q12;}
	public Color getq13() {return previousColor;}
	private JMenuItem Standard=new JMenuItem("Standard");
	private JMenuItem DIALOG=new JMenuItem("DIALOG");
	private JMenuItem DIALOG_INPUT=new JMenuItem("DIALOG_INPUT");
	private JMenuItem MONOSPACE=new JMenuItem("MONOSPACE");
	private JMenuItem SANS_SERIF=new JMenuItem("SANS_SERIF");
	private JMenuItem SERIF=new JMenuItem("SERIF");
	private JMenuItem y111=new JMenuItem("BOLD");
	private JMenuItem y112=new JMenuItem("CENTER_BASELINE");
	private JMenuItem y113=new JMenuItem("HANGING_BASELINE");
	private JMenuItem y114=new JMenuItem("ITALIC");
	private JMenuItem y115=new JMenuItem("LAYOUT_LEFT_TO_RIGHT");
	private JMenuItem y116=new JMenuItem("LAYOUT_NO_LIMIT_CONTEXT");
	private JMenuItem y117=new JMenuItem("LAYOUT_NO_START_CONTEXT");
	private JMenuItem y118=new JMenuItem("LAYOUT_RIGHT_TO_LEFT");
	private JMenuItem y119=new JMenuItem("PLAIN");
	private JMenuItem y120=new JMenuItem("ROMAN_BASELINE");
	private JMenuItem y121=new JMenuItem("TRUETYPE_FONT");
	private JMenuItem y122=new JMenuItem("TYPE1_FONT");
	public JMenuItem gety111() {return y111;}
	public JMenuItem gety112() {return y112;}
	public JMenuItem gety113() {return y113;}
	public JMenuItem gety114() {return y114;}
	public JMenuItem gety115() {return y115;}
	public JMenuItem gety116() {return y116;}
	public JMenuItem gety117() {return y117;}
	public JMenuItem gety118() {return y118;}
	public JMenuItem gety119() {return y119;}
	public JMenuItem gety120() {return y120;}
	public JMenuItem gety121() {return y121;}
	public JMenuItem gety122() {return y122;}
	public int gety1() {return y1;}
	public int gety2() {return y2;}
	public int gety3() {return y3;}
	public int gety4() {return y4;}
	public int gety5() {return y5;}
	public int gety6() {return y6;}
	public int gety7() {return y7;}
	public int gety8() {return y8;}
	public int gety9() {return y9;}
	public int gety10() {return y10;}
	public int gety11() {return y11;}
	public int gety12() {return y12;}
	public JMenuItem getf1() {return f1;}
	public JMenuItem getf2() {return f2;}
	public JMenuItem getf3() {return f3;}
	public JMenuItem getf4() {return f4;}
	public JMenuItem getf5() {return f5;}
	public JMenuItem getf6() {return f6;}
	public JMenuItem getf7() {return f7;}
	public JMenuItem getf8() {return f8;}
	public JMenuItem getf9() {return f9;}
	public JMenuItem getf10() {return f10;}
	public JMenuItem getf11() {return f11;}
	public JMenuItem getf12() {return f12;}
	public JMenuItem getf13() {return f13;}
	public JMenuItem getf14() {return f14;}
	public JMenuItem getf15() {return f15;}
	public JMenuItem getf16() {return f16;}
	public JMenuItem getf17() {return f17;}
	public JMenuItem getf18() {return f18;}
	private  String yo=s5;
	private  int yo1=3;
	private  int yo2=20;
	private  Font sss=new Font(yo,yo1,yo2);
	
private String  r=null;
private String r2=null;
	
	public MenuSearch(final JTextArea d) {
			final Font r=d.getFont();
			int u=r.getSize();
	    yo2=u;
		JMenu k=new JMenu("Size");
		JMenu k5=new JMenu("Save");
		JMenu k2=new JMenu("Color");
		JMenu k3=new JMenu("BackGroundColor");
		JMenu k4=new JMenu("LayoutStyle");
		JMenuItem z1=new JMenuItem("Red");
		JMenuItem z2=new JMenuItem("Green");
		JMenuItem z3=new JMenuItem("Blue");
		JMenuItem z4=new JMenuItem("Yellow");
		JMenuItem z5=new JMenuItem("Pink");
		JMenuItem z6=new JMenuItem("White");
		JMenuItem z7=new JMenuItem("Black");
		JMenuItem z8=new JMenuItem("Gray");
		JMenuItem z9=new JMenuItem("Orange");
		JMenuItem z10=new JMenuItem("Cyan");
		JMenuItem z11=new JMenuItem("Dark_Gray");
		JMenuItem z12=new JMenuItem("Magenta");
		JMenuItem z111=new JMenuItem("Red");
		JMenuItem z22=new JMenuItem("Green");
		JMenuItem z33=new JMenuItem("Blue");
		JMenuItem z44=new JMenuItem("Yellow");
		JMenuItem z55=new JMenuItem("Pink");
		JMenuItem z66=new JMenuItem("White");
		JMenuItem z77=new JMenuItem("Black");
		JMenuItem z88=new JMenuItem("Gray");
		JMenuItem z99=new JMenuItem("Orange");
		JMenuItem z101=new JMenuItem("Cyan");
		JMenuItem z110=new JMenuItem("Dark_Gray");
		JMenuItem z121=new JMenuItem("Magenta");
		JMenuItem Save=new JMenuItem("Save");
		k4.add(Standard);
		k4.add(DIALOG);
		k4.add(DIALOG_INPUT);
		k4.add(MONOSPACE);
		k4.add(SANS_SERIF);
		k4.add(SERIF);
		k4.add(y111);
		k4.add(y112);
		k4.add(y113);
		k4.add(y114);
		k4.add(y115);
		k4.add(y116);
		k4.add(y117);
		k4.add(y118);
		k4.add(y119);
		k4.add(y120);
		k4.add(y121);
		k4.add(y122);
		k2.add(z1);
		k2.add(z2);
		k2.add(z3);
		k2.add(z4);
		k2.add(z5);
		k2.add(z6);
		k2.add(z7);
		k2.add(z8);
		k2.add(z9);
		k2.add(z10);
		k2.add(z11);
		k2.add(z12);
		k3.add(z111);
		k3.add(z22);
		k3.add(z33);
		k3.add(z44);
		k3.add(z55);
		k3.add(z66);
		k3.add(z77);
		k3.add(z88);
		k3.add(z99);
		k3.add(z101);
		k3.add(z110);
		k3.add(z121);
		k.add(f1);
		k.add(f2);
		k.add(f3);
		k.add(f4);
		k.add(f5);
		k.add(f6);
		k.add(f7);
		k.add(f8);
		k.add(f9);
		k.add(f10);
		k.add(f11);
		k.add(f12);
		k.add(f13);
		k.add(f14);
		k.add(f15);
		k.add(f16);
		k.add(f17);
		k.add(f18);
		k5.add(Save);
		z111.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setBackground(q1);}});
		z22.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setBackground(q2);}});
		z33.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setBackground(q3);}});
		z44.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setBackground(q4);}});
		z55.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setBackground(q5);}});
		z66.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setBackground(q6);}});
		z77.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setBackground(q7);}});
		z88.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setBackground(q8);}});
		z99.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setBackground(q9);}});
		z101.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setBackground(q10);}});
		z110.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setBackground(q11);}});
		z121.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setBackground(q12);}});
		z1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setForeground(q1);}});
		z2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setForeground(q2);}});
		z3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setForeground(q3);}});
		z4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setForeground(q4);}});
		z5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setForeground(q5);}});
		z6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setForeground(q6);}});
		z7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setForeground(q7);}});
		z8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setForeground(q8);}});
		z9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setForeground(q9);}});
		z10.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setForeground(q10);}});
		z11.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setForeground(q11);}});
		z12.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {d.setForeground(q12);}});
		Standard.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {sss=r;d.setFont(sss);}});
		DIALOG.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo=s1;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		DIALOG_INPUT.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo=s2;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		MONOSPACE.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo=s3;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		SANS_SERIF.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo=s4;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=10;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=12;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=14;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=16;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=18;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=20;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=22;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=26;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=30;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f10.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=34;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f11.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=38;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f12.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=40;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f13.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=42;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f14.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=44;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f15.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=48;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f16.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=50;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f17.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=55;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		f18.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo2=60;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		Save.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {Save(d.getText());}});
		SERIF.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo=s5;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		y111.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo1=y1;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		y112.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo1=y2;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		y113.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo1=y3;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		y114.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo1=y4;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		y115.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo1=y5;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		y116.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo1=y6;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		y117.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo1=y7;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		y118.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo1=y8;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		y119.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo1=y9;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		y120.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo1=y10;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		y121.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo1=y11;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		y122.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {yo1=y12;sss=new Font(yo,yo1,yo2);d.setFont(sss);}});
		k.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {}});
		k4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {}});
		k2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {}});
		k3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {}});
		k4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {}});
		k5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {}});
		add(k5);
		add(k);
		add(k4);
		add(k2);
		add(k3);
		
	}
	public void Save(final String a) {
		n=new JFrame("Inserire nome file ");
		n.setSize(400,200);
		n.setLocation(500,200);
		n.setDefaultCloseOperation(n.HIDE_ON_CLOSE);
		n.setLayout(new GridLayout(5,1));
		n.add(new JLabel(""));
		t=new JTextArea();
		t.setFont(new Font("Cooper Black",Font.PLAIN,14));
		 t.setBorder(BorderFactory.createLineBorder(Color.black));
		n.add(t);
		n.add(new JLabel(""));
		JButton y1=new JButton("Ok");
		JButton y2=new JButton("Cancel");
		y1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			PrintWriter dd=null;
			try {
				dd=new PrintWriter(t.getText());
				dd.write(a);
				
			}
			catch(Exception e1) {}
			dd.close();
			n.dispose();
		}});
		y2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {t.setText("");}});
		JPanel ff=new JPanel();
		ff.setLayout(new GridLayout(1,5));
		ff.add(new JLabel(""));
		ff.add(y1);
		ff.add(new JLabel(""));
		ff.add(y2);
		ff.add(new JLabel(""));
		n.add(ff);
		n.add(new JLabel(""));
		n.setVisible(true);
		
	
	}

}
