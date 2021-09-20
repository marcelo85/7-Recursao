package recursivefactorial;

public class RecursiveFactorial2 {
	public static void main(String[] args) {
	    System.out.println(recursiveFactorial(6));
	 }
	  public static int recursiveFactorial(int n) {
	    if(n == 0) {
	        return 1;
	    }
	    else {
	        return n * recursiveFactorial(n-1);
	    }
	  }
}
