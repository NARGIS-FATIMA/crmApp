package classProgram;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;int temp=n, sum=0;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		n=temp;
			
			while(n>0) {
				int d=n%10;
				int pow=1;
				for(int i=1;i<=count;i++) {
					pow=pow*d;
				}
				sum=sum+pow;
				n=n/10;
			}
			if(temp==sum)
				System.out.println("Armstrong");
			else {
				System.out.println("Not Armstrong");
			}
		}
		

	}


