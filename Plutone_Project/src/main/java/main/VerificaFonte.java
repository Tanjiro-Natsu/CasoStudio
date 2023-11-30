package main;
import java.sql.*;
public class VerificaFonte {
	private static String sqldriverString="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String encrypt=";encrypt=false";
	private static int y=0;
	public static  int databaseconfermation() {
		return y;
	}
	public static byte[] databasetxt()  {
		
		y=0;
		 ResultSet k=null;
		 String query=null;
		 byte[] m=null;
		try {
		 Class.forName(sqldriverString);
		 
          String sqlUser = Accesso.getUser();
          String sqlPassword = Accesso.getPassword();
          String connectionUrl=new StringBuilder().append(Accesso.getjdbc()).append(encrypt).toString();
      

          
         
          Connection conn = DriverManager.getConnection(connectionUrl, sqlUser, sqlPassword);
         	 query="SELECT * FROM Testo WHERE name =any(SELECT T.name FROM News AS n JOIN Testo as T on T.stream_id=n.Stream_File  WHERE n.Argomento=?);";
         	PreparedStatement stmt=conn.prepareStatement(query);
         	stmt.setString(1, GUI.getargomento());
         	 k=stmt.executeQuery(query);
       	 if(k.next()==false){
       		 y=1;
       	 }
       	 else {
       	m= k.getBytes(2);}
       	 conn.close();
       	 stmt.close();
          
		}
		catch (Exception j) {
			j.printStackTrace();
		}
			
		
			
	
return m;
	}
	public static double databasejpg(String a)  {
		 
		y=0;
		 ResultSet k=null;
		 String query=null;
		double m=0;
		try {
		 Class.forName(sqldriverString);
		 
          String sqlUser = Accesso.getUser();
          String sqlPassword = Accesso.getPassword();
          String connectionUrl =new StringBuilder().append(Accesso.getjdbc()).append(encrypt).toString();
         

          
         
          Connection conn = DriverManager.getConnection(connectionUrl, sqlUser, sqlPassword);
          
         
        	 query="SELECT * FROM IMMAGINI WHERE name =any(SELECT I.name FROM News AS n JOIN IMMAGINI as I on I.stream_id=n.Stream_File  WHERE n.Argomento=?);"; 
        	 java.sql.PreparedStatement stmt=conn.prepareStatement(query);
        	 stmt.setString(1, GUI.getargomento());
        	 k=stmt.executeQuery();
        	 int f=0;
        	
        	 
     while(k.next()) {
    	 f++;
    	 
    	
    	 m=VerificaImmagine.imagec(a, k.getBytes(2));
    	 if(m==0) {
    		 break;
    	 }
    	 
     }
     if(f==0) {return 1.0;}
     stmt.close();
     conn.close();
   	 
       
		}
	
		catch(Exception e) {
			e.printStackTrace();
		}
			
		
			
	
return m;
        	 
          
	}
	
	
	public  static String fonteverificata(String a)  {
		  
		
		 
        String sqlUser = Accesso.getUser();
        String sqlPassword = Accesso.getPassword();
        String connectionUrl = new StringBuilder().append(Accesso.getjdbc()).append(encrypt).toString();
        ResultSet k=null;
		 String query=null;
        String result=null;
        
        
		try {
			Class.forName(sqldriverString);
	
	


        Connection conn = DriverManager.getConnection(connectionUrl, sqlUser, sqlPassword);
        
          
        query="SELECT Fonte FROM Attendibilità WHERE  Argomento=? and Attendibilità='yes';";
        java.sql.PreparedStatement stmt =conn.prepareStatement(query) ;
        stmt.setString(1, a);
        k=stmt.executeQuery();
        
        
        int f=0;
        while(k.next()){
        	if(f==0) {
        		result=k.getString(1);
        		f++;
        	}
        	else {
        		result=new StringBuilder().append(result).append(" ").append(k.getString(1)).toString();
        	}
        	f++;
        	
        	
        }
        
        conn.close();
      	 stmt.close();
		}
		catch (Exception d) {
			d.printStackTrace();
		}
       

		return result;
		
		
	}
	
}
