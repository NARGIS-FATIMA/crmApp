package practice.tstNG;

import org.testng.annotations.Test;

public class SampleForInvocationCountTest {
	@Test(invocationCount = 10)
	public void orderTest(){
		System.out.println("Execute OrderTest ");
	}
	@Test(enabled = false)
	public void billingOrderTest() {
		System.out.println("Execute billingOrderTest ");
	}

}
