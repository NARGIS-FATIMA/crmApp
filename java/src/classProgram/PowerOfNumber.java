package classProgram;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		System.out.println("Enter Power");
		int p=s.nextInt();
		int res=1;
		for(int i=1;i<=p;i++) {
			res=res*n;
		}
		System.out.println(res);

	}

}
