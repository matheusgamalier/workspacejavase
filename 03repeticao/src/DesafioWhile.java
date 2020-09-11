import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		short ano = 0;
		short mes = 0;
		short dia = 0;		
		
		System.out.print("Informe o ano: ");
		ano = t.nextShort();
		
		while (ano > 2001) {
			System.out.println("Ano deve ser menor que 2002");
			System.out.print("Informe o ano: ");
			ano = t.nextShort();
		}
		
		System.out.println();
		
		System.out.print("Informe o m�s: ");
		mes = t.nextShort();
		
		while (mes < 1 || mes > 12) {
			System.out.println("M�s deve ser entre 1 ao 12");
			System.out.print("Informe o m�s: ");
			mes = t.nextShort();
		}
		
		System.out.println();
		
		System.out.print("Informe o dia: ");
		dia = t.nextShort();
		
		if (mes == 2) {
			while (dia < 1 || dia > 29) {
				System.out.println("Dia inv�lido para o m�s");
				System.out.print("Informe o dia: ");
				dia = t.nextShort();
			}
		}
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			while (dia < 1 || dia > 30) {
				System.out.println("Dia inv�lido para o m�s");
				System.out.print("Informe o dia: ");
				dia = t.nextShort();
			}			
		}
		else {
			while (dia < 1 || dia > 31) {
				System.out.println("Dia inv�lido para o m�s");
				System.out.print("Informe o dia: ");
				dia = t.nextShort();
			}
		}
		
		System.out.println();
		
		System.out.printf("Data: %d/%d/%d", dia, mes, ano);
		
		t.close();
	}

}
