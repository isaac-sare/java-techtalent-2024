package Test;

import java.util.*;

public class PonderacióNumsVariablesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado; // variable objeto de tipo scanner

		double n1, n2, n3; // PER QUÈ COLLONS NO FUNCIONA L'ENTRADA DE NÚMEROS DECIMALS?

		// INPUT KEYBOARD
		teclado = new Scanner(System.in);
		System.out.print("Introdueix la nota del primer parcial: ");
		n1 = teclado.nextDouble();
		System.out.print("Introdueix la nota del segon parcial: ");
		n2 = teclado.nextDouble();
		System.out.print("Introdueix la nota del final: ");
		n3 = teclado.nextDouble();
		teclado.close(); // s'ha de tancar el recurs que hem obert per tal de no mantindre'l obert
						 // gastant recursos tota l'estona. Per aquest motiu, sense teclado.close() el
						 // programa funciona però apareix un petit error/warning.
			

		// PONDERACIÓ
		double ponder = (n1 * 0.2 + n2 * 0.3 + n3 * 0.5);
		System.out.print("La seva suma ponderada de " + n1 + ", " + n2 + ", " + n3 + " es: ");
		System.out.println(ponder);

		// MISSATGE
		if (n1 * 0.2 + n2 * 0.3 + n3 * 0.5 >= 9)
			System.out.println("Molt bé, has tret un excel·lent. FELICITATS!");
		if (n1 * 0.2 + n2 * 0.3 + n3 * 0.5 >= 5 && n1 * 0.2 + n2 * 0.3 + n3 * 0.5 < 7)
			System.out.println("Has aprovat.");
		if (n1 * 0.2 + n2 * 0.3 + n3 * 0.5 >= 7 && n1 * 0.2 + n2 * 0.3 + n3 * 0.5 < 9)
			System.out.println("Has tret un notable. Segueix així!");
		if (n1 * 0.2 + n2 * 0.3 + n3 * 0.5 >= 0 && n1 * 0.2 + n2 * 0.3 + n3 * 0.5 < 5)
			System.out.println("Has suspès, t'has d'esforçar més.");
		else 
			System.out.println("ERROR: nombres acceptats entre 0 i 10");
	}

}
