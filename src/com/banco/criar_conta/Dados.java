package com.banco.criar_conta;

import java.util.ArrayList;
import java.util.Arrays;

public class Dados {
	public String nomeCliente;
	public int conta;
	public int agencia;
	public double saldo;
	public String cpf;
	public String[] planos = {};
	
	public void planosArray(String args) {
		ArrayList<String> planosLista  = new ArrayList<String>(Arrays.asList(planos));
		planosLista.add(args);
		planos = planosLista.toArray(new String[0]);
	}
} 
