package classProgram;

import java.util.Scanner;

public class FactorOfNuber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}

	}

}
