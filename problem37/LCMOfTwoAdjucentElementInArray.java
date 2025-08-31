package DSA;

public class LCMOfTwoAdjucentElementInArray {
	static void lcm(int[] arr) {
		int[] res = new int[arr.length-1]; // possible number of pair in given array
		int idx = 0;
		for(int i=0;i<arr.length-1;i++) {
			int a = arr[i];
			int b = arr[i+1];
			int lcm = a>b?a:b;
			while(true) {
				if(lcm % a == 0 && lcm % b == 0) {
					res[idx++]= lcm;
					break;
				}
				lcm++;
			}
		}
		int largest = Integer.MIN_VALUE;
		for(int x : res) {
			System.out.print(x+" ");
			largest = Math.max(largest, x);
		}
		System.out.println();
		System.out.println(largest);
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4};
		lcm(arr);
	}
}
