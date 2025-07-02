/* we can create object inside non static 
 * but it will through run time error 
 * 
 * */



package comm;

public class NStaticOFlow {

	static {
		System.out.println("Sb1");
	}
	{
		System.out.println("Nsb1");
	}
	static {
		System.out.println("Sb2");
	}
	{
		NStaticOFlow n=new NStaticOFlow();
		System.out.println("Nsb2");
		
	}
	static {
		System.out.println("Sb3");
	}
	public static void main(String []args) {
		NStaticOFlow n=new NStaticOFlow();
	}
}
