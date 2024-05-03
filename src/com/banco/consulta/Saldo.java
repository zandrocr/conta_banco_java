package com.banco.consulta;

import java.util.Locale;
import java.util.Scanner;

import com.banco.criar_conta.Dados;

public class Saldo {
	public static void saldo(Dados data) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);
		double saque;
		
		System.out.printf("Saldo atual: R$ %s\nDigite o valor para saque: \nR$ ", String.format("%.2f", data.saldo));
		saque = scan.nextDouble();
		
		if(saque < data.saldo) {	
			data.saldo = data.saldo - saque;
			System.out.printf("\nNovo saldo R$ %s\n", String.format("%.2f", data.saldo));
		}else {
			System.out.printf("\nValor invalido\n");			
		}
	}
}
