class Fibdesafio{
	///questao desafio///
	public static void main(String[]args){
		long numX=0, numY=1, result;
		for(int num = 0; num<=20; num++){
			if(num == 0){
				result = numX;
			}
			else if(num==1){
				result = numY;			
			}
			else{
				result = numX + numY;
				numX = numY;
				numY = result;
				System.out.println("Fibonacci de " + num + " e: " + numX);
			}
		}
	}
}