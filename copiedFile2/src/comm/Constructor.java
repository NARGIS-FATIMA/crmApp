package comm;

public class Constructor {
	static int eid=01;
	static int sal=500000;
	String ename="Nargis";
	String desig="Tester";
	Constructor(){
		System.out.println("a");
	}
	Constructor(int a){
		System.out.println("b");
	}
	Constructor(int a, int b){
		System.out.println("c");
	}

	public static void main(String[] args) {
		System.out.println(Constructor.eid);
		System.out.println(Constructor.sal);
		Constructor c=new Constructor();
		System.out.println(c.ename);
		System.out.println(c.desig);

	}

}
