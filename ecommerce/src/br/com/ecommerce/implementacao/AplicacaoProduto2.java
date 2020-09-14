package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Cd;
import br.com.ecommerce.modelo.Livro;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.tela.Magica;

public class AplicacaoProduto2 {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		char opcao = Magica.s("Digita <L> ou <C>").charAt(0);
		
		if (opcao == 'L') {
			produto = new Livro(
					Magica.i("ID"),
					Magica.s("Descricao"),
					Magica.f("Valor Compra"),
					Magica.f("Valor Venda"),
					Magica.i("Qtde"),
					Magica.s("Tipo"),
					Magica.s("ISBN"),
					Magica.s("Autor"),
					Magica.s("Editora")
					);
		}
		else if (opcao == 'C') {
			produto = new Cd(
					Magica.i("ID"),
					Magica.s("Descricao"),
					Magica.f("Valor Compra"),
					Magica.f("Valor Venda"),
					Magica.i("Qtde"),
					Magica.s("Tipo"),
					Magica.s("Artista"),
					Magica.s("Gravadora"),
					Magica.s("Duracao")
					);
		}
		else {
			System.out.println("Opcao Invalida");
		}
		System.out.println(produto.getAll());

	}

}
