package comm;
/* Staic block will execute first
 * Inside static block we can create object
 * It will call the non static block
 * 
 * */

public class NonStaticBlock {
	int y=30;
	static int x=300;
	static {
		NonStaticBlock a=new NonStaticBlock();
		System.out.println("Sb1");
		System.out.println(x);
	}
	{
		System.out.println(y);
		System.out.println("Nsb1");
		y=800;
		
	}
	static {
		System.out.println(x);
		System.out.println("Sb2");
		System.out.println(x);
	}
	{
		y=100;
		System.out.println("Nsb2");
	}
	static {
		NonStaticBlock a=new NonStaticBlock();
		System.out.println("Sb3");
	}

	public static void main(String[] args) {
		NonStaticBlock a=new NonStaticBlock();
		NonStaticBlock a1=new NonStaticBlock();
	}
	{
		y=3050;
		System.out.println("Nsb3");
	}

}
