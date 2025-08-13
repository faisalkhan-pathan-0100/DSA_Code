package DSA;

public class MInimumSwapRequiredToGetAll1sInBinaryArray {
	static int minSwap(int[] arr) {
		int ans=0;
		int totalOneCount = 0;  // to find the total 1's to define the size of the window
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==1) {
				totalOneCount++;
			}
		}
		if(totalOneCount == 0) // if no 1's in present in the array then return null
			return -1;
		int requiredSwap = Integer.MAX_VALUE;
		
		for(int i = 0; i<=arr.length - totalOneCount;i++) { 
			int onesInWIndow = 0;
			for(int j=i;j<i+totalOneCount;j++) {  // maintain the window size  = no of 1's in the array 
				if(arr[j]==1) {
					onesInWIndow++;
				}
			}
			int x = totalOneCount-onesInWIndow;
			 ans = Math.min(requiredSwap, x);
			 requiredSwap = ans;
			
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {0, 0, 0,1,0,1,1,0,1,0,1};
		int x = minSwap(arr);
		System.out.println(x);

	}
}
