package patterns;

public class G {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1; j<=6; j++) {
				if(j==1 && i>=2 || i==1 && j>=2 && j<=5 || i==2 && j==6 || i==4 && j>=4 || i==5 && j==6 && j==5 || i==6 && j==4 && j==6 ||i==7 && j!=5) {
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
