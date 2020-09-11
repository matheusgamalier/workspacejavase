package variaveis;

import java.util.Scanner;

public class Itau {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = teclado.nextInt();
		
		System.out.print("Digite sua altura: ");
		double altura = teclado.nextDouble();
		
		System.out.print("Digite seu peso: ");
		double peso = teclado.nextDouble();
		
		teclado.close();
		
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("IMC: " + peso / (altura * altura));
		
	}
	
}
