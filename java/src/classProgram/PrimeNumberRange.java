package classProgram;

public class PrimeNumberRange {

	public static void main(String[] args) {
		int st=1;
		int end=10;
		int sum=0;
		for(int i=st;i<=end;i++) {
			int n=i;
			//int count=0;
			for(int j=1;j<=n;j++) {
				if(n%j==0) {
					
					sum=sum+j;
				}
			}
//				if(count==2) {
//					
//					System.out.println(sum);
//				}
				
			}
		System.out.println(sum);
		}
		
	}

