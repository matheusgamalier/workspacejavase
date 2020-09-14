package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Cd;
import br.com.ecommerce.modelo.Livro;
import br.com.ecommerce.tela.Magica;

public class AplicacaoProduto {

	public static void main(String[] args) {
		char opcao = Magica.s("Digita <L> ou <C>").charAt(0);
		
		if (opcao == 'L') {
			Livro livro = new Livro(
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
			System.out.println(livro.getAll());
		}
		else if (opcao == 'C') {
			Cd cd = new Cd(
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
			System.out.println(cd.getAll());
		}
		else {
			System.out.println("Opcao Invalida");
		}

	}

}
