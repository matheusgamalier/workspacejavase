package br.com.colecoes.principal;

import java.util.ArrayList;

import br.com.colecoes.beans.Cargo;

public class TesteListObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cargo> lista = new ArrayList<Cargo>();
		
		lista.add(new Cargo("DBA", "JUNIOR", 5000));
		lista.add(new Cargo("DEV", "ESTAGIARIO", 3000));
		
		System.out.println(lista);
		
		for (Cargo l : lista) {
			System.out.println(l.getAll());
		}
	}

}
