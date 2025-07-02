package classProgram;

import java.util.Scanner;

public class SumOfEvenRange {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter starting point");
		int start=scanner.nextInt();
		System.out.println("Enter ending point");
		int end=scanner.nextInt();
		int sum=0;
		for(int i= start;i<=end;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
				
		System.out.println(sum);
	}

}
