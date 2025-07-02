package classProgram;

public class NeaonNumber {

	public static void main(String[] args) {
		int n=9,sum=0;
		int sq=n*n;
		while(sq>0) {
			int d=sq%10;
			sum=sum+d;
			sq=sq/10;
		}if(sum==n)
		System.out.println("neaon");
		else {
			System.out.println("Not");
		}
	}
	}


