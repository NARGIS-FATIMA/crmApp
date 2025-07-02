package self;




public class MaxArray {

	public static void main(String[] args) {
		int a[] = {10,2,34,9,67,23,98};
		int max=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println(max);

	}

}
