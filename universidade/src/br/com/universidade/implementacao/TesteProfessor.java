package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Professor;

public class TesteProfessor {

	public static void main(String[] args) {
		Professor p = new Professor();
		
		p.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID")));
		p.setNome(JOptionPane.showInputDialog("Digite o nome"));
		p.setArea(JOptionPane.showInputDialog("Digite a area"));
		p.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor hora")));
				
		System.out.println("Id: " + p.getId());
		System.out.println("Nome: " + p.getNome());
		System.out.println("Area: " + p.getArea());
		System.out.println("Valor Hora: " + p.getValorHora());
		
		Professor p2 = new Professor();
		p2.setAll(
					Integer.parseInt(JOptionPane.showInputDialog("Digite o ID")),
					JOptionPane.showInputDialog("Digite o nome"),
					JOptionPane.showInputDialog("Digite a area"),
					Float.parseFloat(JOptionPane.showInputDialog("Digite o valor hora"))
				);
		System.out.println(p2.getAll());

	}

}
