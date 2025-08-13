package DSA;
/*
 * Given an array arr[], count how many indices can be removed such that the sum of elements at even indices equals the sum of elements at odd indices in the resulting array

Examples:

Input: arr[] = [2, 1, 6, 4] 
Output: 1 
Explanation: If we remove the element at index 1 (value 1), the modified array becomes [2, 6, 4]. Now, the sum of elements at even indices (2 + 4 = 6) is equal to the sum at odd indices (6).

Input: arr[] = [1, 1, 1] 
Output: 3 
Explanation: Removing any element makes the sum of odd and even indexed elements equal.
 
 */

public class EqualOddEvenSumAfterRemoval {
	static int removelOperation(int[] arr) {
		for(int j = 0; j<arr.length;j++) {
			int oddSum = 0;
			int evenSum = 0;
			int newIndex = 0;
			for(int i = 0; i<arr.length;i++) {
				if (j == i) continue;
				if(newIndex % 2 == 0 )
					evenSum+=arr[i];
				else
					oddSum+=arr[i];
				newIndex++;
			}
			if(oddSum == evenSum) {
				return j;
			}
		}
		return -1;
		

	}
	public static void main(String[] args) {
		int[] arr = new int[] {1,1,1};
		int x = removelOperation(arr);
		System.out.println(x);

	}

}
