package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica.Magica;

public class AplicacaoVenda {
	
	public static void main(String[] args) {
		Venda v = new Venda();
		Produto p = new Produto();
		
		v.setNumero(Magica.i("Número da Venda"));
		v.setOperacao(Magica.s("Operação"));
		v.setTotal(Magica.f("Valor Total"));
		
		v.setProduto(p);
		
		p.setDescricao(Magica.s("Descrição Produto"));
		p.setId(Magica.i("ID Produto"));
		p.setQtde(Magica.i("Qtde Produto"));
		p.setTipo(Magica.s("Tipo Produto"));
		p.setValorCompra(Magica.f("Valor Compra Produto"));
		p.setValorVenda(Magica.f("Valor Venda Produto"));
		
		System.out.println(v.getAll());
	}

}
