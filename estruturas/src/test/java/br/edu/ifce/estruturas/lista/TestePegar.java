package br.edu.ifce.estruturas.lista;

public class TestePegar {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
				
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		lista.adiciona("Joao");
		lista.adiciona("Carlos");
		lista.adiciona("Beatriz");
			
		System.out.println(lista.pega(2));
		System.out.println(lista.pega(3));
				

	}

}
