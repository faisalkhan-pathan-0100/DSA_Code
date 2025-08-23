package DSA;

public class FindGreatestCommonDivisorofArray {
	 
	 
	    public static  int findGCD(int[] nums) {
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;

	        // Find min and max
	        for (int num : nums) {
	            if (num < min) min = num;
	            if (num > max) max = num;
	        }

	        // Find GCD using Euclidean algorithm
	        return gcd(min, max);
	    }

	    private static int gcd(int n1, int n2) {
	        

	        int g = 1;
	         for(int i = 1;i<=Math.min(n1,n2);i++){
	            if(n1 % i== 0 && n2 %i ==0){
	                g = i;
	            }
	        }
	        return g;
	       
	    }
	

	public static void main(String[] args) {
		int[] arr = new int[] {2,5,6,9,10};
		int x = findGCD(arr);
		System.out.println(x);

	}

}
