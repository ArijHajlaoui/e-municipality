package mycompany;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class login extends base {
	
	@Test(dataProvider="getdata1")
	public void log(String username, String password) {
	WebElement mail=driver.findElement(By.id("username"));
	mail.sendKeys(username);
	mail.sendKeys(Keys.TAB);
	WebElement mp = driver.findElement(By.cssSelector(":focus"));
	mp.sendKeys(password);
	WebElement signin = driver.findElement(By.xpath("//*[@id=\"kc-form-buttons\"]/input"));
	signin.click();
	
}
	@DataProvider
	public Object[][] getdata1(){
		Object[][] data = new Object[2][2];
		//combination1
		data[0][0] = "yahya";
		data[0][1] = "admin";
		//combination2
		data[1][0] = "admin";
		data[1][1] = "Admin1234";
		return data;
	}
	@Test(dataProvider="getdata2")
	public void signup(String pw , String pwc) {
		WebElement email=driver.findElement(By.linkText("Sign Up"));
		email.click();
		WebElement org=driver.findElement(By.id("user.attributes.organisation"));
		org.sendKeys("test");
		WebElement crnumber=driver.findElement(By.id("user.attributes.crNumber"));
		crnumber.sendKeys("122");
		WebElement eemail=driver.findElement(By.id("email"));
		eemail.sendKeys("testt@gmail.com");
		WebElement phone=driver.findElement(By.id("user.attributes.phone"));
		phone.sendKeys("1236");
		WebElement office=driver.findElement(By.id("user.attributes.officeLocation"));
		office.sendKeys("test");
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("yahya111");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys(pw);
		WebElement passconfirm=driver.findElement(By.id("password-confirm"));
		passconfirm.sendKeys(pwc);
		WebElement signupp = driver.findElement(By.xpath("//*[@id=\"kc-form-buttons\"]/input"));
		signupp.click();
	}
	@DataProvider
	public Object[][] getdata2(){
		Object[][] data = new Object[7][2];
		//combination1
		data[0][0] = "yahya";
		data[0][1] = "yahya";
		//combination2
		data[1][0] = "yahya1";
		data[1][1] = "yahya1";
		//combination3
		data[2][0] = "12345678";
		data[2][1] = "12345678";
		//combination4
		data[3][0] = "yahyaaaa";
		data[3][1] = "yahyaaaa";
		//combination5
		data[4][0] = "YAHYAAAA";
		data[4][1] = "YAHYAAAA";
		//combination6
		data[5][0] = "Yahya1234";
		data[5][1] = "Yahya12";
		//combination7
		data[6][0] = "Yahya123";
		data[6][1] = "Yahya1234";
		return data;
	}
}
