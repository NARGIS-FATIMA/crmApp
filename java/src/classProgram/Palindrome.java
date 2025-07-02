package classProgram;

public class Palindrome {

	public static void main(String[] args) {
		int n=1221;
		int rev=0;
		int copy=n;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(rev==copy) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
