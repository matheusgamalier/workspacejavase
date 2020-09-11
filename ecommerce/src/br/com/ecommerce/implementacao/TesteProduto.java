package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		p.setAll(
					Integer.parseInt(JOptionPane.showInputDialog("Digite o ID")),
					JOptionPane.showInputDialog("Digite a descrição"),
					JOptionPane.showInputDialog("Digite o tipo"),
					Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da compra")),
					Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da venda")),
					Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"))
				);
		System.out.println(p.getAll());

	}

}
