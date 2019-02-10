class TesteFuncionario{
	///Exercicio 4.12
	public static void main(String[]args){
		Funcionario f1 = new Funcionario();

		f1.nomeFuncionario = "Hugo";
		f1.salario = 100;
		f1.recebeAumento(50);
		Data data = new Data();
		f1.dataDeEntrada = data;
		f1.dataDeEntrada.dia = 13;
		f1.dataDeEntrada.mes = 07;
		f1.dataDeEntrada.ano = 1999;
		f1.mostra();

		//Funcionario f2 = f1;
		Funcionario f2 = new Funcionario();

		f2.nomeFuncionario = "Danilo";
		f2.salario = 100;
		f2.recebeAumento(50);
		f2.dataDeEntrada = data;
		f2.dataDeEntrada.dia = 14;
		f2.dataDeEntrada.mes = 11;
		f2.dataDeEntrada.ano = 2010;
		f2.mostra();

		if (f1 == f2){
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");
		}

	}
}