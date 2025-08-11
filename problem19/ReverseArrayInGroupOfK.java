package DSA;

public class ReverseArrayInGroupOfK {
	static void reverseArrayInGroupOfK(int[] arr, int k) {
		int n = arr.length;
		for(int i = 0; i < n; i+=k) {
			int left = i;
			int right = Math.min(i + k -1, n-1);
			while(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		reverseArrayInGroupOfK(arr,4);
		for( int x :arr) 
			System.out.print(x+" ");	

	}

}
