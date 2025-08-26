package DSA;

public class MaxSubArrayProduct {

	public static void main(String[] args) {
		int[] arr  = new int[] {2, 3, 4};
		int x = maxSubArrayPoduct(arr);
		System.out.println(x);
	}

	private static int maxSubArrayPoduct(int[] arr) {
		int n = arr.length;
		int res = arr[0]; // consider 1st element as the max sub array product
		for(int i = 0; i<n;i++) { // start  from 0 
			int prod = 1; 
			for(int j = i;j<n;j++) { // 0 to 0,1,2,3...n
				prod = prod * arr[j]; // 0 to 0, 0 to 1, 0 to 2 
				res = Math.max(res,prod); // compare res with current sub array product
			}
		}
		return res;
	}

}
