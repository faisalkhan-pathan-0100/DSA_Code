package DSA;

public class TwoSum {

	public static String twoSum(int[] arr, int target) {
		int n = arr.length;
		
		for(int i = 0; i<n; i++) {
			int res = 0;
			for (int j = i+1; j<n;j++) {
				res = arr[i] + arr[j];
				if(res == target) {
					return "["+i+","+j+"]";
				}
			
			}
		}
		return"[]";
	}
	public static void main(String[] args) {
		int[] arr = new int[]{2,4,1,3};
		System.out.println(twoSum(arr,6));

	}

}
