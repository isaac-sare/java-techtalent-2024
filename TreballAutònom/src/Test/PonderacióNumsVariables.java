package Test;

import java.util.Scanner;

public class PonderacióNumsVariables {

	public static void main(String[] args) {
	
	Scanner teclado;
	double n1, n2, n3, n4;
	teclado = new Scanner(System.in);
	System.out.print("Introdueix la nota del primer parcial: ");
	n1=teclado.nextInt();
	System.out.print("Introdueix la nota del segon parcial: ");
	n2 = teclado.nextInt();
	System.out.print("Introdueix la nota del final: ");
	n3 = teclado.nextDouble();

	
	
	System.out.print( "La suma ponderada és:" );
	System.out.println(n1*0.2+n2*0.3+n3*0.5);
	
	if (n1*0.2+n2*0.3+n3*0.5>=9)
	System.out.println("Molt bé, has tret un excel·lent. FELICITATS!");
	if (n1*0.2+n2*0.3+n3*0.5>=5 && n1*0.2+n2*0.3+n3*0.5<7)
	System.out.println("Has aprovat.");
	if (n1*0.2+n2*0.3+n3*0.5>=7 && n1*0.2+n2*0.3+n3*0.5<9)
	System.out.println("Has tret un notable. Segueix així!");
	if (n1*0.2+n2*0.3+n3*0.5>=0 && n1*0.2+n2*0.3+n3*0.5<5)
	System.out.println("Has suspès, t'has d'esforçar més");
	}

}
