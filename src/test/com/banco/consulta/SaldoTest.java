package test.com.banco.consulta;

import test.com.banco.criar_conta.CriarContaTest;
import com.banco.criar_conta.Dados;
import test.com.banco.movimentacao.DepositoTest;
import test.com.banco.movimentacao.SaqueTest;

public class SaldoTest {
	public static void saldoTest(Dados data) {
		System.out.println("Digite seu CPF para procurarmos sua conta");		
		System.out.println("1");		
		String cpf = "1";
		String resposta = null;

		if(cpf.equalsIgnoreCase(data.cpf) && data.cpf != null) {
			System.out.printf("Saldo atual: R$ %s", String.format("%.2f", data.saldo));
			
			System.out.println("\nDeseja sacar ou depositar? Saque [S] Deposito [D] Nenhum [N]");
			resposta = "d";
				
			if (resposta.equalsIgnoreCase("S")) {
				
				SaqueTest.saqueTest(data);
				
			} else if (resposta.equalsIgnoreCase("D")) {
				
				DepositoTest.depositoTest(data);
				
			}else if (resposta.equalsIgnoreCase("N")) {
				System.out.println("Vamos voltar então\n");
			}else {
				System.out.print("Não entendi?");
			}
		}else {
			CriarContaTest.naoTemContaTest(data);
		}		
	}
}
