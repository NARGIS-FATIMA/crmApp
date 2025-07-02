package classProgram;

import java.util.Scanner;

public class BuzzzNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		if(n%7 == 0 || n%10 == 7) {
			System.out.println("Buzz Numer");
		}
		else {
			System.out.println("Not Buzz Number");
		}
	}

}
