package DSA.string;

public class MinimumDstanceBetweenTheGivenTwoWords {
	static int minDistance(String[] strs,String s1, String s2) {
		int p1 = -1;
		int p2 = -1;
		int ans = Integer.MAX_VALUE;
		for(int i = 0;i<strs.length;i++) {
			if(strs[i] == s1)
				p1 = i;
			if(strs[i] == s2)
				p2 = i;
			if(p1 !=-1 && p2 != -1) {
				ans = Math.min(ans, Math.abs(p1 - p2)); 
			}
			
		}
		return ans;
	}
	public static void main(String[] args) {
		String[] strs = new String[] {"geeks", "for", "geeks", "contribute",  "practice"};
		System.out.println(minDistance(strs,"geeks","practicee"));

	}

}
