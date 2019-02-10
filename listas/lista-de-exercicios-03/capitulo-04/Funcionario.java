class Funcionario{
///Exercicio 4.12
	private String nomeFuncionario;
	private double salario;
	private Data dataDeEntrada;

 private void recebeAumento(double aumento){
 	salario = salario+aumento;
 }
 private void calcularGanhoAnual(){
 	salario = salario*12;
 }
 private void mostra(){
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