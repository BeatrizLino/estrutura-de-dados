package br.edu.ifce.estruturas.pilha;

public class TesteVazia {

	public static void main(String[] args) {
    Pilha p1 = new Pilha();
    Peca peca1 = new Peca();
	peca1.setNome("Base");
	
	Peca peca2 = new Peca();
	peca2.setNome("Motor");
	
	Peca peca3 = new Peca();
	peca3.setNome("Pneu");
	
	p1.adiciona(peca1);
	p1.adiciona(peca2);
	p1.adiciona(peca3);
		
		
		System.out.println(p1.vazia());

	}

}
