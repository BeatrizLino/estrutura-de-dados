class Pessoa{
	///exercicio 4.14
	String nome;
	int idade;


	void fazAniversario(){
		idade++;
	}
	void mostra(){
		System.out.println("Nome da pessoa: " + this.nome);
		System.out.println("Idade: " + this.idade);
		this.fazAniversario();
		System.out.println("Proxima idade eh: " + this.idade);
	}
}