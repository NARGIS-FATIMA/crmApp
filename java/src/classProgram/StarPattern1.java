package classProgram;

public class StarPattern1 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i+j==n+1) {
					System.out.println("* ");
				}
				else {
					System.out.println("  ");
				}
			}
			System.out.println();
		}

	}

}
