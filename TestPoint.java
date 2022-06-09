package primoProgetto;

public class TestPoint {
	public static void main(String[] args) {
		Point p1;
		p1 = new Point(2, 5);
		
		int x = 5;
		int y = 10;
		Point p2 = new Point(x, y);
		/*
		
		System.out.println("Coordinata x = " + x);
		Point p2 = new Point(x, y);
		System.out.println("Coordinata x = " + x);
		*/
		
		System.out.println("Dati del punto 1: ");
		p1.printPoint();
		
		System.out.println();
		System.out.println("Dati del punto 2: ");
		p2.printPoint();
		
		p2.swap();
		// Point.staticSwap(p2);
		
		System.out.println();
		System.out.println("Dati del punto 2: ");
		p2.printPoint();
		
		
	}
}