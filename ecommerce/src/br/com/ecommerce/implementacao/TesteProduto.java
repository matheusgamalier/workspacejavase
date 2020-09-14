package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
        Produto churros = new Produto();
      churros.setAll(
              Integer.parseInt(JOptionPane.showInputDialog("ID")),
              JOptionPane.showInputDialog("Descrição").toUpperCase(),
              Float.parseFloat(JOptionPane.showInputDialog("Valor Compra")),
              Float.parseFloat(JOptionPane.showInputDialog("Valor Venda")),
              Integer.parseInt(JOptionPane.showInputDialog("QTDE")),
              JOptionPane.showInputDialog("Tipo").toUpperCase()
              );
      System.out.println(churros.getDescricao());
      System.out.println(churros.getQtde());
      System.out.println(churros.getValorVenda());
      System.out.println("Total Compra: " + churros.getTotalCompra());
      System.out.println("Total Venda.: " + churros.getValorVenda());

	}

}
