package DSA.string;

public class Palindrome {
	
	
	public static void main(String[] args) {
		String s = "racecar";
		System.out.println(isPalindrome2(s));;

	}

	private static int  isPalindrome1(String s) { //T.C = O(n) & S.C = O(n)
		StringBuilder s1 = new StringBuilder();
		for(int i = s.length()-1;i>=0;i--) {
			s1.append(s.charAt(i));
		}
		return (s1.toString().equals(s))? 1:0;
	}
	
	private static int  isPalindrome2(String s) { //T.C = O(n) & S.C = O(n)
		int start = 0;
		int end = s.length()-1;
		s = s.toLowerCase();
		while(start<=end) {
			if(s.charAt(start) != s.charAt(end)) {
				return 0;
			}
			start++;end--;
		}
		return 1;
	}

}
