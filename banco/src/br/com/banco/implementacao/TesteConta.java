package br.com.banco.implementacao;

import br.com.banco.modelo.Conta;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Conta conta = new Conta();
        conta.setNumero(123);
        conta.setTipo("CORRENTE");
        conta.setAplicacao(0);
        conta.setLimite(100);
        conta.setSaldo(10000);
        conta.setTitular("REGINA");
       
        conta.sacar(2000);
        System.out.println(conta.getSaldo());
        conta.depositar(1000);
        System.out.println(conta.getSaldo());
	}

}
