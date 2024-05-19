package com.banco.movimentacao;

import com.banco.criar_conta.Dados;

public class DepositoTest {
	public static void depositoTest(Dados data) {
		System.out.println("Digite o valor para saque: \nR$ 10.000,00");					
		double deposito = 10000;
		
		if(deposito <= 0) {			
			System.out.printf("\nValor inválido\n");
			
		} else {			
			data.saldo = data.saldo + deposito;
			System.out.printf("\nNovo saldo R$ %s\n", String.format("%.2f", data.saldo));
			
		}
	}
}
