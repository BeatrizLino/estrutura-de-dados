import java.util.Scanner;
class Valor{
	///questao 08//
public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de X: ");
		int x = sc.nextInt();
		while(x>1){
		if (x%2 == 0){
		x = x/2;
		System.out.println(x);
		}else{
		x = 3 * x + 1;
        System.out.println(x);
		}
		}
	}
}