package patterns;

public class P6 {

	public static void main(String[] args) {
		int n=4,count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j<=n+1) {
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
