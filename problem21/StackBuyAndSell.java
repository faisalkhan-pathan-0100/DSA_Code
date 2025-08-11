package DSA;

public class StackBuyAndSell {
	static int stackBuyAndSell(int[] arr) {
		int profit = 0;
		
		for(int i = 0;i<arr.length;i++) {
			
			int buy = arr[i];
			for(int j = i+1;j<arr.length;j++) {
				if(buy<arr[j] && profit<(arr[j] - buy)) { //chekingbuy less then sell and new profit > old profit 
					profit = arr[j] - buy;
				}
			}
			
		}
		return profit;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1, 3, 6, 9, 11};
		System.out.println(stackBuyAndSell(arr));

	}

}
