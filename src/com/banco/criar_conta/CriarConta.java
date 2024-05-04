package com.banco.criar_conta;

import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Criar Conta</h1>
 * <p>
 * 	Repassa os inputs para serem preenchidos pelos clientes.
 * </p>
 */
public class CriarConta {
		
	public static void novaConta(Dados data) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);
		
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
	}
	
	public static void testNovaConta(Dados data) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);
		
		System.out.printf("Por favor, digite seu nome!\n");
		data.nomeCliente = "Alezandro";
		
		System.out.println("Por favor, digite o número da conta!");
		data.conta = 523656;
		
		System.out.println("Por favor, digite sua agência!");
		data.agencia = 52;

		System.out.println("Por favor, digite seu CPF!");
		data.cpf = "1";
		
		System.out.println("Por favor, digite o valor do primeiro depósito!");
		data.saldo = 5262.23;
		
		System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco. \nSua agência é %s. \nConta %s. \nSaldo atual de R$ %s disponível para saque \n\n", data.nomeCliente, data.agencia, data.conta, String.format("%.2f", data.saldo));

	}
}
