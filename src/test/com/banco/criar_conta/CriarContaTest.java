package test.com.banco.criar_conta;

import com.banco.criar_conta.Dados;

public class CriarContaTest {

	public static void novaContaTest(Dados data) {
		System.out.println("Por favor, digite seu nome!");
		System.out.println("Alezandro");
		data.nomeCliente = "Alezandro";
		
		System.out.println("Por favor, digite o número da conta!");
		System.out.println("523656");
		data.conta = 523656;
		
		System.out.println("Por favor, digite sua agência!");
		System.out.println("52");
		data.agencia = 52;

		System.out.println("Por favor, digite seu CPF!");
		System.out.println("1");
		data.cpf = "1";
		
		System.out.println("Por favor, digite o valor do primeiro depósito!");
		System.out.println("5262.23");
		data.saldo = 5262.23;
		
		System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco. \nSua agência é %s. \nConta %s. \nSaldo atual de R$ %s disponível para saque \n\n", data.nomeCliente, data.agencia, data.conta, String.format("%.2f", data.saldo));
	}
	
	public static void naoTemContaTest(Dados data) {
		System.out.println("Você ainda não tem conta aqui no nosso banco, deseja criar uma?");
		System.out.println("Sim [S] Não [N]");
		System.out.println("S");
		String resposta = "S";		
		
		if(resposta.equalsIgnoreCase("S")) {
			CriarContaTest.novaContaTest(data);
		}else if (resposta.equalsIgnoreCase("N")) {
			System.out.printf("\nVamos voltar então\n");
		} else {
			System.out.printf("\nNão entendi, digite S ou N\n");
		}
	}
}
