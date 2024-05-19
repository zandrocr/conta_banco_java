package com.banco.movimentacao;

import java.util.Locale;
import java.util.Scanner;

import com.banco.criar_conta.Dados;

@SuppressWarnings("resource")
public class SaqueTest {
	public static void saqueTest(Dados data) {		
		Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);
		
		System.out.printf("\nDigite o valor para saque: \nR$ 500,00");
		double saque = 500;

		if (saque < data.saldo) {						
			data.saldo = data.saldo - saque;
			
			System.out.printf("\nNovo saldo R$ %s\n", String.format("%.2f", data.saldo));						
		} else {
			System.out.printf("\nVocê não tem saldo suficiente\n");
		}
	}
}
