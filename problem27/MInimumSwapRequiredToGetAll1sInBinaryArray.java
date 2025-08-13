package DSA;
/*
 * Given an array of 0's and 1's, we need to write a program to find the minimum number of swaps required to group all 1's present in the array together.

Examples: Input: arr[] = [1, 0, 1, 0, 1]
Output: 1
Explanation: Only 1 swap is required to group all 1's together. Swapping index 1 with 4 will 
                        give arr[] = [1, 1, 1, 0, 0]

Input: arr[] = [1, 1, 0, 1, 0, 1, 1]
Output: 2
Explanation: Only 2 swap is required to group all 1's together. Swapping index 0 with 2 and 
1 with 4 will  give arr[] = [0, 0, 1, 1, 1, 1, 1]

Input: arr[] = [0, 0, 0]
Output: -1
Explanation: No 1s are present in the array, so return -1.
 */
public class MInimumSwapRequiredToGetAll1sInBinaryArray {
	static int minSwap(int[] arr) {
		int ans=0;
		int totalOneCount = 0;  // to find the total 1's to define the size of the window
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==1) {
				totalOneCount++;
			}
		}
		if(totalOneCount == 0) // if no 1's in present in the array then return null
			return -1;
		int requiredSwap = Integer.MAX_VALUE;
		
		for(int i = 0; i<=arr.length - totalOneCount;i++) { 
			int onesInWIndow = 0;
			for(int j=i;j<i+totalOneCount;j++) {  // maintain the window size  = no of 1's in the array 
				if(arr[j]==1) {
					onesInWIndow++;
				}
			}
			int x = totalOneCount-onesInWIndow;
			 ans = Math.min(requiredSwap, x);
			 requiredSwap = ans;
			
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {0, 0, 0,1,0,1,1,0,1,0,1};
		int x = minSwap(arr);
		System.out.println(x);

	}
}
