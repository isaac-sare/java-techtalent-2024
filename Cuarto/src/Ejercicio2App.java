
public class Ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		double A = 4.56;
		char C = 'a';

		// Muestra el valor de cada variable
		System.out.println("Variable N = " + N);
		System.out.println("Variable A = " + A);
		System.out.println("Variable C = " + C);

		// Muestra la suma de N + A y la diferencia de A - N (versión 1)
		double suma = N + A;
		double dif = A - N;

		System.out.println(suma);
		System.out.println(dif);
		System.out.println("el valor numérico de letra es" + C);

		// (versión 2) No se definen las variables suma, dif.
		// Se hacen los cálculos directamente dentro de system.out.println
		System.out.println("La suma de los valores N+A es = " + N + " + " + A + " = " + (N + A));
		System.out.println(A + " - " + N + " = " + (A - N));
		System.out.println("el valor numérico de letra es " + C + " es = " + (int) C);
	}

}
