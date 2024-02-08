import javax.swing.JOptionPane;

public class TUD5Ejercicios1234App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//EJERCICIO 1
		System.out.print("EJERCICIO 1:"
				+ " \n El mayor numero es: ");
		int a=10,b=10;
		int numMayor=Math.max(a,b);
		System.out.println(numMayor);
	
		
//EJERCICIO 2
		String nombre= "Isaac";
		
		System.out.println("Bienvenido " + nombre);
		
//EJERCICIO 3
		String nombre1= JOptionPane.showInputDialog("Introduce tu nombre: ");
		
		System.out.println("Bienvenido " + nombre1);
				
		
		
//EJERCICIO 4 area de una circumferencia
		
		double radio = Double.parseDouble(JOptionPane.showInputDialog(
				"Introduce un radio: "));
		final double PI=Math.PI;
		//Calculo del area de la circulo
		double area=PI*(Math.pow(radio, 2));
		
		JOptionPane.showMessageDialog(null,  "El area del"
				+ " circulo es " + area);
		System.out.println(("El area del circulo es " +area));
	}

}
