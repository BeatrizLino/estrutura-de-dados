import java.util.Scanner;
public class TesteFuncionario{
	
	public static void main(String[]args){
		Funcionario f1 = new Funcionario();
		System.out.println("Digite o salario do Funcionario:");
        Scanner sc = new Scanner(System.in);
        double salarioLido = sc.nextInt();
        f1.nome = "Hugo";
		f1.setSalario(salarioLido);
		f1.recebeAumento(50);
		Data data = new Data();
		f1.dataDeEntrada = data;
		f1.dataDeEntrada.dia = 13;
		f1.dataDeEntrada.mes = 07;
		f1.dataDeEntrada.ano = 1999;
		f1.mostra();

	}
}