class Funcionario{
///Exercicio 4.12
	String nomeFuncionario;
	double salario;
	Data dataDeEntrada;

 void recebeAumento(double aumento){
 	salario = salario+aumento;
 }
 void calcularGanhoAnual(){
 	salario = salario*12;
 }
 void mostra(){
 	System.out.println("Nome do Funcionario: " + this.nomeFuncionario);
	System.out.println("Salario Atual: " + this.salario);
	System.out.println("Salario com aumento: " + this.salario);
	this.calcularGanhoAnual();
    System.out.println("Ganho Anual: " + this.salario);
    System.out.println("Dia: " + this.dataDeEntrada.dia);
    System.out.println("Mes: " + this.dataDeEntrada.mes);
    System.out.println("Ano: " + this.dataDeEntrada.ano);
    this.dataDeEntrada.formatada();
    System.out.println("A data de entrada eh: " + this.dataDeEntrada.formatada());
 } 
}