package com.estruturadedados.map;

import java.util.HashMap;
import java.util.Map;

public class MapApplication {

	public static void main(String[] args) {
		
		Map<String, Pessoa> pessoa = new HashMap<String, Pessoa>();
		
		pessoa.put("Key01", new Pessoa("Jefferson"));
		pessoa.put("Key02", new Pessoa("Hugo"));
		pessoa.put("Key03", new Pessoa("Luiz"));
		pessoa.put("Key04", new Pessoa("Ana"));
		pessoa.put("Key05", new Pessoa("Oliveira"));
		pessoa.put("Key06", new Pessoa("Cruz"));
		
		String keyPessoa = "Key05";
		
		if(pessoa.containsKey(keyPessoa)) {
			System.out.println("Chave = " + keyPessoa + " | Valor = " + pessoa.get(keyPessoa));
		}
		
		System.out.println();
		
		for(String key : pessoa.keySet()) {
			System.out.println("Chave = " + key + " Valor = " + pessoa.get(key));
		}

	}

}
