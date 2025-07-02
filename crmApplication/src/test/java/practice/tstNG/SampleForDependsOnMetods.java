package practice.tstNG;

import org.testng.annotations.Test;

public class SampleForDependsOnMetods {
	@Test
	public void CreateContactTest() {
		System.out.println("Created ");
	}
	@Test(dependsOnMethods = "CreateContactTest")
	public void EditContactTest() {
		System.out.println("Edited");
	}
	@Test(dependsOnMethods = "EditContactTest")
	public void DeleteContactTest() {
		System.out.println("Deleted");
	}
}
