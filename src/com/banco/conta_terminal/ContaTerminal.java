package com.banco.conta_terminal;

import java.util.Locale;
import java.util.Scanner;

import com.banco.consulta.ConsultaCPF;
import com.banco.consulta.Saque;
import com.banco.criar_conta.CriarConta;
import com.banco.criar_conta.Dados;
import com.banco.planos.SeguroVida;

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
public class ContaTerminal {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Dados data = new Dados();

		String resposta;

		Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);

		do {
			System.out.println("Oque deseja fazer?" + "\nFazer uma nova conta [N]"
					+ "\nConsultar se tem conta aberta em seu nome [C]" 
					+ "\nRealizar um saque na conta [S]"
					+ "\nPlanos [P]"
					+ "\nFechar [F]");
			resposta = scan.nextLine();

			if (resposta.equalsIgnoreCase("N")) {
				
//				CriarConta.novaConta(data);
				CriarConta.testNovaConta(data);
				
			} else if(resposta.equalsIgnoreCase("C")) {
				
				ConsultaCPF.consultaCPF(data);
				
			}else if (resposta.equalsIgnoreCase("S")) {
				
				Saque.saque(data);
				
			}else if (resposta.equalsIgnoreCase("P")) {
				
//				SeguroVida.planoVida(data);
				SeguroVida.testPlanoVida(data);
				
			}else if (resposta.equalsIgnoreCase("F")) {
				
				System.out.printf("\nVolte sempre!\n");
				
				scan.close();
				
				return;
				
			} else {
				
				System.out.println("Não entendi. Por favor, responda S ou N\n");
				
			}

		} while (!resposta.equalsIgnoreCase("N") || resposta.equalsIgnoreCase("N"));

	}
}
