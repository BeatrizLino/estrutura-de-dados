import java.util.Scanner;
class Fatorial{ 
	///Questao 04///
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de N: ");
		int num = sc.nextInt();
		for(int i = 1; i<= 10; i++){
			int numeroFatorado = new Fatorial().calculaFatorial(i);
			System.out.println("Fatorial de " +i+ "=" +numeroFatorado);

		}
	}
public int calculaFatorial(int num){
	if(num == 0){
		return num+1;
	}
	int contador = num;
	while (contador > 1){
		num = num * (contador - 1);
		contador --;
	}
	return num;
}
}