package com.banco.consulta;

import java.util.Locale;
import java.util.Scanner;

import com.banco.criar_conta.CriarConta;
import com.banco.criar_conta.Dados;
import com.banco.movimentacao.Deposito;
import com.banco.movimentacao.Saque;

@SuppressWarnings("resource")
public class Saldo {
	public static void saldo(Dados data) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);
		String resposta = null;

		System.out.println("Digite seu CPF para procurarmos sua conta");
		String cpf = scan.next();
		
		do {
			if (cpf.equalsIgnoreCase(data.cpf) && data.cpf != null) {
				System.out.printf("Saldo atual: R$ %s", String.format("%.2f", data.saldo));
				
				System.out.println("\nDeseja sacar ou depositar? Saque [S] Deposito [D] Nenhum [N]");
				resposta = scan.next();
					if (resposta.equalsIgnoreCase("S")) {				
						Saque.saque(data);
						
					} else if (resposta.equalsIgnoreCase("D")) {				
						Deposito.deposito(data);
						
					} else if (resposta.equalsIgnoreCase("N")) {
						System.out.println("Vamos voltar então\n");
						
					} else {
						System.out.println("Não entendi?\n");
						
					}
			} else {
				CriarConta.naoTemConta(data);			
			}
		}while (!resposta.equalsIgnoreCase("N"));

	}
}
