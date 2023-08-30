package exercicio1;

import java.util.Scanner;
import java.util.Locale;

public class teste_matematico {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*int x, y;

		System.out.println("Digite os valores ");
		x = sc.nextInt();
		y = sc.nextInt();
		int soma = x + y;

		System.out.println("A soma deu: " + soma);
		double R, A, pi = 3.14159;
		
		 R = sc.nextDouble();https://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1336
		 
		 A = pi * R * R;
		 
		 System.out.printf("A=%.4f%n", A);*/
		/*int A, B, C, D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int dif = (A*B) - (C*D);
		System.out.println("O valor é " +dif);
		*/
		
		int funcionario, hora;
		System.out.println("Digite o numero ");
		funcionario = sc.nextInt();
		System.out.println("Digite as horas trabalhadas no mes ");
		hora = sc.nextInt();
		System.out.println("Digite o salario por hora ");
		double salario = sc.nextDouble();
		double result = (salario * hora);
		
		System.out.println("Nimero do Funcionario: "+funcionario);
		System.out.println("Salario R$ "+result);
		
		sc.close();
	}

}
