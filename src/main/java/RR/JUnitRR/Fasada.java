package RR.JUnitRR;

public class Fasada {

	private Class1 x;
	private Class2 y;
	
	public Fasada(Class1 x, Class2 y) {
	//	combainPieces(x, y);
		this.x=x;
		this.y=y;
		
	}

	private String result = "";

	public String combainPieces() {

		result = "Twoje imie to: " + x.printName() + "\nMasz: " + y.printAge() + " lat.";
	//	System.out.println(result);
		return result;
	}

}
