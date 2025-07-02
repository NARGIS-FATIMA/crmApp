package Pyramid;

public class ReverNum {

	public static void main(String[] args) {
		int n=1234;
		
		int rev=0;
		while(n>0) {
			int l=n%10;
			rev=rev*10+l;
			n/=10;
		}
		System.out.println(rev);

	}

}
