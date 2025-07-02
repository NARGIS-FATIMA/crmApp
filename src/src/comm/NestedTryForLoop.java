package comm;

public class NestedTryForLoop {

	public static void main(String[] args) {
		
		int []a= {10,20,30};
		for(int i=0;i<=a.length;i++) {
			try {
				Thread.sleep(3000);
				try {
					System.out.println(a[3]);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
				}
				
			} catch (InterruptedException e) {
				
				System.out.println(e.getMessage());
			}
			System.out.println(i);
		
		}

	}

}
