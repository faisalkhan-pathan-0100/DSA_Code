package DSA;

import java.util.Scanner;

public class GamesPlay {
	static int maxGame() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number of days anna can play a game: ");
		int days = sc.nextInt();
		int[] freeHour = new int[days];
		for(int i = 0;i<days;i++) {
			System.out.println("Enter the free hours on day- "+(i+1));
			freeHour[i] = sc.nextInt();
		}
		int count = 0;
		for(int x : freeHour) {
			count += x*60/10;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(maxGame());
	}

}

/*
Problem Restatement

Anna plays video games every day.
To complete one game, she needs 10 minutes.
She has N days, and on each day i, she has A[i] free hours.
You need to calculate the maximum number of games she can complete in N days.

🔹 Input Format

First line → integer N (number of days).
Second line → N integers, where each integer represents free hours on that day.

🔹 Output Format

Print the maximum number of games Anna can play.
*/