package DSA;

public class LongestContiguousSequence {

	static int longestContiguousSequence(int[] arr) {
		int zeros=1;
		int ones =1;
		if(arr[0] == 0) {
			for(int i = 1;i<arr.length;i++) {
				if(arr[i-1]==arr[i]) {
					zeros++;
				}
			}
		}else {
			for(int i = 1;i<arr.length;i++) {
				if(arr[i-1]==arr[i]) {
					ones++;
				}
			}
		}
		return (zeros < ones? ones:zeros);
	}
	public static void main(String[] args) {
		int arr[] = new int[] {0, 0, 1, 0, 1, 0};
		int arr1[] = new int[] {0, 0, 0, 0};
		int arr2[] = new int[] {0, 1, 0, 1, 1, 1, 1};
		System.out.println(longestContiguousSequence(arr));
		System.out.println(longestContiguousSequence(arr1));
		System.out.println(longestContiguousSequence(arr2));
	}

}
