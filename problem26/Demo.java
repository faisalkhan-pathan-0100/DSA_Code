package DSA;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*Given an integer array arr[] sorted in ascending order, along with three integers: A, B, and C. The task is to transform each element x in the array using the quadratic function A*(x^2) + B*x + C. After applying this transformation to every element, return the modified array in sorted order.

Examples:

Input: arr[] = [-4, -2, 0, 2, 4], A = 1, B = 3, C = 5
Output: [3, 5, 9, 15, 33]
Explanation: After applying f(x) = 1*x2+ 3*x + 5 to each x, we get [9, 3, 5, 15, 33]. After sorting this array, the array becomes [3, 5, 9, 15, 33].

Input: arr[] = [-3, -1, 2, 4], A = -1, B = 0, C = 0
Output: [-16, -9, -4, -1]
Explanation: After applying f(x) = -1*x2 to each x, we get [-9, -1, -4, -16 ]. After sorting this array, the array becomes  [-16, -9, -4, -1].

Input: arr[] = [-1, 0, 1, 2, 3, 4], A = -1, B = 2, C = -1
Output: [-9, -4, -4, -1, -1, 0]  */
public class Demo {
	static void sort(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	static void dosomething(int[] arr, int A, int B, int C) {
		for(int i = 0;i<arr.length;i++) {
			arr[i] = A * arr[i] * arr[i] + B * arr[i] + C;
		}
		sort(arr);
	}
	
//	static void dosomething1(int[] arr, int A, int B, int C) {
//		Set<Integer> hs = new TreeSet()<>();
//		for(int i = 0;i<arr.length;i++) {
//			arr[i] = A * arr[i] * arr[i] + B * arr[i] + C;
//			hs.add(arr[i]);
//		}
//
//		for(int i = 0; i<arr.length; i++) {
//			arr[i] = hs.
//		}
//	}
	public static void main(String[] args) {
		int[] arr = new int[] {-4, -2, 0, 2, 4};
		dosomething(arr,1,3,5);
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
