package classProgram;

import java.util.Scanner;

public class ToFindMinNumber {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number");
		int n = scanner.nextInt();
		int min=n%10;
		while(n>0) {
			int d=n%10;
			if(d<min) {
				min=d;
			}
			n=n/10;
		}
		System.out.println(min);
	}

}
