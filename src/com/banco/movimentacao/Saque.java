package com.banco.movimentacao;

import java.util.Locale;
import java.util.Scanner;

import com.banco.criar_conta.Dados;

@SuppressWarnings("resource")
public class Saque {
	public static void saque(Dados data) {		
		Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);
		
		System.out.printf("\nDigite o valor para saque: \nR$ ");
		double saque = scan.nextDouble();

		if (saque > data.saldo) {						
			System.out.println("\nVocê não tem saldo suficiente\n");
			
		} else {			
			data.saldo = data.saldo - saque;			
			System.out.printf("\nNovo saldo R$ %s\n", String.format("%.2f", data.saldo));
			
		}
	}
}
