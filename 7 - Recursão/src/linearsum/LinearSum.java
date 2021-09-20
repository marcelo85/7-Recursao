package linearsum;

public class LinearSum {
	public static void main(String[] args) {

		int[] A={0,1,2,3,4,5,6};
		int n = 4;
		for(int i = 0; i <= n; i++){
		    linearSum(A, n);
		    if(i == n){
		        System.out.println(i);
		    }
		}

	}

	public static int linearSum(int[] A,int n){

		if(n == 1){
		    return A[0];
		}
		else{
		    return linearSum(A, n-1) + A[n-1];
		}
	}

}
