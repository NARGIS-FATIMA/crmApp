package self;

import java.util.Scanner;

public class FibonaccciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter upto which position u want to print");
		int n=s.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		for(int i=1;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
		

	}

}
