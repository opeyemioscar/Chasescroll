package testcase;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void doLogin() {
		System.out.println("Executing Login Test");
		
	}
	@Test
	public void doUserReg() {
	Assert.fail("User Reg Test Failed");
		
	}
	@Test
	public void isSkip() {
		throw new SkipException("Skipping the Test Case");
		
	}

}
