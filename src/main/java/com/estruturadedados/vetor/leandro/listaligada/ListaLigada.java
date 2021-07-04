package com.estruturadedados.vetor.leandro.listaligada;

public class ListaLigada {
	
	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;
	
	public ListaLigada() {
	}

	public ListaLigada(Elemento primeiro, Elemento ultimo, int tamanho) {
		this.primeiro = primeiro;
		this.ultimo = ultimo;
		this.tamanho = tamanho;
	}

	public Elemento getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}

	public Elemento getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
