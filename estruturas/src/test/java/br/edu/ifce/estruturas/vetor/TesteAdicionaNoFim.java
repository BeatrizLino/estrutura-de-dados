package br.edu.ifce.estruturas.vetor;

public class TesteAdicionaNoFim {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("João");
		a2.setNome("José");
		a3.setNome("Cleziana");
		
		Vetor v1 = new Vetor();
		
		v1.adiciona(a1);
		v1.adiciona(a2);
		v1.adiciona(a3);
		
		System.out.println(v1);
	}
	
}
