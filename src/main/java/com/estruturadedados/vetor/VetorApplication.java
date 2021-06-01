package com.estruturadedados.vetor;

public class VetorApplication{

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionar("B");
		vetor.adicionar("C");
		vetor.adicionar("D");
		vetor.adicionar("E");
		vetor.adicionar("X");
		
		System.out.println(vetor);
		
		vetor.adicionar(3, "Y");
		System.out.println(vetor);

	}

}
