
public class Ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int temp = b;
		int c=30;
		int d=40;
		
		b=c; // b = 30
		c=a; // c = 10
		a=d; // a = 40
		d= temp; // d = 20
		
		System.out.println("valor de a: " + a + "\n valor de b " + b + "\n valor de c " + c + "\n valor de d " + temp);
	}

}
