package com.banco.consulta;

import java.util.Locale;
import java.util.Scanner;

import com.banco.criar_conta.CriarConta;
import com.banco.criar_conta.Dados;

public class ConsultaCPF {
	public static void consultaCPF(Dados data) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);
		
		System.out.printf("Informe seu CPF:\n");		
		String cpf = scan.nextLine();

		if (cpf.equalsIgnoreCase(data.cpf)) {
			System.out.printf(
					"\nEncontrei sua conta em nosso banco. \nSua agência é %s. \nConta %s. \nSaldo atual de R$ %s disponível para saque \n\n",
					data.agencia, data.conta, String.format("%.2f", data.saldo));
		} else {
			System.out.printf("Você ainda não tem conta, deseja criar uma? Sim [S] Não [N]\n");
			String resposta = scan.nextLine();

			if (resposta.equalsIgnoreCase("S")) {
				CriarConta.novaConta(data);
			} else if(resposta.equalsIgnoreCase("N")){
				System.out.printf("\nVamos voltar então\n");
			}else {
				System.out.printf("\nNão entendi, digite S ou N\n");				
			}
		}

	}
}
