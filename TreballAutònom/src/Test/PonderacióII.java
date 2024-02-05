package Test;

import java.util.Scanner;

public class PonderacióII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner teclado;
	
	double n1, n2, n3;  //PER QUÈ COLLONS NO FUNCIONA L'ENTRADA DE NÚMEROS DECIMALS?
	
	//INPUT KEYBOARD
	teclado= new Scanner(System.in);
	System.out.print("Introdueix la nota del primer parcial: ");
	n1=teclado.nextInt();
	System.out.print("Introdueix la nota del segon parcial: ");
	n2 = teclado.nextInt();
	System.out.print("Introdueix la nota del final: ");
	n3 = teclado.nextInt();
	
	double notaFinal=n1*0.2+n2*0.3+n3;
	
	
	//PONDERACIÓ
	System.out.print( "La seva suma ponderada és:" );
	System.out.println(n1*0.2+n2*0.3+n3*0.5);
	
	//MISSATGE
	if (notaFinal>=9)
	System.out.println("Molt bé, has tret un excel·lent. FELICITATS!");
	if (notaFinal>=5 && notaFinal<7)
	System.out.println("Has aprovat.");
	if (notaFinal>=7 && notaFinal<9)
	System.out.println("Has tret un notable. Segueix així!");
	if (notaFinal>=0 && notaFinal<5)
	System.out.println("Has suspès, t'has d'esforçar més.");
	}

}
