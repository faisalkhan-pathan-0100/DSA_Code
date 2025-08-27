package DSA;

public class PoliceAndThief {
	static int catchThieves(char[] arr, int k) {
		int n = arr.length;
		int count =0;
		boolean[] caught = new boolean[n];
		
		for(int i = 0;i<n;i++) {
			if(arr[i] == 'P') {
				int start = Math.max(0, i-k); // starting point of the range of current police ability to caught to thief
				int end = Math.min(n-1, i+k); // ending point
				
				for(int j = start; j<=end;j++) { // create the range for up to that police can caugth the thief
					if(arr[j] == 'T' && !caught[j]) {
						count++;
						caught[j] = true;
						break; // one police can caught one thief 
					}
				}
			}
		}
		return count;
	}
	
	//method 2
	static int catchThieves1(char[] arr, int k) {
		int i = 0,j=0,count=0;
		int n = arr.length;
		while(i<n && j<n) {
			
			while(i<n && arr[i] != 'P') {
				i++;
			}
			while(j<n && arr[j] != 'T') {
				j++;
			}
			
			if(i<n && j<n && Math.abs(i-j)<=k) {
				count++;
				j++;
				i++;
			}
			else if(j<n && j<i) {
				j++;
			}else if(i<n && i<j) {
				i++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int k = 1;
        char[] arr = { 'P', 'T', 'T', 'P', 'T' };
        System.out.println(catchThieves1(arr, k));

	}

}
