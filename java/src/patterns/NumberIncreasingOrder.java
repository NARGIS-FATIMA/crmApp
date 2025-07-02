package patterns;

public class NumberIncreasingOrder {

	public static void main(String[] args) {
		int num= 4;
		int n=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(n++);
			}
			System.out.println();
		}

	}

}
