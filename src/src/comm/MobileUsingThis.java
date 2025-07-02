package comm;

public class MobileUsingThis {
	String brand;
	int cost;
	String colour;
	String RAM;
	MobileUsingThis(String brand,int cost, String colour, String RAM){
		this.brand=brand;
		this.cost=cost;
		this.colour=colour;
		this.RAM=RAM;
	}
		void display() {
			System.out.println(brand+" "+cost+" "+colour+" "+RAM);
		}
	

	public static void main(String[] args) {
		MobileUsingThis m1=new MobileUsingThis("OnePlus",50000,"black","16GB");
		MobileUsingThis m2=new MobileUsingThis("Samsung",60000,"gray","20GB");
	}

}
