package comm;

public class StaticBlock {

	static int x=10;
	static int y=20;
	static {
		System.out.println("sb1");
		x=30;
		System.out.println(y);
		System.out.println(x);
		
	}
	static {
		System.out.println("sb2");
		x=40;
		y=120;
		System.out.println(x);
	}
	public static void main(String []args) {
		System.out.println("main");
		x=80;
		System.out.println(x);
		System.out.println(y);
	}
    static {
    	System.out.println("sb3");
    	x=10;
    	System.out.println(x);
    }
}
