package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno objeto = new Aluno();
		
		objeto.setNome(JOptionPane.showInputDialog("Digite o nome"));
		objeto.setEmail(JOptionPane.showInputDialog("Digite o email"));
		objeto.setRm(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM")));
		
		JOptionPane.showMessageDialog(null, "Nome: " + objeto.getNome());
		JOptionPane.showMessageDialog(null, "Email: " + objeto.getEmail());
		JOptionPane.showMessageDialog(null, "RM: " + objeto.getRm());

	}

}
