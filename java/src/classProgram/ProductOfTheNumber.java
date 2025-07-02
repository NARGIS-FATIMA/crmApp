package classProgram;

import java.util.Scanner;

public class ProductOfTheNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number");
		int n = s.nextInt();
		int product=1;
		while(n>0) {
			int d=n%10;
			product=product*d;
			n=n/10;
		}
		System.out.println(product);
	}

}
