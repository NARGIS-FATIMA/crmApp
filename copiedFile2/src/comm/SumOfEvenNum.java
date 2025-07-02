package comm;
import java.util.Scanner;

public class SumOfEvenNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many numbers you want");
		int n=s.nextInt();
		int sum=0;
		int s1;
//		while() {
//			if(n%2==0) {
//				sum=sum+n;
//			}
//			n--;
//			System.out.println(sum);
//		}
		
     for(int i=1;i<=n;i++) {
    		sum+=+i*2;
    		
    	 System.out.println(sum);
     }
	}

}
