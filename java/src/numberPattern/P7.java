package numberPattern;

public class P7 {

	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n*2-1;i++) {
			int count=1;
			for(int j=1;j<=n*2-1;j++) {
				if(i+j>=n+1&& i-j<=n-1 && i+j<=n*2+2 && j-i<=n) {
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
