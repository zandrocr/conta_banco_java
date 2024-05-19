package com.banco.consulta;

import com.banco.criar_conta.CriarContaTest;
import com.banco.criar_conta.Dados;

public class ConsultaCPFTest {
	public static void consultaCPFTest(Dados data) {
		System.out.printf("Informe seu CPF:\n");
		String cpf = "1";

		if (cpf.equalsIgnoreCase(data.cpf)) {
			System.out.printf("\nEncontrei sua conta em nosso banco.");
			System.out.printf("\nAgência: %s", data.agencia);
			System.out.printf("\nConta: %s", data.conta);
			System.out.printf("\nSaldo: %s", String.format("%.2f", data.saldo));
			System.out.printf("\nPlanos: ");
			if (data.planos.length == 0)
				System.out.println("");
			for(int i = 0; i < data.planos.length; i++) {
				System.out.print(data.planos[i]);
				if(i < data.planos.length - 1) {
					System.out.print(", ");
				}else {
					System.out.println("\n");					
				}
			}
		} else {
			System.out.printf("Você ainda não tem conta, deseja criar uma? Sim [S] Não [N]\n");
			String resposta = "s";

			if (resposta.equalsIgnoreCase("S")) {
				CriarContaTest.novaContaTest(data);
			} else if (resposta.equalsIgnoreCase("N")) {
				System.out.printf("\nVamos voltar então\n");
			} else {
				System.out.printf("\nNão entendi, digite S ou N\n");
			}
		}

	}
}
