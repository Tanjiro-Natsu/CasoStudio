package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccessoTest {

	@Test
	void getJdbcTest() {
		Assertions.assertAll("Test getjdbc",
	            ()->assertTrue(!Accesso.getjdbc().isBlank()),
	            ()->assertTrue(!Accesso.getjdbc().isEmpty()),
	            ()->assertTrue(Accesso.getjdbc().equals("jdbc:sqlserver://localhost:1433;databaseName=Plutone_Project")));

	}
	@Test
	void getUserTest() {
		Assertions.assertAll("Test getUser",
	            ()->assertTrue(!Accesso.getUser().isBlank()),
	            ()->assertTrue(!Accesso.getUser().isEmpty()),
	            ()->assertTrue(Accesso.getUser().equals("sa")));

	}
	@Test
	void getPasswordtest() {
		Assertions.assertAll("Test getPassword",
	            ()->assertTrue(!Accesso.getPassword().isBlank()),
	            ()->assertTrue(!Accesso.getPassword().isEmpty()),
	            ()->assertTrue(Accesso.getPassword().equals("Cacca1989")));

	}

}
