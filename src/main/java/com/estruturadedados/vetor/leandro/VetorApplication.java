package com.estruturadedados.vetor.leandro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
		
		boolean encontrou = false;
		for(int x = 0; x < estados.length; x++) {
			if(busca.equalsIgnoreCase(estados[x])) {
				encontrou = true;
				break;
			}
		}	
		if(encontrou == true) {
			System.out.println("Resultado encontrado");	
		}else {
			System.out.println("Não encontrou o resultado!");
		}
		
		ArrayList<String> cidades = new ArrayList<>();
		cidades.add("Recife");
		cidades.add("Ipojuca");
		cidades.add("Cupira");
		
		Iterator iterator = cidades.iterator();
		
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}
		
	}

}
