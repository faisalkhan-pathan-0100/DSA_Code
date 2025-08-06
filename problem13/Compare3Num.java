package DSA;

import java.util.Scanner;

public class Compare3Num {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		
//		if(n1>n2 && n1>n3) {
//			System.out.println("largest: "+n1);
//		}else if(n2>n1 && n2>n3) {
//			System.out.println("largest: "+n2);
//		}else {
//			System.out.println("largest: "+n3);
//		}
//		
//		if(n1>n2 && n1<n3) {
//			System.out.println("2nd: "+n1);
//		}else if(n2>n1 && n2<n3) {
//			System.out.println("2nd: "+n2);
//		}else {
//			System.out.println("2nd: "+n3);
//		}
//	}
	
	//without comperision operator 
//	public static void main(String[] args) {
//        int a = 15, b = 25, c = 20;
//
//        int maxAB = (a + b + Math.abs(a - b)) / 2; // max of a and b
//        int maxABC = (maxAB + c + Math.abs(maxAB - c)) / 2; // max of (a, b) and c
//
//        System.out.println("Greatest number is: " + maxABC);
//    }
	
//	public static void main(String[] args) {
//      int a = 15, b = 25, c = 20;
//
//      int maxAB = (a + b + Math.abs(a - b)) / 2; // max of a and b
//      int maxABC = (maxAB + c + Math.abs(maxAB - c)) / 2; // max of (a, b) and c
//
//      System.out.println("Greatest number is: " + maxABC);
////  }
///
	public static void main(String[] args) {
        int a = 15, b = 25, c = 20;

        // Step 1: Get min of a and b
        int minAB = (a + b - Math.abs(a - b)) / 2;

        // Step 2: Get min of above result and c
        int minABC = (minAB + c - Math.abs(minAB - c)) / 2;

        System.out.println("Smallest number is: " + minABC);
    }
	
}
