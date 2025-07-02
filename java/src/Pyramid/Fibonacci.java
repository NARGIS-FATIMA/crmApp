package Pyramid;

public class Fibonacci {

	public static void main(String[] args) {
		int n=5,a=0,b=1,c=0;
		System.out.println(a);
		for(int i=1;i<n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}

	}

}
