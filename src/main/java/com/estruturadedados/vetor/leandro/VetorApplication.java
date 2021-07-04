package com.estruturadedados.vetor.leandro;

import java.util.Scanner;

public class VetorApplication {

	public static void main(String[] args) {
		
		String[] estados = new String[5];
		
		estados[0] = "PE";
		estados[1] = "CE";
		estados[2] = "SP";
		estados[3] = "RJ";
		estados[4] = "SC";
		
		for(int i = 0; i < estados.length; i++) {
			System.out.println(estados[i]);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o que deseja:");
		String busca = input.nextLine();
		
		for(int x = 0; x < estados.length; x++) {
			if(busca.equals(estados[x])) {
				System.out.println("Resultado da busca: " + estados[x]);
				break;
			}else{
				System.out.println("Resultado não encontrado");
				
			}
		}
		
		
	}

}
