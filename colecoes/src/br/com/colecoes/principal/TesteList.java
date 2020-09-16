package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class TesteList {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		//do {
		//	lista.add(JOptionPane.showInputDialog("Digite um nome"));
		//} while (JOptionPane.showConfirmDialog(null, "Continuar?", JOptionPane.YES_NO_OPTION) == 0);
		//System.out.println(lista);
		
		lista.add("Matheus");
		lista.add("Marjorie");
		lista.add("Humberto");
		lista.add("Marjorie");
		lista.add("Adalberto");
		
		System.out.println(lista.get(2));
		System.out.println(lista.remove(2));
		System.out.println(lista);
		
		System.out.println("Sem ordernar " + lista);
		
		Collections.sort(lista);
		
		System.out.println("Ordenado " + lista);
		
		// for convencional
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("FOR =================");
			System.out.println("Nome: " + lista.get(i));
		}
		
		// for each
		for (String l : lista) {
			System.out.println("FOR EACH=================");
			System.out.println("Nome: " + l);			
		}
		
	}

}
