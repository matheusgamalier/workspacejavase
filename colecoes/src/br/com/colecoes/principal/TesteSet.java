package br.com.colecoes.principal;

import java.util.HashSet;

public class TesteSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> lista = new HashSet<String>();
		
		lista.add("Adalberto");
		lista.add("Matheus");
		lista.add("Deivid");
		lista.add("Marjorie");
		lista.add("Humberto");
		lista.add("Deivid");
		lista.add("Marjorie");
		
		
		System.out.println(lista);
		
		// for convencional não funciona pois set nao trabalha com index
		//for (int i = 0; i < lista.size(); i++) {
		//	System.out.println("FOR =================");
		//	System.out.println("Nome: " + lista.get(i));
		//}
		
		// for each
		for (String l : lista) {
			System.out.println("FOR EACH=================");
			System.out.println("Nome: " + l);			
		}
	}

}
