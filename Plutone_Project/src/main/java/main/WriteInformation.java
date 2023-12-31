package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class WriteInformation extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextPane area=new JTextPane();
	public JTextPane setColorForeground() {return area;}
	
	public WriteInformation() {
		setTitle("Writer");
		setSize(800,600);
		  this.setLocation(350,100);
		setLayout(new BorderLayout());
		final JPanel s=new JPanel();
		s.setLayout(new GridLayout(1,4));
		JButton save=new JButton("Save");
		JButton imp=new JButton("Import");
		save.addActionListener(e-> {if(e.getActionCommand().equals("Save")) {Reader.writer(area);}});
		imp.addActionListener(e-> {if(e.getActionCommand().equals("Import")) {String h=Reader.reader(Reader.chooser(s).getAbsolutePath());
		area.setText(h);}});
		s.add(new JLabel());
		s.add(imp);
		s.add(save);
		s.add(new JLabel());
		add(s,BorderLayout.SOUTH);
		JPanel h=new JPanel();
		setJMenuBar(new MenuWriter(area));
		h.setLayout(new GridLayout(3,1));
		h.add(new JLabel("    "));
		h.add(new JLabel("    "));
		h.add(new JLabel("    "));
		add(h,BorderLayout.NORTH);
		add(new JLabel("             "),BorderLayout.WEST);
		add(new JLabel("             "),BorderLayout.EAST);
		area.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black),""));
		JScrollPane scrollPane = new JScrollPane(area);
		add(scrollPane,BorderLayout.CENTER);
		setVisible(true);
	}

}
