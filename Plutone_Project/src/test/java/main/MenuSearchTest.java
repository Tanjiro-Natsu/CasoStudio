package main;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Font;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.AssertionFailedError;

class MenuSearchTest {
	MenuSearch Menu;
	JTextArea d=new JTextArea();
	@Test
	public void getColorxTest() {
		MenuSearch Menu=new MenuSearch(d);
		Assertions.assertAll("getColor x Test",
				()->assertTrue(Menu.getq1()!=null),
				()->assertTrue(Menu.getq2()!=null),
				()->assertTrue(Menu.getq3()!=null),
				()->assertTrue(Menu.getq4()!=null),
				()->assertTrue(Menu.getq5()!=null),
				()->assertTrue(Menu.getq6()!=null),
				()->assertTrue(Menu.getq7()!=null),
				()->assertTrue(Menu.getq8()!=null),
				()->assertTrue(Menu.getq9()!=null),
				()->assertTrue(Menu.getq10()!=null),
				()->assertTrue(Menu.getq11()!=null),
				()->assertTrue(Menu.getq12()!=null)
				
				);
	}
	
	@Test
	public void getLayoutTest() {
		MenuSearch Menu=new MenuSearch(d);
		Assertions.assertAll("getLayout x Test",
				()->assertTrue(Menu.gety111()!=null),
				()->assertTrue(Menu.gety112()!=null),
				()->assertTrue(Menu.gety113()!=null),
				()->assertTrue(Menu.gety114()!=null),
				()->assertTrue(Menu.gety115()!=null),
				()->assertTrue(Menu.gety116()!=null),
				()->assertTrue(Menu.gety117()!=null),
				()->assertTrue(Menu.gety118()!=null),
				()->assertTrue(Menu.gety119()!=null),
				()->assertTrue(Menu.gety120()!=null),
				()->assertTrue(Menu.gety121()!=null),
				()->assertTrue(Menu.gety122()!=null),
				()->assertEquals(Menu.gety1(),Font.BOLD),
				()->assertEquals(Menu.gety2(),Font.CENTER_BASELINE),
				()->assertEquals(Menu.gety3(),Font.HANGING_BASELINE),
				()->assertEquals(Menu.gety4(),Font.ITALIC),
				()->assertEquals(Menu.gety5(),Font.LAYOUT_LEFT_TO_RIGHT),
				()->assertEquals(Menu.gety6(),Font.LAYOUT_NO_LIMIT_CONTEXT),
				()->assertEquals(Menu.gety7(),Font.LAYOUT_NO_START_CONTEXT),
				()->assertEquals(Menu.gety8(),Font.LAYOUT_RIGHT_TO_LEFT),
				()->assertEquals(Menu.gety9(),Font.PLAIN),
				()->assertEquals(Menu.gety10(),Font.ROMAN_BASELINE),
				()->assertEquals(Menu.gety11(),Font.TRUETYPE_FONT),
				()->assertEquals(Menu.gety12(),Font.TYPE1_FONT)
				);
	}
	
	@Test
	public void getsizexTest() {
		MenuSearch Menu=new MenuSearch(d);
		Assertions.assertAll("getSize x Test",
				()->assertTrue(Menu.getf1()!=null),
				()->assertTrue(Menu.getf2()!=null),
				()->assertTrue(Menu.getf3()!=null),
				()->assertTrue(Menu.getf4()!=null),
				()->assertTrue(Menu.getf5()!=null),
				()->assertTrue(Menu.getf6()!=null),
				()->assertTrue(Menu.getf7()!=null),
				()->assertTrue(Menu.getf8()!=null),
				()->assertTrue(Menu.getf9()!=null),
				()->assertTrue(Menu.getf10()!=null),
				()->assertTrue(Menu.getf11()!=null),
				()->assertTrue(Menu.getf12()!=null),
				()->assertTrue(Menu.getf13()!=null),
				()->assertTrue(Menu.getf14()!=null),
				()->assertTrue(Menu.getf15()!=null),
				()->assertTrue(Menu.getf16()!=null),
				()->assertTrue(Menu.getf17()!=null),
				()->assertTrue(Menu.getf18()!=null)
				
				);
	}

}
