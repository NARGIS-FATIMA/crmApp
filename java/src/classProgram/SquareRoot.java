package classProgram;

public class SquareRoot {

	public static void main(String[] args) {
		int n=16;
		boolean flag=false;
		for(int i=1;i<=n;i++) {
			if(i*i==n) {
				flag=true;
				System.out.println(i);
				break;
			}
		}
		if(flag==false) {
			System.out.println("The number doesn't have aquare root");
		}
	}

}
