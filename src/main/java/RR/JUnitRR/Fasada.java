package RR.JUnitRR;

public class Fasada {

	public Fasada(Class1 x, Class2 y) {
		compainPieces(x, y);
	}

	private String result = "";

	private String compainPieces(Class1 x, Class2 y) {

		result = "Twoje imie to: " + x.printName() + "\nMasz: " + y.printAge() + " lat.";
		System.out.println(result);
		return result;
	}

}
