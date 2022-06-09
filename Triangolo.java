package formeGeometriche;

public class Triangolo {
	private double base;
	private double altezza;
	
	public Triangolo(int b, int a) {
		base = b;
		altezza = a;
	}
	
	public double calcolaArea() {
		return base*altezza/2;
	}
}
