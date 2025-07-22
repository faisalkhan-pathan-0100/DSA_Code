package DSA;


/*find common longest prefix amount the array of string*/
public class LongestCommonPrefix {
	public static String commonPrefix(String s1, String s2){
        int smallString = Math.min(s1.length(),s2.length());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<smallString; i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
    public static String longestCommonPrefix(String[] strs) {
       String result = strs[0];
       for(int i = 1; i<strs.length; i++){
            result = commonPrefix(result,strs[i]);
       }
       return result;
    }
	public static void main(String[] args) {
		String[] strs = new String[]{"flower","flow","floght"};
		System.out.println(longestCommonPrefix(strs));
	}

}
