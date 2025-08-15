package DSA.string;

public class FIrstNonRepeatingCharOfString {

	public static void main(String[] args) {
		String s1 = "faisalf";
		 char ch =firstNonRepeatingChar(s1);
		 System.out.println(ch);
	}

	private static char  firstNonRepeatingChar(String s1) {
		for(int i = 0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			boolean flag = false;
			for(int j = 0;j<s1.length();j++) {
				if( i !=j && s1.charAt(j) == ch ) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				return s1.charAt(i);
			}
			 
		}
		return '$';
		
		
	}

}
