package br.edu.ifce.estruturas.pilha;

public class TesteRemove {

	public static void main(String[] args) {
		Peca peca1 = new Peca();
		peca1.setNome("Base");
		
		Pilha pilha1 = new Pilha();
		pilha1.adiciona(peca1);
		
		Peca peca2 = new Peca();
		peca2.setNome("Motor");
		
		Pilha pilha2 = new Pilha();
		pilha2.adiciona(peca2);
		
		Peca peca3 = new Peca();
		peca3.setNome("Pneu");
		
		Pilha pilha3 = new Pilha();
		pilha3.adiciona(peca3);
		
		
		System.out.println(pilha1.remove());
		
		
	}

}
