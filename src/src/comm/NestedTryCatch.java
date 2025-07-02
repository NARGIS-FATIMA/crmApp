package comm;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		int[] a= {10,20,30};
		
		try {
			Thread.sleep(3000);
			System.out.println(a[0]);
			try {
				System.out.println(a[10]);
				
				
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			
		} catch (InterruptedException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		
		System.out.println(a[2]);
	
	}
}




