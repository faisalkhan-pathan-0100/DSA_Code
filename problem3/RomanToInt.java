package DSA;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
	public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
       map.put('I', 1);
       map.put('V', 5);
       map.put('X', 10);
       map.put('L', 50);
       map.put('C', 100);
       map.put('D', 500);
       map.put('M', 1000);

       int ans = 0;
       for(int i = 0; i<s.length();i++){
           int current = map.get(s.charAt(i));
           if (i + 1 < s.length() && current < map.get(s.charAt(i + 1))) {
               ans -= current;
           } else {
               ans += current;
           }
       }
       return ans;
   }
	public static void main(String[] args) {
		System.out.println(romanToInt("IVI"));

	}

}
