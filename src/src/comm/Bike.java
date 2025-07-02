package comm;

public class Bike extends Vehicle{

	String bno="KA2536";
	int regno=123;
	public static void main(String args[]) {
		Bike b=new Bike();
		System.out.println(b.bno);
		System.out.println(b.regno);
		System.out.println(b.colour);
		System.out.println(b.brand);
	}
}
