package primoProgetto;

public class Point {
	/*
	 La classe rappresenta il punto nel piano
	 che e' descritto da due coordinate.
	 */
	
	// ATTRIBUTI
	private int xcoord;
	private int ycoord;
	
	// METODI
	public Point(int x, int y) {
		xcoord = x;
		ycoord = y;
		/*
		x = 1000;
		System.out.println("\t\t x modificato = " + x);
		*/
	}
	
	public void printPoint() {
		System.out.println("Coordinata x = " + xcoord);
		System.out.println("Coordinata y = " + ycoord);
	}
	
	public void swap() {
		int tmp;
		tmp = xcoord;
		xcoord = ycoord;
		ycoord = tmp;
	}
	
	public static void staticSwap(Point p) {
		int tmp;
		tmp = p.xcoord;
		p.xcoord = p.ycoord;
		p.ycoord = tmp;
	}
}