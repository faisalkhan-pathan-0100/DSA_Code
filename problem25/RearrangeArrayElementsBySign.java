package DSA;

import java.util.ArrayList;

public class RearrangeArrayElementsBySign {
	static void rearrageElement(int[] arr) { //if equal positive and negative number 
		int positive = 0;
		int negative =  1;
		int[] newArr = new int[arr.length];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>0) {
				newArr[positive] = arr[i];
				positive+=2;
			}else {
				newArr[negative] = arr[i];
				negative+=2;
			}
		}
		for(int i=0;i<newArr.length; i++) { // copy element from newArr to old array (arr)
			arr[i] = newArr[i];
		}
	}
	
	static void rearrangeElement1(int[] arr) { // no of positive and negative number are not equal
		
		/*
		 * create two array list and add the postive and negative number in it (seperate the -ve and +ve number )
		 * append the element in array 
		 */
		ArrayList<Integer> positive = new ArrayList<>();
	    ArrayList<Integer> negative = new ArrayList<>();
	    
	    for (int num : arr) {
	        if (num > 0) {
	            positive.add(num);
	        } else {
	            negative.add(num);
	        }
	    }

	    int i = 0, j = 0, k = 0;

	    // Alternate positive and negative
	    while (i < positive.size() && j < negative.size()) {
	        if (k % 2 == 0) {
	            arr[k++] = positive.get(i++);
	        } else {
	            arr[k++] = negative.get(j++);
	        }
	    }

	    // Add remaining positives
	    while (i < positive.size()) {
	        arr[k++] = positive.get(i++);
	    }

	    // Add remaining negatives
	    while (j < negative.size()) {
	    	arr[k++] = negative.get(j++);
	    }
		
		
		
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, -4, -1, 4};
		rearrangeElement1(arr);
		for( int x : arr) {
			System.out.print(x+" ");
		}

	}

}
