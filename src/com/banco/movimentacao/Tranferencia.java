package com.banco.movimentacao;


import com.banco.criar_conta.Dados;

import java.util.Locale;
import java.util.Scanner;

public class Tranferencia {
    public static void tranferencia(Dados data) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ROOT);
        String resposta = "";
        int valor = 0;

        do {
            System.out.println("\nDigite o CPF da conta com 11 digitos a ser transferida(Só números):");
            String conta = scan.nextLine();

            if (conta.length() != 11) {
                System.out.println("CPF incorreto");
                System.out.println("Tentar novamente: Sim [S] Não [N]");
                resposta = scan.nextLine();
            } else {
                System.out.println("Qual o valor para fazer a tansferencia?");
                valor = scan.nextInt();

                if (valor > data.saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    data.saldo = data.saldo - valor;
                    System.out.println("Tranferencia bem sucedida, saldo atual: " + data.saldo);
                    resposta = "n";
                }
            }
        } while (!resposta.equalsIgnoreCase("N"));
    }
}
