package br.com.polimorfismo.implementacao;

import br.com.polimorfismo.beans.Bacharelado;
import br.com.polimorfismo.beans.Formacao;
import br.com.polimorfismo.beans.Medio;
import br.com.polimorfismo.beans.Tecnologo;
import br.com.polimorfismo.magica.Magica;

public class TesteFormacao {
	
	public static void main (String args[]) {
		char tipoFormacao = Magica.s("Informe a formacao \n<M> Medio \n<T> Tecnologo \n<B> Bacharelado").charAt(0);
		Formacao formacao = null;
		
		//Preencher o que é comum
		String descricao = Magica.s("Descricao");
		int periodo = Magica.i("Periodo \n<1> Manha \n<2> Tarde \n<3> Noite");
		
		if (tipoFormacao == 'M') {
			formacao = new Medio(
						descricao, periodo,	0, 0,
						Magica.s("Tipo")
					);
		}
		else if (tipoFormacao == 'T') {
			formacao = new Tecnologo(
						descricao, periodo,	0, 0,
						Magica.b("Estendido?")
					);
			
		}
		else if (tipoFormacao == 'B') {
			formacao = new Bacharelado(
						descricao, periodo,	0,	0,
						Magica.s("Projeto Conclusao"),
						Magica.i("Carga Horaria Estagio")
					);
		}
		else {
			System.out.println("Erro");
		}
		
		formacao.definirDuracao();
		formacao.calcularMensalidade(Magica.f("Digite o fator"));
		
		System.out.println(formacao.getAll());
	}
	
}
