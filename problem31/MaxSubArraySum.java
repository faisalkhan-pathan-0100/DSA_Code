package DSA;

import java.util.HashSet;

public class MaxSubArraySum {
	static int maxSubArraySum(int[] arr){
		int maxSum = Integer.MIN_VALUE;
		 
		for(int start = 0;start<arr.length;start++) { //starting points of subarray 
			
			for(int end = start; end<arr.length;end++) { //end point the subarray
				int sum = 0;
				for(int i = start; i<=end;i++) { // to calculate the sum of each subarray
					sum+=arr[i];
				}
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}
	
	static int maxSubArraySum1(int[] arr) {
        int res = arr[0];
  
        // Outer loop for starting point of subarray
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
      
            // Inner loop for ending point of subarray
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
              
                // Update res if currSum is greater than res
                res = Math.max(res, currSum);
            }
        }
        return res;
    }
	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 3, -8, 7, -1, 2, 3};
		int x = maxSubArraySum1(arr);
		System.out.println(x);
		 
	}
}

