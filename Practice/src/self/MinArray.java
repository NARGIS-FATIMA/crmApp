package self;

public class MinArray {

	public static void main(String[] args) {
		int a[]= {10,20,02,89};
		int min=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
