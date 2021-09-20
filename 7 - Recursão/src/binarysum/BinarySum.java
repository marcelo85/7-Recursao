package binarysum;

public class BinarySum {
	public static int soma_binaria(Integer[] A, int i, int n) {
		
		if(n == 1){
		    return A[i];
		}
		return soma_binaria(A, i, (n/2)) + soma_binaria(A, i + (n/2), (n/2)) ;
	}

}
