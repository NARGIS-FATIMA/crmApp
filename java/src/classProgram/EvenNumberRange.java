package classProgram;

import java.util.Scanner;

public class EvenNumberRange {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter starting point");
		int start =s.nextInt();
		System.out.println("Enter the ending point");
		int end = s.nextInt();
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}

	}

}
