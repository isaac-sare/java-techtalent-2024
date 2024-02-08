import javax.swing.JOptionPane;

public class TUD5Ejercicios56App {

	public static void main(String[] args) {
		// EJERCICIO 5
		int numero=Integer.parseInt(JOptionPane.showInputDialog(null,
				"Introduce un número "));
		if (numero%2==0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
	}
		// EJERCICIO 6
		double num=Double.parseDouble(JOptionPane.showInputDialog(null,
				"Introduce un número "));
		final double IVA=0.21;
		double precio = (num+num*IVA);
		System.out.println("Precio final: " +precio);
		
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
