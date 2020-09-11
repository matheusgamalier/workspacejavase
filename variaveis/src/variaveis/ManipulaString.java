package variaveis;

import java.util.Scanner;

public class ManipulaString {

	public static void main (String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite o e-mail: ");
		String email = tec.next();
		
		System.out.println("");
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qtde Caracteres: " + email.length());
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Do 2� at� 4�: " + email.substring(1, 4));
		System.out.println("A partir do 3�: " + email.substring(2));
		System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")));
		System.out.println("Servidor: " + email.substring(email.indexOf("@") + 1));
		System.out.println("Primeiro caracter: " + email.charAt(0));
		System.out.println("Comparando Strings: " + email.equals("xpto@xpto.com"));
		System.out.println("Comparando Strings: " + email.equalsIgnoreCase("xpto@xpto.com"));
		
		tec.close();
	}
}
