package br.edu.ifce.estruturas.lista;

public class TesteAdicionaPosicao {

	public static void main(String[] args) {
		
ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona(0,"Paulo");
		lista.adiciona(1,"Joao");
		lista.adiciona(3,"Carlos");
		lista.adiciona("Beatriz");
	
		System.out.println(lista);
	}

}
