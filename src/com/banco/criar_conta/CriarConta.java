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
	Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);
	
	String nomeCliente = null;
	int numero = 0;
	String agencia = null;
	double saldo = 0;
	
	public void novaConta(String[] args) {
		System.out.println("Por favor, digite seu nome !");
		nomeCliente = scan.next();
		
		System.out.println("Por favor, digite o número da agência !");
		numero = scan.nextInt();
		
		System.out.println("Por favor, digite sua agência !");
		agencia = scan.next();
		
		System.out.println("Por favor, digite o valor do primeiro depósito !");
		saldo = scan.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. \nSua agência é %s. \nConta %s. \nSaldo atual de R$ %s disponível para saque \n", nomeCliente, agencia, numero, saldo);
	}
}
