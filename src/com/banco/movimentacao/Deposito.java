package com.banco.movimentacao;

import java.util.Locale;
import java.util.Scanner;

import com.banco.criar_conta.Dados;

@SuppressWarnings("resource")
public class Deposito {
	public static void deposito(Dados data) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);
		
		System.out.println("Digite o valor para saque: \nR$ ");					
		double deposito = scan.nextDouble();
		
		if(deposito <= 0) {			
			System.out.printf("\nValor inválido\n");
			
		} else {			
			data.saldo = data.saldo + deposito;
			System.out.printf("\nNovo saldo R$ %s\n", String.format("%.2f", data.saldo));
			
		}
	}
}
