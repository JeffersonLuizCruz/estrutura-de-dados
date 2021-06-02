package com.estruturadedados.vetor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
//	public void adicionar(String elemento) {
//		for(int i = 0; i < elemento.length(); i++)
//		
//			if(this.elementos[i] == null) {
//			this.elementos[i] = elemento;
//			break;
//		}
//	}
	
	
//	// Vetor melhorado
//	public void adicionar(String elemento) {
//		this.elementos[this.tamanho] = elemento;
//		this.tamanho ++;
//		
//	}
	
	public String buscar(int posicao) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		return this.elementos[posicao];
	}
	
	public boolean buscar(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento))
				return true;
				//return i;
		}
		return false;
		//return -1;
	}
	
	public boolean adicionar(String elemento) {
		 this.aumentarCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	//Adicionar um elemento em determinada posiçãoa do array
	public boolean adicionar(int posicao, String nome){
		aumentarCapacidade();
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Comando Inválido!");
        }
             for(int i = this.tamanho-1; i >= posicao; i--) {
                 this.elementos[i+1] = this.elementos[i];
             }
            this.elementos[posicao] = nome;
            this.tamanho++;
        return true;
	}
	
	public void remover(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Comando Inválido!");
        }
        for(int i = posicao; i < this.tamanho; i++) {
        	this.elementos[i] = this.elementos[i +1];
        }
		this.tamanho--;
	}
	
	public void aumentarCapacidade() {
		if(this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[elementos.length * 2];
			for(int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0; i < this.tamanho; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho -1]);
		}
		
		s.append("]");
		
		return s.toString();

	}
	
	

}
