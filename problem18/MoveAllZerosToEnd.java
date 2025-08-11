package DSA;

public class MoveAllZerosToEnd {
	static void moveAllZerosToEnd(int[] arr) {  //TC O(n) and SC O(n)
		int newArr[] = new int[arr.length];
		int i=0;
		for(int x : arr) {
			if( x !=0) {
				newArr[i++]=x;
			}
		}
		for(int j = i;j<arr.length; j++) {
			arr[j]= 0;
		}
		for(int x : newArr) {
			System.out.print(x+" ");
		}
	}
	
	static void moveAllZerosToEnd1(int[] arr) {  //TC O(n) and SC O(1)
		int count=0;
		for(int i = 0;i<arr.length; i++) {
			if(arr[i]!= 0) {
				arr[count++] = arr[i];
			}
		}
		while(count<arr.length) {
			arr[count++] = 0;
		}
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 0, 4, 3, 0, 5, 0};
		moveAllZerosToEnd1(arr);
		
	}

	
}
