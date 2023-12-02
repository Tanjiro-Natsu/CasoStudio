package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

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
		String ret=null;
		try {
			Scanner a=new Scanner(new BufferedReader(new FileReader("Password.txt")));
			ret=a.nextLine();
		}
		catch(Exception e) {}
		return ret;
	}

	

	
	
	
	
	

}
