package com.banco.conta_terminal;

import java.util.Locale;
import java.util.Scanner;

import com.banco.criar_conta.CriarConta;

/**
 * <h1>Conta Terminal</h1>
 * <p>
 * 	Cria uma nova conta no banco, dando a opção do cliente fazer a conta, não fazer e sair do sistema
 * </p>
 *
 * @author zandrocr
 * @version 1.0
 * @since 01/05/2024
 */
public class ContaTerminal {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		CriarConta conta = new CriarConta();
		String resposta;

		Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);

		do {
			System.out.println("\nDeseja fazer nova uma conta? [S]Sim / [N]Não / [F] Fechar");
			resposta = scan.nextLine();

			if (resposta.equalsIgnoreCase("S")) {
				conta.novaConta(args);
			} else if (resposta.equalsIgnoreCase("N")) {
				System.out.printf("\nVolte sempre!\n");
			} else if (resposta.equalsIgnoreCase("F")) {
				System.out.printf("\nVolte sempre!\n");
				scan.close();
				return;
			} else {
				System.out.println("Não entendi. Por favor, responda S ou N\n");
			}
		} while (!resposta.equalsIgnoreCase("N") || resposta.equalsIgnoreCase("N"));

	}
}
