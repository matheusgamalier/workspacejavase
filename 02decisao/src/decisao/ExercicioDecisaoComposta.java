package decisao;

import javax.swing.JOptionPane;

public class ExercicioDecisaoComposta {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		short idade = (short) Double.parseDouble(JOptionPane.showInputDialog("Informe sua idade"));
		
		if (idade >= 18 && idade <= 70) {
			System.out.println("Voc� � obrigado a votar");
		}
		else if (idade == 16 || idade == 17 || idade > 70) {
			System.out.println("Pra voc� o voto � facultativo");
		}
		else {
			System.out.println("Voc� n�o pode votar");
		}

	}

}
