import javax.swing.JOptionPane;

public class NomeIdadeMediaEtc {

	public static void main(String[] args) {
		
		String nome = "";
		String nomeMaisVelha = "";
		String nomeMaisNova = "";
		short idade = 0;
		short idadeMaisVelha = 0;
		short idadeMaisNova = 0;
		int totalIdade = 0;
		int qtdePessoas = 0;
		int qtdePessoasMaiores = 0;
		
		do {
			nome = JOptionPane.showInputDialog("Informe o " + (qtdePessoas + 1) + "� nome").toUpperCase();
			idade = Short.parseShort(JOptionPane.showInputDialog("Informe a idade do(a) " + nome));
			
			qtdePessoas++;
			totalIdade += idade;
			
			if (idade >= idadeMaisVelha) {
				nomeMaisVelha = nome;
				idadeMaisVelha = idade;
			}
			
			if (idade <= idadeMaisNova || qtdePessoas == 1) {
				nomeMaisNova = nome;
				idadeMaisNova = idade;
			}
			
			if (idade > 17) {
				qtdePessoasMaiores++;
			}	
			
		} while (JOptionPane.showInputDialog("Tecle <S> para inserir mais dados").toUpperCase().charAt(0) == 'S');
		
		System.out.printf("Qtde de pessoas .......: %d \n", qtdePessoas);
		System.out.printf("Qtde de pessoas maiores: %d \n", qtdePessoasMaiores);
		System.out.printf("Total idade: %d \n", totalIdade);
		System.out.println("M�dia das idades ......: " + totalIdade / qtdePessoas);
		System.out.printf("Pessoa mais velha .....: %s com %d anos \n", nomeMaisVelha, idadeMaisVelha);
		System.out.printf("Pessoa mais nova  .....: %s com %d anos \n", nomeMaisNova, idadeMaisNova);
			
	}

}
