class Empresa{
	String nomeEmpresa;
	Funcionario[] empregados;
	String cnpj;

	void adciona(Funcionario f){
		this.empregados[04]=f;
	}
	void mostraEmpregados(){
		for(int i = 0; i<this.empregados.length; i++){
			System.out.println("Funcionario na posicao: " + (i+1));
		}
	}
}