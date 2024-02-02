package ej1;

public class ClaseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=125;
		int n2=20;
		System.out.println("Suma de "+n1+" y "+n2+" vale "+(n1+n2));
		if (n1+n2>130)
			n1++;
		else
			n1--;
		System.out.println(n1);
	}

}