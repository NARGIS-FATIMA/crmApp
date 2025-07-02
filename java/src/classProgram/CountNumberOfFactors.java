package classProgram;

import java.util.Scanner;

public class CountNumberOfFactors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number");
		int n=scanner.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
