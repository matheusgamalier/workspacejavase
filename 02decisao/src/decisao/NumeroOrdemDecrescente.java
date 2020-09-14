package decisao;

import java.util.Scanner;

public class NumeroOrdemDecrescente {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);

		int aux = 0;
		
		System.out.print("N�mero 1: ");
		int n1 = i.nextInt();
		
		System.out.print("N�mero 2: ");
		int n2 = i.nextInt();
		
		System.out.print("N�mero 3: ");
		int n3 = i.nextInt();
		
		System.out.println();
		
		if (n1 == n2 || n2 == n3 || n1 == n3) {
			System.out.println("Existem n�meros repetidos");
		}
		else {
			if (n1 < n2) {
				aux = n1;
				n1 = n2;
				n2 = aux;
			}
			
			if (n1 < n3) {
				aux = n1;
				n1 = n3;
				n3 = aux;
			}
			
			if (n2 < n3) {
				aux = n2;
				n2 = n3;
				n3 = aux;
			}
			
			i.close();
			System.out.printf("N�meros em ordem decrescente: %d, %d, %d", n1, n2, n3);
		}
		
		

	}

}
