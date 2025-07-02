package comm;

public class ArrayIndexIo {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
			
			System.out.println(a[i]);
		}
		

	}

}
