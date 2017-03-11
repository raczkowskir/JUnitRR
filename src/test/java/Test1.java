import static org.junit.Assert.*;

import org.junit.Test;

import RR.JUnitRR.*;

public class Test1 {

	@Test
	public void test1() {
		boolean b =true;
		assertFalse("Dales ciala",b );
	}	
		
	@Test
	public void test2() {
		
		Class1 cl1 = new Class1("Rafal");
		Class2 cl2 = new Class2(28);
		Fasada f = new Fasada(cl1, cl2);
		
		assertEquals("Dales ciala","Twoje imie to: Rafal\nMasz: 28 lat.", f.combainPieces() );
	}	
		
		
		
		
	
}
