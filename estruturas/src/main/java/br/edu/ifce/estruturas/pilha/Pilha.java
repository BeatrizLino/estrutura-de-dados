package br.edu.ifce.estruturas.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	
	List<Peca> pecas = new LinkedList<Peca>();

	public void adiciona(Peca p){
		
		this.pecas.add(p);
		
	}
	public Peca remove() {
		
		return this.pecas.remove(this.pecas.size()-1);
		
	}
	public boolean vazia() {
		
		return this.pecas.size() == 0;
		
	}
		
	public String toString(){
		return this.pecas.toString();
	}
	

}
