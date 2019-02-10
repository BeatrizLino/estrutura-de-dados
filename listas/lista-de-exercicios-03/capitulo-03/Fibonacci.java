class Fibonacci{
	///questao 06///
	public static void main(String[]args){
		int ant=0;
		int prox=1;
		int soma;
		System.out.println("sequencia Fibonacci:");
		while (ant<=100){
			soma = prox + ant;
			ant = prox;
			prox = soma;
			System.out.println(ant);
		}
	}
}