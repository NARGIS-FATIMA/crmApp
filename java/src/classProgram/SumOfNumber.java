package classProgram;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number");
		int n=scanner.nextInt();
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);
	}

}
