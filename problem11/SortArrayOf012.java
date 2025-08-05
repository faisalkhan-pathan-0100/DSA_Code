package DSA;

import java.util.Scanner;

public class SortArrayOf012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		System.out.println(n);
		int[] arr = new int[n];
		
		for(int i = 0; i<n;i++) {
			arr[i] = sc.nextInt();
//			 
		}
//		
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0; i<n; i++) {
			if(arr[i]== 0)
				count0++;
			if(arr[i]== 1)
				count1++;
			if(arr[i]== 2)
				count2++;
		}
		for(int i = 0; i<n;i++) {
			
			System.out.print(arr[i]+" ");
		}
		for(int i = 0; i<n; i++) {
			if(i < count0)
                arr[i] = 0;
            else if(i < count0 + count1)
                arr[i] = 1;
            else
                arr[i] = 2;
		}
		for(int i = 0; i<n;i++) {
			
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
