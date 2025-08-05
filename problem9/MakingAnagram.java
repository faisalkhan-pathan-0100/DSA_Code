package DSA;

public class MakingAnagram {
	public static int makingAnagram(String s1, String s2) {
		int count = 0;
		int[] arr = new int[26];
		s1 = s1.toLowerCase();
		s2.toLowerCase();
		
		for(int i = 0; i<s1.length();i++) {
			arr[s1.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i<s2.length();i++) {
			arr[s2.charAt(i)-'a']--;
		}
		for(int c : arr) {
			count += Math.abs(c);
		}
		return count;
	}
	
	public static void main(String args[]) {
		System.out.println(makingAnagram("faisal","yyyyf"));
	}
}
