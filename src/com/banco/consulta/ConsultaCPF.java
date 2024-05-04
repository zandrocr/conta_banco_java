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
			System.out.printf("\nEncontrei sua conta em nosso banco.");
			System.out.printf("\nAgência: %s", data.agencia);
			System.out.printf("\nConta: %s", data.conta);
			System.out.printf("\nSaldo: %s", String.format("%.2f", data.saldo));
			System.out.printf("\nPlanos: ");
			for(int i = 0; i < data.planos.length; i++) {
				System.out.print(data.planos[0]);
				if(i < data.planos.length - 1) {
					System.out.print(", ");
				}else {
					System.out.println("\n");					
				}
			}
		} else {
			System.out.printf("Você ainda não tem conta, deseja criar uma? Sim [S] Não [N]\n");
			String resposta = scan.nextLine();

			if (resposta.equalsIgnoreCase("S")) {
				CriarConta.novaConta(data);
			} else if (resposta.equalsIgnoreCase("N")) {
				System.out.printf("\nVamos voltar então\n");
			} else {
				System.out.printf("\nNão entendi, digite S ou N\n");
			}
		}

	}
}
