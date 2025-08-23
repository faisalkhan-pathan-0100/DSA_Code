package DSA;

public class UglyNumber {
	public static boolean isUgly(int n) {
	    if (n <= 0) return false; // negative and zero are not ugly

	    while (n != 1) {
	        if (n % 2 == 0) {
	            n /= 2;
	        } else if (n % 3 == 0) {
	            n /= 3;
	        } else if (n % 5 == 0) {
	            n /= 5;
	        } else {
	            return false; // found a prime factor other than 2,3,5
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		System.out.println(isUgly(8));
	}

}
