package main;

import javax.swing.JFrame;


public class Accesso extends JFrame {

	private static final long serialVersionUID = 1L;
	 
	public static String getjdbc() {
		return "jdbc:sqlserver://localhost:1433;databaseName=Plutone_Project";
	}
	public static String getUser() {
		return "sa";
	}
	public static String getPassword() {
		return "Cacca1989";
	}

	

	
	
	
	
	

}
