package real;

import org.junit.Test;
import org.openqa.selenium.By;

import util.BaseTest;

public class TestGmail1 extends BaseTest{
	
	@Test
 	public void testGmailSuccees() throws InterruptedException{
		driver.get("http://gmail.com");
		
		driver.findElement(
				By.xpath("//input[@aria-label='Email or phone']"))
		.sendKeys("mythritechs"
				+ "olutions@gmail.com");
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//span[text()='Next']"))
				  .click();
		Thread.sleep(3000);
		
		
		driver.findElement(
				By.xpath("//input[@type='password']"))
		.sendKeys("mythritechsolutions@gmail.com");
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//span[text()='Next']"))
				  .click();
		Thread.sleep(3000);
	}

}
