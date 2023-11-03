package main;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
        assertTrue(a!=null);
        GUI a2=new GUI();
        assertTrue(a2!=null);
        main a3=new main();
        assertTrue(a3!=null);
        assertTrue(a3.getb()!=null);
        assertTrue(a3.getr()==false);
        assertTrue(a3.getr1()==false);
        Menu a4=new Menu();
        assertTrue(a4.getColor10()!=null);
        assertTrue(a4.getColor11()!=null);
        assertTrue(a4.getColor12()!=null);
        assertTrue(a4.getColor13()!=null);
        assertTrue(a4.getColor14()!=null);
        assertTrue(a4.getColor15()!=null);
        assertTrue(a4.getColor16()!=null);
        assertTrue(a4.getColor17()!=null);
        assertTrue(a4.getColor18()!=null);
        assertTrue(a4.getColor20()!=null);
        assertTrue(a4.getColor21()!=null);
        assertTrue(a4.getColor22()!=null);
        assertTrue(a4.getColor23()!=null);
        assertTrue(a4.getColor24()!=null);
        assertTrue(a4.getColor25()!=null);
        assertTrue(a4.getColor26()!=null);
        assertTrue(a4.getColor27()!=null);
        assertTrue(a4.getColor28()!=null);
        Menu2 a5=new Menu2();
        assertTrue(a5.getColor10()!=null);
        assertTrue(a5.getColor11()!=null);
        assertTrue(a5.getColor12()!=null);
        assertTrue(a5.getColor13()!=null);
        assertTrue(a5.getColor14()!=null);
        assertTrue(a5.getColor15()!=null);
        assertTrue(a5.getColor16()!=null);
        assertTrue(a5.getColor17()!=null);
        assertTrue(a5.getColor18()!=null);
        assertTrue(a5.getColor20()!=null);
        assertTrue(a5.getColor21()!=null);
        assertTrue(a5.getColor22()!=null);
        assertTrue(a5.getColor23()!=null);
        assertTrue(a5.getColor24()!=null);
        assertTrue(a5.getColor25()!=null);
        assertTrue(a5.getColor26()!=null);
        assertTrue(a5.getColor27()!=null);
        assertTrue(a5.getColor28()!=null);
       
        
        
       
        
        
        
        
}

}
