package formeGeometriche;

public class Rettangolo {
	private double base;
	private double altezza;
	private String nome;

	public Rettangolo(double base, double altezza, String nome) {
		this.base = base;
		this.altezza = altezza;
		this.nome = nome;
	}
	
	public double calcolaArea() {
		return base*altezza;
	}
	
	public String getNome() {
		return nome;
	}
}
