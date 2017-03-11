
//importujemy statycznie klase ktorej metody bedziemy wywolywac bezposrednio(bez NazwaKlasy.metoda /NazwaObiektu.metoda)
import static org.junit.Assert.*;

//importujemy klacy adnotacji
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//importujemy pakiet w ktorym sa klasy ktore bedziemy testowac
import RR.JUnitRR.*;

//KLASA TESTUJACA
public class Test1 {

	// przykładowy test
	@Test
	public void test1() {
		boolean b = true;
		// korzystamy tu ze statycznego importu klasy Assert, dlatego
		// bezposrednio uzywamy jej metod
		assertFalse("Dales ciala", b);
	}

	@Test
	public void test2() {

		// najpierw tworzymy obiekty ktore bedziemy testowac ( jalepiej dla
		// kazdego testu osobno zeby nic nie zmienilo ich stanu
		Class1 cl1 = new Class1("Rafal");
		Class2 cl2 = new Class2(28);
		Fasada f = new Fasada(cl1, cl2);

		// testujemy metody wywolane na obiektach
		assertEquals("Dales ciala", "Twoje imie to: Rafal\nMasz: 28 lat.", f.combainPieces());
	}

	// @Before -tak oznaczona metoda wywola sie przed kazdym testem
	// @After - po kazdym tescie
	// @BeforeClass - tylko raz z odpaleniem klasy testowej
	@AfterClass // - raz, na koniec klasy testowej
	public static void showIamHapppy() {
		System.out.println("I am so so so happy!!!");
	}

}
