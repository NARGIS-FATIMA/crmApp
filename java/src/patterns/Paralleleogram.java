package patterns;

public class Paralleleogram {

	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i+j == n+1 || i+j==n*2 || i==1 && j>=3 || j==n && j<=3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}

	}

}
