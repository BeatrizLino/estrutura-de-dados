package br.edu.ifce.estruturas.vetor;

public class TesteContemAluno {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor v1 = new Vetor();
		
		v1.adiciona(a1);
		v1.adiciona(a2);
		
		System.out.println(v1.contem(a1));
		System.out.println(v1.contem(a2));
		
		Aluno aluno = new Aluno();
		aluno.setNome("Ana");
		
		System.out.println(v1.contem(aluno));
		
	}

}
