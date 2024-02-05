package Test;

public class PonderacióApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1=10; // El primer parcial vale un 20%, pondera 0.2
		double n2=6.8;	// El segundo parcial vale un 30%, pondera 0.3
		double n3=8;	// El final vale un 50%, pondera 0.5
		System.out.println("En els parcials has tret un "+n1+" , un "+n2+" y un "+n3+" al final. Per tant, la teva nota final ponderada és "+(n1*0.2+n2*0.3+n3*0.5));
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
