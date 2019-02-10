class Funcionario{

       String nome;
 private double salario;
        Data dataDeEntrada;

 public double getSalario(){
 	return this.salario;
 }

 public void setSalario(double salario){
 	this.salario = salario;
 }

 public void recebeAumento(double aumento){
 	salario = salario+aumento;
 }
 public void calcularGanhoAnual(){
 	salario = salario*12;
 }
 public void mostra(){
 	System.out.println("Nome do Funcionario: " + this.nome);
	System.out.println("Salario Atual: " + this.getSalario());
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