package br.edu.ifce.estruturas.lista;

public class TesteTamanho {

	public static void main(String[] args) {
    ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		lista.adiciona("Beatriz");
		
		
		System.out.println(lista.tamanho());
		
		lista.adiciona("Willian");
		
		System.out.println(lista.tamanho());

	}

}
