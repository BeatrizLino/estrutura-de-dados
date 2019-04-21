package br.edu.ifce.estruturas.conjunto;

import java.util.List;

import br.edu.ifce.estruturas.conjunto.ConjuntoEspalhamento;

public class TesteAdiciona {

	public static void main(String[] args) {
		
	ConjuntoEspalhamento cel = new ConjuntoEspalhamento();
				
		
		cel.adiciona("Abrahao");
		cel.adiciona("Beatriz");
		cel.adiciona("Karol");
		cel.adiciona("kevin");
		cel.adiciona("Cesar");
		cel.adiciona("Ednaldo");
		cel.adiciona("Junior");
		cel.adiciona("Warlley");
		cel.adiciona("kevin");
		cel.adiciona("Cesar");

		
		List<String> palavras = cel.pegaTodas();

	    for (String palavra : palavras) {
	      System.out.println(palavra);
	    }
	}

}

