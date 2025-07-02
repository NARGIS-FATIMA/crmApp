package classProgram;

public class XylemPhloem {

	public static void main(String[] args) {
		int is=0;
		int n=1234;
		int l=n%10;
		n=n/10;
		while(n>9) {
			int d=n%10;
			is=is+d;
			n=n/10;
		}
		int os=n+l;
		if(is==os) {
			System.out.println("Xylem");
		}
		else {
			System.out.println("Phloem");
		}

	}

}
