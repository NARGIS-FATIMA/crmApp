package classProgram;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		if(num%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Not Even");
		}

	}

}
