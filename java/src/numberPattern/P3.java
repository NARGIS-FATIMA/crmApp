package numberPattern;

public class P3 {

	public static void main(String[] args) {
		int n=3,count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i+j>=n+1 && j-i<=n-1) {
					System.out.print(count++);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
