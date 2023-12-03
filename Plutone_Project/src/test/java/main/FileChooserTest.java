package main;


import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FileChooserTest {
	ArrayList<String> txt=new ArrayList<String>();
	ArrayList<String> image=new ArrayList<String>();
	FileChooser a;
	@BeforeEach
	public void CreateFileChooser() {
		a=new FileChooser(txt,image);
	}
	@Test
	public void FileChooserTest() {
		assertTrue(a!=null);
	}
	public void setimgTest() {
		
	}
	@Test
	public void getkTest() {
		assertTrue(a.getk()!=null);
	}
	public void getk1Test() {
		assertTrue(a.getk1()!=null);
	}
	@ParameterizedTest
	@ValueSource(strings={"AHTornado.jpg","diluvio2.jpg","doluvio1.jpg","eruzione-vulcanica-prevista-dai-droni.jpg","foresta1.jpg","FORESTE.jpg","tornado1.jpg","vulcano1.jpg","vulcano2.jpg"})
	public void getbyteimgTest(String g) {
		Assertions.assertAll("getbyteimg Test",
				()->assertTrue(a.getbyteimg(g).length>0),
				()->assertTrue(a.getbyteimg(g)!=null));
		
	}
	@ParameterizedTest
	@ValueSource(strings={"diluvio.txt","Foresta.txt","tornado.txt","vulcanoyes.txt"})
	public void getextTest(String g) {
		Assertions.assertAll("getext Test",
				()->assertTrue(!a.getext(g).isEmpty()),
				()->assertTrue(!a.getext(g).isBlank()));
		
	}
	@Test
	public void FinestraimageTest() {
		
		
		assertThrows(Exception.class,()->a.FINESTRAIMMAGE("caso"));

}
}