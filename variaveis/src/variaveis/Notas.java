package variaveis;

import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = teclado.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = teclado.nextDouble();
		
		teclado.close();
		
		System.out.println("");
		System.out.println("Nome ..: " + nome);
		System.out.println("M�dia .: " + (nota1 + nota2) / 2);
		System.out.printf("Aluno %s sua m�dia �: %.1f", nome, (nota1 + nota2) / 2);
	}
}
