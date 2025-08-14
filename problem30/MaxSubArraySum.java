package DSA;

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
	public static void main(String[] args) {
		
		int[] arr = new int[] {-2, -4};
		int x = maxSubArraySum(arr);
		System.out.println(x);
	}
}
