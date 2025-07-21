package DSA;

public class isPalindrome {
	
	public static boolean isPalindrome(int x) {
		 
	        if(x<0)
	            return false;
	        int newNum = 0;
	        int temp = x;
	        while(temp != 0)
	        {
	            newNum = newNum*10 + temp % 10;
	            temp = temp/10;
	        }
	        return newNum == x;
	    }
    
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(1213));
	}

}
