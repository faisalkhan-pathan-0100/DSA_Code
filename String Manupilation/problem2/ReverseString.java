package DSA.string;

public class ReverseString {

	public static void main(String[] args) {
		String s = "faisalkhan";
		reverse1(s);

	}

	private static void reverse(String s) {  // TC - n, SC - n
		StringBuilder sb = new StringBuilder();
		int i = s.length()-1;
		while(i>=0) {
			sb.append(s.charAt(i));
			i--;
		}
		System.out.println(sb.toString());
		
	}
	
	private static void reverse1(String s) {  // TC - n, SC - n
		int start = 0;
		int end = s.length()-1;
		StringBuilder sb = new StringBuilder(s);
		while(start<end) {
			char ch = s.charAt(start);
			sb.setCharAt(start, s.charAt(end));
			sb.setCharAt(end, ch);
			start++;end--;
		}
		System.out.println(sb.toString());
	}

}
