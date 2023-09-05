import java.util.Scanner;

public class principal {

	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Salarios X = new Salarios();
		
		System.out.println("Salário anual do colaborador: R$" ); 
		
		X.S = sc.nextDouble();
		
		if (X.S <= 280) {
			X.metodoA();
			System.out.println("1.O Salário era: " + X.S);
			System.out.println("2.O percentual de aumento aplicado foi: 20%");
			System.out.println("3.O aumento foi de: " + X.S*0.20);
			System.out.println("4.O novo salário é: " + X.A);
			
		}
		
		else if (X.S>280 && X.S<=700) {
			X.metodoB();
			System.out.println("1.O Salário era: " + X.S);
			System.out.println("2.O percentual de aumento aplicado foi: 15%");
			System.out.println("3.O aumento foi de: " + X.S*0.15);
			System.out.println("4.O novo salário é: " + X.B);
		}
		
		else if (X.S>700 && X.S<1500) {
			X.metodoC();
			System.out.println("1.O Salário era: " + X.S);
			System.out.println("2.O percentual de aumento aplicado foi: 10%");
			System.out.println("3.O aumento foi de: " + X.S*0.10);
			System.out.println("4.O novo salário é: " + X.C);
		}
		
		else {
			X.metodoD();
			System.out.println("1.O Salário era: " + X.S);
			System.out.println("2.O percentual de aumento aplicado foi: 5%");
			System.out.println("3.O aumento foi de: " + X.S*0.05);
			System.out.println("4.O novo salário é: " + X.D);
		}
		
		sc.close();
	}

}
