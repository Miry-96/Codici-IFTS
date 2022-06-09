package formeGeometriche;

public class Principale {
	/*
	// Calcolo del massimo intero in un vettore
	public static void main(String[] args) {	
		// Dichiarazione e alocazione
		int[] A = new int[10];
		
		// Inizializzazione
		for(int i=0; i<10; i++) {
			A[i] =  (int) (Math.random()*100); // cast 
		}
		
		// Stampo a video i numeri appena generati
		System.out.println("I numeri inseriti sono: ");
		for(int i=0; i<10; i++) { 
			System.out.println( A[i] );
		}
		
		// Ricerca del massimo
		int max = A[0]; // ATTENZIONE: come inizializzare max?
		 // A seconda delle varie situazioni, se devo calcolare il massimo di 
		 // un insieme di numeri, devo inizializzare opportunamente la variabile
		 // max.
		 // Se ho un vettore contenente le temperature giornaliere medie del 
		 // polo nord (es: [-20, -15, -16, ...] ), inizializzando max a 0, otterrei
		 // in output che il massimo è 0... CHE NON È UN ELEMENTO DELL'ARRAY!!!
		 // In questo caso i numeri sono tutti positivi, quindi posso utilizzare
		 // -1 come valore iniziale.
		 // In generale, posso inizializzare max al primo valore dell'array:
		 // max = A[0];
		 
		for(int i=1; i<10; i++) {
			if(A[i]>max) {
				max = A[i];
			}
		}
		
		System.out.println("Il numero max e' " + max);
		
		
		
		System.out.println("\n-----Fine programma-----");	
	}*/

	//Calcolo del rettangolo con area massima
	public static void main(String[] args) {
		 // Generare 10 rettangoli
		 // Trovare quello con l'area massima
		
		Rettangolo[] r; // Dichiaro r dicendo che p un array di interi
		r = new Rettangolo[10]; // Alloco lo spazio in memoria per 10 interi
		
		// NB: posso farlo in un'unica istruzione:
		// Rettangolo[] r = new Rettangolo[10];
		
		// Richiamo opportunamente il costruttore per generare i 10 rettangoli
		for(int i=0; i<10; i++) { 
			r[i] = new Rettangolo(Math.random()*100,Math.random()*100,"Rettangolo " + i);
		}

		// Stampo le aree dei rettangoli
		for(int i=0; i<10; i++) { 
			System.out.println("Il rettangolo " + r[i].getNome() + " ha area " + r[i].calcolaArea());
		}
		 
		// TODO: Calcolo il rettangolo con area max
	}
}
