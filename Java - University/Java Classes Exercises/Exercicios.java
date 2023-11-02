
public class Exercicios {
	public void exercicio1(int[] array) {
		for(int i = array.length-1; i >= 0; i--)
			System.out.println(array[i]);		
	}
	
	public int[] exercicio2(int[] array) {
		 int[] retorno = new int[array.length];
		 for(int i=0, j=retorno.length-1; i<array.length; i++, j--)
		 retorno[j] = array[i];
		 return retorno;
		 }
	
	public int exercicio4(String[] array, String x) {
		for(int i = 0; i < array.length; i++) {
			if(array[i].equalsIgnoreCase(x))
				return i;
			return -1;
		}
		return 0;
	}
	
	 //Faça um método chamado exercicio5 que recebe um array de boolean e retorna 
	 //um array de inteiros contendo 1 nas posições que são true e 0 nas posições que são false
	public int[] exercicio5(boolean[] array) {
		int[] retorno = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			retorno[i] = array[i] ? 1 : 0;
			/*if(array[i])
				retorno[i] = 1;
			else
				retorno[i] = 0;*/
		}
		return retorno;
	}
	
	
	public static void main(String[] args) {
	    Exercicios e = new Exercicios();
	    
	    boolean[] a = {true, false, true, false, true, true};
	    
	    int[] resultado = e.exercicio5(a);
	    
	    for (int i = 0; i < resultado.length; i++) {
	        System.out.print(resultado[i] + " ");
	    }
	}

}
