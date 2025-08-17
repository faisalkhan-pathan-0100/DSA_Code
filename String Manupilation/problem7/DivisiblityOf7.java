package DSA.string;

public class DivisiblityOf7 {
	static boolean isDivisible(int n ) {
			if(n == 0) {
				return true;
			}
			while(n>=7) {
				n -=7;
			}
			return n == 0;
	}
	
	static boolean isDivisible1(int n) {
		while(n>7) {
			n = n / 10 - 2 * (n %10);
		}
		 
			return n == 7 || n == 0;
		
		
	}
	public static void main(String[] args) {
		 
		if(isDivisible1(63)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
