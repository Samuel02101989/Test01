package com.indra.exerc02.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * 
 * @author Samuel Oliveira
 * @category Exerc02 Controller
 * @since 15-03-2018 - data de criaçao da classe
 * @version 1.0
 * 
 * @see MUINGA-1234
 */

import com.indra.exerc02.model.ClienteExerc02;

public class Exerc02Controller {
	
	public void listeTodosClientes(ArrayList<ClienteExerc02> clientes) {
		if(clientes.size() == 0) {
			JOptionPane.showMessageDialog(null, "Nao existe cadastro!!");
		}else {
			for(int i = 0; i < clientes.size(); i++) {
				ClienteExerc02 cli = new ClienteExerc02();
				
				System.out.println("NOme: " +cli.getNome());
				System.out.println("Rua: " +cli.getRua());
				System.out.println("Numero casa: "+cli.getNumeroCasa());
				System.out.println("Telefone: " +cli.getTelefone());
				System.out.println("Celular: " +cli.getCelular());
				System.out.println("CPF: " +cli.getCpf());
				System.out.println("CNPJ: " +cli.getCnpj());
				
			}
		}
	}
	
}
