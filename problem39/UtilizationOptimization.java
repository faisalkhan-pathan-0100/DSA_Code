package DSA;
import java.util.*;
public class UtilizationOptimization {
	
	static long maxPerson(int n) { //log(m)
		Scanner sc = new Scanner(System.in);
		
	    long low = 1;
	    long high = (long)1e6;
	    long person = 0;
	    while(low<=high) {
	    	long mid = (high + low) /2;
	    	long sum = mid * (mid+1)/2;
	    	
	    	if(sum<=n) {
	    		person = mid;
	    		low = mid + 1;
	    	}else {
	    		high = mid - 1;
	    	}
	    }
	    return person;
	}

	    static long maxPerson1(long n) { // root(n)
	        if (n <= 0) return 0;

	        
	        long k = (long) Math.floor((Math.sqrt(1.0 + 8.0 * n) - 1.0) / 2.0);

	        
	        while (k * (k + 1) / 2 > n) k--;
	        // or push up if we can still fit (rare but safe)
	        while ((k + 1) > 0 && ((k + 1) * (k + 2)) / 2 <= n) k++;

	        return k;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of balls: ");
		System.out.println(maxPerson(sc.nextInt()));
		sc.close();
	}

}
// binary search approach - method0
//math formula - method1