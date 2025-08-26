package DSA;

public class RainWaterTrap {
	public static int trap(int[] height) {
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
	public static void main(String[] args) {
		int[] height = new int[] {4,2,0,3,2,5};
		System.out.println(trap(height));
	}

}
