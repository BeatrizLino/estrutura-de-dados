package br.edu.ifce.estruturas.pilha;

public class TesteAdiciona {

	public static void main(String[] args) {
		
		Peca peca1 = new Peca();
		peca1.setNome("Base");
		
		Peca peca2 = new Peca();
		peca2.setNome("Motor");
	
		Peca peca3 = new Peca();
		peca3.setNome("Pneu");
		
		Pilha pilha1 = new Pilha();
		pilha1.adiciona(peca1);
		
		Pilha pilha2 = new Pilha();
		pilha2.adiciona(peca2);
		
		Pilha pilha3 = new Pilha();
		pilha3.adiciona(peca3);
		
		
		System.out.println(peca1);
		System.out.println(peca2);
		System.out.println(peca3);
	    
	}

}
