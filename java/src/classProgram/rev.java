package classProgram;


public class rev {

	public static void main(String[] args) {
		int n=623,rev=0;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		
		if(rev%10%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
	

}
