package com.banco.criar_conta;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Criar Conta</h1>
 * <p>
 * 	Repassa os inputs para serem preenchidos pelos clientes.
 * </p>
 */
public class CriarConta {		
	static Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);

	public static void novaConta(Dados data) {
		try {
		System.out.printf("Por favor, digite seu nome!\n");
		data.nomeCliente = scan.next();
		
		System.out.println("Por favor, digite o número da conta!");
		data.conta = scan.nextInt();
		
		System.out.println("Por favor, digite sua agência!");
		data.agencia = scan.nextInt();

		System.out.println("Por favor, digite seu CPF!");
		data.cpf = scan.next();
		
		System.out.println("Por favor, digite o valor do primeiro depósito!");
		data.saldo = scan.nextDouble();
		
		System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco. \nSua agência é %s. \nConta %s. \nSaldo atual de R$ %s disponível para saque \n\n", data.nomeCliente, data.agencia, data.conta, String.format("%.2f", data.saldo));
		}catch (InputMismatchException e) {
			System.out.println("Valores invalidos, Conta, Agência e Valores devem ser apenas numeros");
		}
	}
	
	public static void naoTemConta(Dados data) {		
		System.out.println("Você ainda não tem conta aqui no nosso banco, deseja criar uma?");
		System.out.println("Sim [S] Não [N]");
		String resposta = scan.next();	
		
		if(resposta.equalsIgnoreCase("S")) {
			CriarConta.novaConta(data);
		}else if (resposta.equalsIgnoreCase("N")) {
			System.out.printf("\nVamos voltar então\n");
		} else {
			System.out.printf("\nNão entendi, digite S ou N\n");
		}
	}
}
