package classProgram;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= scanner.nextInt();
		int sum=0;
		int product=1;
		while(n > 0) {
			int d = n%10;
			sum = sum + d;
			product = product * d;
			n=n/10;
			
		}
		if(sum==product) {
			System.out.println("Spy");
		}
		else {
			System.out.println("Not Spy");
		}

	}

}
