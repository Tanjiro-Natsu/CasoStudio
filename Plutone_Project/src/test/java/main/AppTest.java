package main;



import java.util.ArrayList;



import junit.framework.TestCase;

public class AppTest extends TestCase {
	ArrayList<String> txt=new ArrayList<String>();
	ArrayList<String> image=new ArrayList<String>();
	
	
public void test()
{
	
	assertTrue("ok".equals("ok"));

        assertTrue(!Accesso.getjdbc().isBlank());
       assertTrue(!Accesso.getjdbc().isEmpty());
        assertTrue(Accesso.getjdbc().equals("jdbc:sqlserver://localhost:1433;databaseName=Plutone_Project"));

        assertTrue(!Accesso.getUser().isBlank());
        assertTrue(!Accesso.getUser().isEmpty());
        assertTrue(Accesso.getUser().equals("sa"));

        assertTrue(!Accesso.getPassword().isBlank());
        assertTrue(!Accesso.getPassword().isEmpty());
        assertTrue(Accesso.getPassword().equals("Cacca1989"));
        GUI a=new GUI();
        assertNotNull(a);
        GUI a2=new GUI();
        assertNotNull(a2);
        main a3=new main();
        assertNotNull(a3);
        assertNotNull(a3.getb());
       
        
        
        Menu2 a5=new Menu2();
        assertNotNull(a5.getColor10());
       
       
        
        
       
        
        
        
        
}

}
