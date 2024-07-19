package com.banco.conta_terminal;

import java.util.Locale;
import java.util.Scanner;

import com.banco.consulta.ConsultaCPF;
import com.banco.consulta.Saldo;
import com.banco.criar_conta.CriarConta;
import com.banco.criar_conta.Dados;
import com.banco.planos.SeguroVida;
import test.com.banco.consulta.ConsultaCPFTest;
import test.com.banco.consulta.SaldoTest;
import test.com.banco.criar_conta.CriarContaTest;
import test.com.banco.planos.SeguroVidaTest;

/**
 * <h1>Conta Terminal</h1>
 * <p>
 * Cria uma nova conta no banco, dando a opção do cliente fazer a conta, não
 * fazer e sair do sistema
 * </p>
 *
 * @author zandrocr
 * @version 1.0
 * @since 01/05/2024
 */
@SuppressWarnings("resource")
public class ContaTerminal {
	public static void main(String[] args) {
		Dados data = new Dados();

		String resposta;

		Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);

		do {
			System.out.println("Olá Tudo bem?");
			System.out.println("Oque deseja fazer?\n");
			System.out.println("Fazer uma nova conta [N]");
			System.out.println("Consultar se tem conta aberta em seu nome [C]");
			System.out.println("Realizar uma movimentação na conta [S]");
			System.out.println("Planos [P]");
			System.out.println("Fechar [F]");
			resposta = scan.nextLine();

			if (resposta.equalsIgnoreCase("N")) {
				
//				CriarConta.novaConta(data);
				CriarContaTest.novaContaTest(data);

			} else if(resposta.equalsIgnoreCase("C")) {
				
//				ConsultaCPF.consultaCPF(data);
				ConsultaCPFTest.consultaCPFTest(data);
				
			}else if (resposta.equalsIgnoreCase("S")) {
				
				Saldo.saldo(data);
//				SaldoTest.saldoTest(data);
				
			}else if (resposta.equalsIgnoreCase("P")) {
				
//				SeguroVida.planoVida(data);
				SeguroVidaTest.planoVidaTest(data);
				
			}else if (resposta.equalsIgnoreCase("F")) {				
				System.out.printf("\nVolte sempre!\n");				
				scan.close();
				break;
			} else {
				
				System.out.println("Não entendi!");
				
			}

		} while (!resposta.equalsIgnoreCase("F"));

	}
}
