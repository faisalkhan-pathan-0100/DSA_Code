package DSA;

public class RotateArrayByK {

	static void rotateArrayByK(int[] arr, int k) { //O(n*k)
		int i = 0;
		while(i<k) {
			for(int p = 1;p<arr.length;p++) {
				int temp = arr[p-1];
				arr[p-1]=arr[p];
				arr[p]= temp;
			}
			i++; 
		}
	}
	
	static void rotate(int[] arr,int p, int q) {
		int left = p;
		int right = q;
		 while(left <right) {
			 int temp = arr[left];
			 arr[left] = arr[right];
			 arr[right] = temp;
			 left++;
			 right--;
		 }
	}
	static void rotateArrayByK1(int[] arr, int k) { //O(n)
		 k = k % arr.length; 
		rotate(arr,0,k-1);
		rotate(arr,k,arr.length-1);
		rotate(arr,0,arr.length-1);
		
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6};
//		rotateArrayByK(arr,3);
		rotateArrayByK1(arr,2);
		for(int x : arr) {
			System.out.print(x+" ");
		}

	}

}
