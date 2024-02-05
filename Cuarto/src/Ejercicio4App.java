
public class Ejercicio4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = 1;
		int incremento = n + 77; n = incremento;
		System.out.println(incremento);
		int decremento = n - 3; n = decremento;
		System.out.println(decremento);
		int duplicar = n * 2; n = duplicar;
		System.out.println(duplicar);

		
		//método más óptimo
		//incrementa N en 77 y muestra el resultado
		n = 1;
		n += 77;
		System.out.println("N + 77 = " + n);
		//decrementa n en 3 unidades y muestra el resultado
		n -= 3;
		System.out.println("N - 3 = " + n);
		//duplica el valor de n y muestra el resultado
		System.out.println(2*n);
	}

}
