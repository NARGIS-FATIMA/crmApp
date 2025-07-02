package classProgram;

import java.util.Scanner;

public class FindMaximumDidgit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int max=n%10;
		while(n>0) {
			int d = n%10;
			if(d>max) {
				max=d;
			}
			n=n/10;
		}
		System.out.println(max);
	}

}