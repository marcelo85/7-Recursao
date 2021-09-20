package recursivefactorial;

public class RecursiveFactorial {
	public static int recursiveFactorial(int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return n * recursiveFactorial(n-1);
        }
    }
}
