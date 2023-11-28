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
          String sqlPassword = Accesso.getPassword(); //passwrod sa account
          String connectionUrl =Accesso.getjdbc()+encrypt;
      

          
         
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
		 
		y=0;
		 ResultSet k=null;
		 String query=null;
		double m=0;
		try {
		 Class.forName(sqldriverString);
		 
          String sqlUser = Accesso.getUser();
          String sqlPassword = Accesso.getPassword(); //passwrod sa account
          String connectionUrl = Accesso.getjdbc()+encrypt;
         

          
         
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
	
		catch(Exception e) {
			e.printStackTrace();
		}
			
		
			
	
return m;
        	 
          
	}
	
	
	public  static String fonteverificata(String a)  {
		  
		
		 
        String sqlUser = Accesso.getUser();
        String sqlPassword = Accesso.getPassword(); //passwrod sa account
        String connectionUrl = Accesso.getjdbc()+encrypt;
        ResultSet k=null;
		 String query=null;
        String result=null;
        
        
		try {
			Class.forName(sqldriverString);
	
	


        Connection conn = DriverManager.getConnection(connectionUrl, sqlUser, sqlPassword);
        Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
          
        query="SELECT Fonte FROM Attendibilità WHERE  Argomento='"+a+"' and Attendibilità='yes';";
        k=stmt.executeQuery(query);
        
        
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
        	
        	stmt.close();
        }
        
        
		}
		catch (Exception d) {
			d.printStackTrace();
		}
       

		return result;
		
		
	}
	
}
