package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChooserTest {
Chooser create;
@BeforeEach
void CreateChooser() {
	create=new Chooser();
}

	@Test
	void ChooserCostructorTest() {
		Assertions.assertAll("Chooser Costructor Test",
				()->assertTrue(!(create==null)));
	}

}
