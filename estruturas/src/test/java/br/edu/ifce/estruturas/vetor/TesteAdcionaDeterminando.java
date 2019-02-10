package br.edu.ifce.estruturas.vetor;

public class TesteAdcionaDeterminando {

	public static void main(String[] args) {
		Vetor v1 = new Vetor();

		Aluno a1 = new Aluno();
        a1.setNome("Abrahao");

        Aluno a2 = new Aluno();
        a2.setNome("Bia");

        Aluno a3 = new Aluno();
        a3.setNome("Karol");

        Aluno a4 = new Aluno();
        a4.setNome("Felipe");

        Aluno a5 = new Aluno();
        a5.setNome("Alisson");


        v1.adiciona(a1);
        System.out.println(v1);
	    v1.adiciona(a2);
	    System.out.println(v1);
		v1.adiciona(a3);
		System.out.println(v1);
		v1.adiciona(1, a4);
		System.out.println(v1);
		v1.adiciona(2, a5);
        System.out.println(v1);
	}

}
