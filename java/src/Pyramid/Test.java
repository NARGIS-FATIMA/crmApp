package Pyramid;

 class A {
	
	int x=10;
}
class B extends A{
	int y=20;
}
class Test{

	public static void main(String[] args) {
		A test=new B();
		//B b=(B)test;
		//System.out.println(A.x);
		//System.out.println(test.y);
		//System.out.println(b.y);
		

	}

}
