package com.banco.planos;

import java.util.Locale;
import java.util.Scanner;

import com.banco.criar_conta.CriarConta;
import com.banco.criar_conta.Dados;

public class SeguroVida {	
	public static void planoVida(Dados data) {		
		Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);
		System.out.println("Qual plano de seguro de vida deseja ver:\n");
		System.out.println("Família [F] Casal [C] Solteiro [S]\n");		
		String planoSelecionado = scan.next();		
		
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
				String resposta = scan.next();	
				if(resposta.equalsIgnoreCase("S")) {
					if(data.cpf != "") {						
						System.out.println("Obrigado por contratar um de nossos planos");	
						data.planosArray(planoSelecionado);
					}else {
						System.out.println("Você ainda não tem conta aqui no nosso banco, deseja criar uma?");
						System.out.println("Sim [S] Não [N]");
						resposta = scan.next();						
						if(resposta.equalsIgnoreCase("S")) {
							CriarConta.novaConta(data);
						}else if (resposta.equalsIgnoreCase("N")) {
							System.out.printf("\nVamos voltar então\n");
						} else {
							System.out.printf("\nNão entendi, digite S ou N\n");
						}
					}
				} else if(resposta.equalsIgnoreCase("N")){
					System.out.printf("\nTudo bem, vamos voltar então\n");
				}else {
					System.out.printf("\nNão entendi, digite S ou N\n");				
				}
			}
		}
	}
	public static void testPlanoVida(Dados data) {	
		System.out.println("Qual plano de seguro de vida deseja ver:\n");
		System.out.println("Família [F] Casal [C] Solteiro [S]\n");	
		String planoSelecionado = "F" ;
		
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
			String resposta = "S";
			if(resposta.equalsIgnoreCase("S")) {
				if(data.cpf.length() >= 1) {						
					System.out.println("Obrigado por contratar um de nossos planos");	
					data.planosArray(planoSelecionado);
				}else {
					System.out.println("Você ainda não tem conta aqui no nosso banco, deseja criar uma?");
					System.out.println("Sim [S] Não [N]");
					resposta = "S";						
					if(resposta.equalsIgnoreCase("S")) {
						CriarConta.testNovaConta(data);
					}else if (resposta.equalsIgnoreCase("N")) {
						System.out.printf("\nVamos voltar então\n");
					} else {
						System.out.printf("\nNão entendi, digite S ou N\n");
					}
				}
			} else if(resposta.equalsIgnoreCase("N")){
				System.out.printf("\nTudo bem, vamos voltar então\n");
			}else {
				System.out.printf("\nNão entendi, digite S ou N\n");				
			}
		}
	}
	}
}
