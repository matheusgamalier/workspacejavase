package br.com.universidadereferencia.implementacao;

import br.com.universidadereferencia.beans.Aluno;
import br.com.universidadereferencia.beans.Curso;
import br.com.universidadereferencia.beans.Endereco;
import br.com.universidadereferencia.beans.Turma;
import br.com.universidadereferencia.magica.Magica;

public class AplicacaoUniversidade {

	public static void main(String[] args) {
		Turma turma = new Turma
			(
				Magica.s("Sigla Turma"),
				Magica.s("Periodo Turma"),
				new Curso
					(
						Magica.s("Nome Curso"),
						Magica.f("Valor Curso"),
						Magica.i("Carga Horaria Curso")
					),
				new Aluno
					(
						Magica.i("RM Aluno"),
						Magica.s("Nome Aluno"),
						Magica.s("Email Aluno"),
						new Endereco
							(
								Magica.s("Logradouro Endereco"),
								Magica.s("Numero Endereco"),
								Magica.s("Complemento Endereco")
							)
					)	
			);
		
		System.out.println(turma.getAll());
	}

}
