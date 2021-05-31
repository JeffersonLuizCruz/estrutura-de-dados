package com.estruturadedados.vetor;

public class VetorApplication{

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionar("Elemento 1");
		vetor.adicionar("Elemento 2");
		vetor.adicionar("Elemento 3");
		vetor.adicionar("Elemento 4");
		
		System.out.println(vetor.buscar("Elemento 5"));

	}

}
