package practiceTestNG;

import org.testng.annotations.Test;

public class DataProvider {
	@org.testng.annotations.DataProvider
	public Object getData() {
		Object[][]ob = new Object[3][2];
		ob[0][0]="iPhone 16 128 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; Black";
		ob[0][1]="₹73,500 ";
		ob[1][0]="";
		ob[1][1]="Ansari";
		ob[2][0]="Saba";
		ob[2][1]="Parween";
		return ob;
				
	}
	@Test(dataProvider = "getData")
	public void Create(String fname,String lname) {
		System.out.println(fname+lname);
	}

}
