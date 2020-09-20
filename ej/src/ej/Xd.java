package ej;

public class Xd {
	
	public static int algoritmo(int n) {
		int cantidad = 0;
		
		cantidad++;
		int i = 0;
		
		cantidad++;
		int j = 0;
		
		cantidad++;
		int k = 0;
		
		cantidad++;
		for( i = n/2; i<=n; i++) {
			
			cantidad++;
			for(j=2; j<=n; j*=2) {
				cantidad++;
				k = k + n/2;
				
				cantidad++;
			}
			cantidad++;
		}
		cantidad ++;
		return cantidad;
		
	}
	
	public static int algoritmo2(int[] arreglo) {
		int a = 0;
		int b = 0;
		for(int i = 0; i<arreglo.length; i++) {
			int c = arreglo[i];
			int d = 0;
			for (int j = i; j < arreglo.length; j++) {
				if(arreglo[j] == c) {
					d++;
				}
			}
			if(d>b) {
				b = d;
				a = c;
			}
		}
		return a;
	}

	
	public static void main(String[] args) {
		//System.out.println(algoritmo(0));
		int[] arreglo = {5, 5, 9, 2, 5, 2, 6, 9, 2, 2, 5, 2};
		int[] arreglo2 = {7, 4, 7, 8, 1, 8, 8};
		System.out.println(algoritmo2(arreglo2));
	}

}
