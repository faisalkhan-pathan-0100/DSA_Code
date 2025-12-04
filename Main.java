public class Main
{
	public static void main(String[] args) {
		int[] arr = new int[] {0,3,4,5,0};
		int product = 1;
		for(int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int i = 0; i<arr.length; i++) {
		    if(arr[i] == 0)
		        continue;
			product *= arr[i];
		}
		System.out.println(product);
		for(int i = 0; i<arr.length; i++) {
		    if(arr[i] == 0){
		       arr[i] = product;
		    }else{
		        arr[i] = product/arr[i];
		    }
			
		}
        System.out.println();
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
}
