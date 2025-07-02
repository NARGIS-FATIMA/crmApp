package self;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number");
		int n= scanner.nextInt();
		if(n==1 || n==0) {
			System.out.println("Not Prime number");
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not Prime");
			}
			
			
		}
		
	}

}
