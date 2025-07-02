package classProgram;

public class SunnyNumber {

	public static void main(String[] args) {
		int n=4;
		int n1=n+1;
		boolean flag=false;
		for(int i=1;i<=n1;i++) {
			if(i*i==n1) {
				flag=true;
				System.out.println("Sunny Number");
				break;
			}
		}
		if(flag==false) {
			System.out.println("Not Sunny Number");
		}
	
	}

}
