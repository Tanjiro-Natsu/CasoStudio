package main;
import java.sql.*;
public class VerificaFonte {
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
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		 
          String sqlUser = Accesso.getUser();
          String sqlPassword = Accesso.getPassword(); //passwrod sa account
          String connectionUrl =Accesso.getjdbc()+";encrypt=false";
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

          
         
          Connection conn = DriverManager.getConnection(connectionUrl, sqlUser, sqlPassword);
          Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
			
         
         
         
         	 query="SELECT * FROM Testo WHERE name =any(SELECT T.name FROM News AS n JOIN Testo as T on T.stream_id=n.Stream_File  WHERE n.Argomento='"+GUI.getargomento()+"');";
         	k=stmt.executeQuery(query);
       	 if(k.next()==false){
       		 y=1;
       	 }
       	 else {
       	m= k.getBytes(2);}
          
		}
	
		catch( SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException j) {
			j.printStackTrace();
		}
			
		
			
	
return m;
	}
	public static double databasejpg(String a)  {
		 System.out.println(GUI.getargomento());
		y=0;
		 ResultSet k=null;
		 ResultSet k1=null;
		 String query=null;
		double m=0;
		try {
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		 
          String sqlUser = Accesso.getUser();
          String sqlPassword = Accesso.getPassword(); //passwrod sa account
          String connectionUrl = Accesso.getjdbc()+";encrypt=false";
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

          
         
          Connection conn = DriverManager.getConnection(connectionUrl, sqlUser, sqlPassword);
          Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
         
        	 query="SELECT * FROM IMMAGINI WHERE name =any(SELECT I.name FROM News AS n JOIN IMMAGINI as I on I.stream_id=n.Stream_File  WHERE n.Argomento='"+GUI.getargomento()+"');"; 
        	 k=stmt.executeQuery(query);
        	 int f=0;
        	
        	 
     while(k.next()) {
    	 f++;
    	 
    	
    	 m=VerificaImmagine.imagec(a, k.getBytes(2));
    	 if(m==0) {
    		 break;
    	 }
    	 
     }
     if(f==0) {return 1.0;}
       
		}
		catch( SQLException e) {
			
		}
		catch (ClassNotFoundException j) {
			
		}
			
		
			
	
return m;
        	 
          
	}
	
	
	public  static String fonteverificata(String a)  {
		  
		
		 
        String sqlUser = Accesso.getUser();
        String sqlPassword = Accesso.getPassword(); //passwrod sa account
        String connectionUrl = Accesso.getjdbc()+";encrypt=false";
        ResultSet k=null;
		 String query=null;
        String result=" ";
        
        
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	
	


        Connection conn = DriverManager.getConnection(connectionUrl, sqlUser, sqlPassword);
        Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
          
        query="SELECT Fonte FROM Attendibilità WHERE  Argomento='"+a+"' and Attendibilità='yes';";
        k=stmt.executeQuery(query);
        
        
        int f=0;
        while(k.next()){
        	if(f==0) {
        		result=k.getString(1);
        	}
        	else {
        		result=result+" "+k.getString(1);
        	}
        	f++;
        	
        }
        
        
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException d) {
			d.printStackTrace();
		}
       
    
		return result;
		
		
	}
	
}
