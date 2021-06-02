package com.estruturadedados.vetor;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class VetorApplication{

	public static void main(String[] args) {
		
		Contato c1 = new Contato("Jefferson", "1234-1111", "jefferson1@gmail.com");
		Contato c2 = new Contato("Hugo", "1234-2222", "hugo1@gmail.com");
		Contato c3 = new Contato("Luiz", "1234-3333", "luiz1@gmail.com");
		Contato c4 = new Contato("Cruz", "1234-4444", "cruz1@gmail.com");
		
		VetorObject vetor = new VetorObject(7);
		
		vetor.adicionar(c1);
		vetor.adicionar(c2);
		vetor.adicionar(c3);
		vetor.adicionar(c4);
		
		System.out.println(vetor.buscar(3));

	}

}
