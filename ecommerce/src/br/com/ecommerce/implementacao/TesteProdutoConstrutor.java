package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProdutoConstrutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p = new Produto(
					Integer.parseInt(JOptionPane.showInputDialog("ID")),
					JOptionPane.showInputDialog("Descricao").toUpperCase(),
					Float.parseFloat(JOptionPane.showInputDialog("Valor Compra")),
					Float.parseFloat(JOptionPane.showInputDialog("Valor Venda")),
					Integer.parseInt(JOptionPane.showInputDialog("Qtde")),
					JOptionPane.showInputDialog("Tipo").toUpperCase()		
				);
		System.out.println(p.getAll());
	}

}
