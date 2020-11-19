package test1;

import org.testng.annotations.Test;

import utils.BaseTest;


/**
  Open browser 
  - open  fb
  - open youtube
  - open gmail
 */
public class Ex11CommonDriverWithInheritence1 extends BaseTest{ 
	
	@Test
	public void verifyFb() {
		driver.get("https://www.fb.com");
	}
	
	@Test
	public void verifyYT() {
		driver.get("https://www.youtube.com");
	}
	
	@Test
	public void verifyGmail() {
		driver.get("https://www.gmail.com");
	}
}
