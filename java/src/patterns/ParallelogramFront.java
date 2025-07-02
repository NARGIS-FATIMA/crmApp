package patterns;

public class ParallelogramFront {

	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i==1 && j<=n || i==n && j>=n|| i==j||j-i==n-1) {
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
