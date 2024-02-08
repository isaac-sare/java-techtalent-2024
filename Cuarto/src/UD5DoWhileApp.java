import javax.swing.JOptionPane;

public class UD5DoWhileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		do {
			String texto = JOptionPane.showInputDialog(
					"Introduce un número entero positivo"
					+ "e inferior a 10");
			num= Integer.parseInt(texto);
		}while(num>=10 || num<0);
		System.out.println("El numero introducido es "+num);
		}
	}

