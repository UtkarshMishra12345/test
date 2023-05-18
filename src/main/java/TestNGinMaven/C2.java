package TestNGinMaven;

import org.testng.annotations.Test;

public class C2 {
//	@Test( dependsOnMethods = {"testcount2"})
	
	@Test(priority=0)
	public void testcase2() {
		System.out.println("C1-TC1");
	}
	@Test(priority=1)
		public void testcase3() {
			System.out.println("Class-TC2");
		}
	@Test
	public void testcase1() {
		System.out.println("class-TC3");
	}
	}

