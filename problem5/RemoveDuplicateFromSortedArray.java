package DSA;
/*
 remove duplicated element from the sorted array and return the final array element count
 */
public class RemoveDuplicateFromSortedArray {
	public static int finalArray(int[] nums) {
		int s =0;
        for(int i = 1; i<nums.length;i++){
            if(nums[i]!=nums[s]){
                s++;
                nums[s] = nums[i];
            }
        }
        
        return s+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {0,0,1,1,1,2,2,3,3,4};
		System.out.println(finalArray(arr));
	}

}


/*
 class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> st = new LinkedHashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            st.add(nums[i]);
        }
     int index = 0;
     for(int x : st)
     {
        nums[index] = x;
        index++;
     }
       return index; 
    }
} 
*/
