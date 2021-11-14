package edu.newton.ldp.u7.lab7.ex2;

public class MainEx2 {

	/**
	 * Ex2:
	 * Entrada: um vetor de chaves (inteiros) V previamente ordenado e uma chave de busca X
	   Saída: informar se X ocorre em V
	   Obs: Implementar a pesquisa binária por iteração e por recursão
	 */
	
	private static int iterativo(int arr[], int x) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			int middle = left + (right - left) /2;
			
			if(arr[middle] == x) {
				return middle;
			} else if(arr[middle] < x) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}
		
		return -1; 
	}
	
	private static int recursivo(int arr[], int left, int right, int x) {
		
		if(left <= right) {
			int middle = left + (right - left) / 2;
			
			// igual
			if(arr[middle] == x) {
				return middle;
			} else if(arr[middle] > x) {
				return recursivo(arr, left, middle -1, x);
			} else if(arr[middle] < x) { 
				return recursivo(arr, middle + 1, right, x);
			} 
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 4, 7, 11, 15, 33, 40};
		
		System.out.println(iterativo(arr, 40));
		
		System.out.println(recursivo(arr, 0, 6, 2));
	}
}