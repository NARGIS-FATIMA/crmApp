package classProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		int n=5;
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}

	}

}
