package mycompany;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class login extends base {
	
	@Test
	public void log() {
	WebElement mail=driver.findElement(By.id("username"));
	mail.sendKeys("admin");
	mail.sendKeys(Keys.TAB);
	WebElement mp = driver.findElement(By.cssSelector(":focus"));
	mp.sendKeys("Admin1234");
	WebElement signin = driver.findElement(By.xpath("//*[@id=\"kc-form-buttons\"]/input"));
	signin.click();
	
}
}
