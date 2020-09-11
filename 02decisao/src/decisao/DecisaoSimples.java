package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 6) {
			System.out.println("Parab�ns " + nome + " voc� foi aprovado(a)");
		}
		else if (media < 3) {
			System.out.println("Infelizmente voc� foi reprovado");
		}
		else if (media < 6 && media >= 3) {
			System.out.println("Tente o exame");
		}
		
		if (media < 0 || media > 10) {
			System.out.println("M�dia inv�lida");
		}
		else {		
			System.out.println("Sua m�dia foi: " + media);
		}
	}

}
