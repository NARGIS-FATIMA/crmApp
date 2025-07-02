package comm;

public class Overloading {
	Overloading(){
		int a=10;
		System.out.println(a);
	}
	Overloading(int a,int b){
		a=20;
		b=30;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Overloading o=new Overloading();
		Overloading o1=new Overloading(2,3);

	}

}
