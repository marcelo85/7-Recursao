package reversearray;

public class ReverseArray {
  public static void main(String[] args) {
    Integer[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    System.out.println(Reverse_Array(A, 0, A.length-1));
  }
  
  public static int Reverse_Array(Integer[] A, int i, int j){
    if (i < j) {
      int aux = A[i];
      A[i] = A[j];
      A[j] = aux;    
      
    }
           
	return Reverse_Array(A, i+1, j-1);
  }
}
