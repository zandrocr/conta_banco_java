package com.banco.planos;

import com.banco.criar_conta.CriarContaTest;
import com.banco.criar_conta.Dados;

public class SeguroVidaTest {
	public static void planoVidaTest(Dados data) {	
		String planoSelecionado = null ;
		String resposta = null;
		do{
			for(int i = 0; i <= 1; i++) {
				System.out.println("Qual plano de seguro de vida deseja ver:\n");
				System.out.println("Família [F] Casal [C] Solteiro [S] Voltar [V]\n");		
				System.out.println("F");		
				planoSelecionado = "F";	
				
				if(i == 1) {
					planoSelecionado = "V";					
				}
				
				switch (planoSelecionado) {
					case "F","f": {		
						System.out.println("Assistência funeral individual gratuita");
						System.out.println("Morte natural ou morte acidental");	
					}
					case "C", "c": {		
						System.out.println("Invalidez permanente total ou parcial por acidente");
						System.out.println("Capital em dobro para morte acidental");
					}
					case "S","s": {		
						System.out.println("Despesas imediatas\n");
						System.out.println("Deseja contratar? Sim [S] Não [N]");
						System.out.println("S");
						resposta = "S";
						
						if(resposta.equalsIgnoreCase("S")) {
							if(data.cpf != null) {						
								System.out.println("Obrigado por contratar um de nossos planos");	
								data.planosArray(planoSelecionado);
							}else {
								CriarContaTest.naoTemContaTest(data);
							}
						} else if(resposta.equalsIgnoreCase("N")){
							System.out.printf("\nTudo bem, vamos voltar então\n");
						}else {
							System.out.printf("\nNão entendi, digite S ou N\n");				
						}
					}
				}
			};
		}while (planoSelecionado != "V");
	}
}
