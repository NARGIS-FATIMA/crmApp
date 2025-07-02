package Pyramid;

public class Palindrome {

	public static void main(String[] args) {
		int n=12321, temp=n;
		int rev=0;
		while(n>0) {
			int l=n%10;
			rev=rev*10+l;
			n=n/10;
		}
		if(rev==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not");
		}

	}

}
