package com.banco.planos;

import java.util.Locale;
import java.util.Scanner;

import com.banco.criar_conta.CriarConta;
import com.banco.criar_conta.Dados;

@SuppressWarnings("resource")
public class SeguroVida {	
	public static void planoVida(Dados data) {		
		Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);
		String planoSelecionado = null;
		String resposta = null;
		
		do{
			System.out.println("Qual plano de seguro de vida deseja ver:\n");
			System.out.println("Família [F] Casal [C] Solteiro [S] Voltar [V]\n");		
			planoSelecionado = scan.next();	
			
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
					System.out.println("Deseja contratar? Sim [S] Não [N]\n");					
					resposta = scan.next();	
					
					if(resposta.equalsIgnoreCase("S")) {
						if(data.cpf != null) {						
							System.out.println("Obrigado por contratar um de nossos planos\n");	
							data.planosArray(planoSelecionado);
						}else {
							CriarConta.naoTemConta(data);
						}
					} else if(resposta.equalsIgnoreCase("N")){
						System.out.printf("\nTudo bem, vamos voltar então\n");
					}else {
						System.out.printf("\nNão entendi, digite S ou N\n");				
					}
				}
			}
		}while (!planoSelecionado.equalsIgnoreCase("V"));
	}
	
}
