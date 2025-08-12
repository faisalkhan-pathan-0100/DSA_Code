package DSA;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
	static int  removeDuplicatesFromSortedArray(int[] arr) {
		 // To track seen elements
        HashSet<Integer> s = new HashSet<>();
        
        // To maintain the new size of the array
        int idx = 0;  

        for (int i = 0; i < arr.length; i++) {
            if (!s.contains(arr[i])) { 
                s.add(arr[i]);  
                arr[idx++] = arr[i];  
            }
        }

        // Return the size of the array 
        // with unique elements
        
		return idx;
	}
	
	static int removeDuplicatesFromSortedArray1(int[] arr) {
		int x = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				arr[x++] = arr[i];
			}
		}
		 
		return x;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {2,2,2,2,2};
		int newSize = removeDuplicatesFromSortedArray(arr);
		for(int i= 0;i<newSize;i++) {
			 System.out.print(arr[i]+" ");
		 }
		
		System.out.println();
		
		int[] arr1 = new int[] {1, 2, 2, 3, 4, 4, 4, 5, 5};
		int newSize1 = removeDuplicatesFromSortedArray1(arr1);
		for(int i= 0;i<newSize1;i++) {
			 System.out.print(arr1[i]+" ");
		 }
		
	}

}
