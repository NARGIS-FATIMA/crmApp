package classProgram;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		int sum=0,copy=n;
		while(n>0) {
			int d = n%10;
			int fact = 1;
			for(int i=d;i>=1;i--) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
			
		}
		if(copy==sum)
			System.out.println("Strong Number");
		else {
			System.out.println("Not Strong number");
		}
	}

}
