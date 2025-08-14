package DSA;
/*
 * Given an array prices[] of size n denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.

Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.

Examples:

Input: prices[] = {100, 180, 260, 310, 40, 535, 695}
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 - 100 = 210
                       Buy the stock on day 4 and sell it on day 6 => 695 - 40 = 655
                       Maximum Profit  = 210 + 655 = 865


 */
public class BuyAndSellStock2 {
	static int buyAndSellStock2(int[] arr) {

		int totalProfit = 0;
		for(int i = 0;i<arr.length;) {
			 
			int buy = arr[i]; //buying day
			int j = i+1;
			
			while(j < arr.length && arr[j] > buy) { // check for selling day is higher then buying day or not
				j++;
			}
			totalProfit+=arr[j-1]-buy; //arr[j-1] is selling day
			i=j;

		}
		
		return totalProfit;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {100, 180, 260, 310, 40, 535, 695};
		int x = buyAndSellStock2(arr);
		System.out.println(x);

	}

}
