package br.edu.ifce.estruturas.vetor;

public class TesteTamanho {

	public static void main(String[] args) {
		Vetor v1 = new Vetor();

		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		v1.adiciona(a1);
		v1.adiciona(a2);
		v1.adiciona(a3);
		System.out.println(v1.tamanho());
	}

}
