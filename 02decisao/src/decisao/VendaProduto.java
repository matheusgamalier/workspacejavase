package decisao;

import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {
		String nomeProduto = JOptionPane.showInputDialog("Nome do produto").toUpperCase();
		int qtde = (int) Double.parseDouble(JOptionPane.showInputDialog("Quantidade"));
		float precoUnitario = Float.parseFloat(JOptionPane.showInputDialog("Pre�o"));
		float precoFinal = precoUnitario * qtde;
		String formaPagamento = JOptionPane.showInputDialog("Forma de pagamento").toUpperCase();
		
		if (formaPagamento.equals("VISTA")) {
			precoFinal *= qtde > 10 ? 0.9 : 0.95;
		}
		
		System.out.println();
		System.out.println("Produto ...: " + nomeProduto);
		System.out.println("Pre�o final: " + precoFinal);
	}

}
