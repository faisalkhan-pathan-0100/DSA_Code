package DSA;

public class RainWaterTrap {
	public static int trap(int[] height) { //t.c n2 and space coplexity o(1)
        int totalWater = 0;
        for(int i = 1;i<=height.length -2;i++){
            int leftMax = height[0];      //left max is element at index 0
            int rightMax = height[height.length-1]; // right max is element at the index n-1
            for(int j = i; j>=0;j--){    // find left max for index i by iterate from i to leftmost index which is zero
                leftMax = Math.max(leftMax,height[j]);
            }
            for(int k = i; k<height.length;k++){ // find rightmax for index i to right most index which is n-1
                rightMax = Math.max(rightMax,height[k]);
            }
            totalWater += Math.min(leftMax,rightMax)- height[i]; // calculate water store at index i and added it in total
        }
        return totalWater;
    }
	
	/*
	 above code 
	  The provided code has a time complexity of O(n^2). This is because for each element in the array (excluding the first and last),
	 	it performs two nested loops: one to find the maximum height to the left of the current position and another to find the maximum height to the right. Each of these inner loops can, in the worst case, iterate through almost the entire array, leading to quadratic time complexity.
	   
		The space complexity of the code is O(1). It uses only a fixed amount of extra space for variables such as 
		totalWater, leftMax, rightMax, and loop counters. No additional data structures proportional to the input size are used, so the space complexity remains constant regardless of the input size.
	 */
	
	public static int trap1(int[] height) {
        int totalWater = 0;
        int[] leftmax = new int[height.length]; // create the seperate leftmax array
        int[] rightmax = new int[height.length]; // create the seperate rightmax array
         leftmax[0] = height[0];
         rightmax[height.length-1] = height[height.length-1];
        for(int i = 1;i<height.length;i++){
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        }
         for(int i = height.length-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1],height[i]);
        }
        for(int i = 1;i<=height.length -2;i++){
            totalWater += Math.min(leftmax[i],rightmax[i])- height[i];
        }
        return totalWater;
    }

	/*
	 * trap1 code
	The provided code implements a solution to the trapping rain water problem using precomputed arrays for maximum heights to the left and right of each position.

	Time Complexity:
	- The code performs three main loops:
	  1. Building the leftmax array (O(n))
	  2. Building the rightmax array (O(n))
	  3. Calculating total trapped water by iterating through the array (O(n))
	- Overall, the total time complexity is O(n) because these loops are sequential and each runs in linear time.

	Space Complexity:
	- The code uses two additional arrays, leftmax and rightmax, each of size n (where n is the length of the input array).
	- Therefore, the space complexity is O(n) due to these auxiliary arrays.
	- The input array itself is not counted towards extra space, so the auxiliary space is linear in the size of the input.

	In summary:
	Time Complexity: O(n)
	Space Complexity: O(n)
	*/
	public static void main(String[] args) {
		int[] height = new int[] {4,2,0,3,2,5};
		System.out.println(trap(height));
	}

}
