package com.estruturadedados.vetor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VetorObject {
	
	private Object[] elementos;
	private int tamanho;
	
	public VetorObject(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Object buscar(int posicao) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		return this.elementos[posicao];
	}
	
	public boolean buscar(Object elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento))
				return true;
				//return i;
		}
		return false;
		//return -1;
	}
	
	public boolean adicionar(Object elemento) {
		 this.aumentarCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	//Adicionar um elemento em determinada posiçãoa do array
	public boolean adicionar(int posicao, Object nome){
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
			Object[] elementosNovos = new Object[elementos.length * 2];
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
