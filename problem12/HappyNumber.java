package DSA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
	public static String isHappy(int n ) {
		Set<Integer> set = new HashSet<Integer>();
		while(true) {
			
			int sum = 0;
			while(n != 0) {
				sum+= Math.pow(n %10 , 2.0);
				n = n/10;
			}
			
			if(sum == 1)
				return "yes";
			
			n = sum;
			if(set.contains(n))
				return "no";
			set.add(n);
		}

	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isHappy(n));
		
		
	}

}
