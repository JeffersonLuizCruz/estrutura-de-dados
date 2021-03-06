package com.estruturadedados.vetor;

public class Lista<T> {

	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public Object buscar(int posicao) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		return this.elementos[posicao];
	}

	public boolean buscar(T elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento))
				return true;
			//return i;
		}
		return false;
		//return -1;
	}

	public boolean adicionar(T elemento) {
		this.aumentarCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	//Adicionar um elemento em determinada posiçãoa do array
	public boolean adicionar(int posicao, T nome){
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

	private void aumentarCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[elementos.length * 2];
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
