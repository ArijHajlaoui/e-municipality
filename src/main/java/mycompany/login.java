package mycompany;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import repertoireobjet.log;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class login extends base {

	@Test(dataProvider = "getdata1")
	public void signinn(String username, String password) {
		// select a language
		log municipality = new log(driver);
		municipality.dropdownbox().click();
		municipality.languagetoselect().click();

		// sign in
		municipality.mailaddress().sendKeys(username);
		municipality.mailaddress().sendKeys(Keys.TAB);
		municipality.Motdepasse().sendKeys(password);
		municipality.signinaccount().click();

	}

	@DataProvider
	public Object[][] getdata1() {
		Object[][] data = new Object[2][2];
		// combination1
		data[0][0] = "yahya";
		data[0][1] = "admin";
		// combination2
		data[1][0] = "admin";
		data[1][1] = "Admin1234";
		return data;
	}

	@Test(dataProvider = "getdata2")
	public void signup(String pw, String pwc) {

		log municipality = new log(driver);
		municipality.emaillog().click();
		
		// check if "contractor" is selected by default
		Boolean x = municipality.contractorbutton().isSelected();
		if (x) {
			System.out.println("Contractor is selected");
		} else {
			System.out.println("Beneficiary is selected");
		}

		// check password structure in sign up
		municipality.organization().sendKeys("test");
		municipality.contractornumber().sendKeys("1223456789");
		municipality.eemailaddress().sendKeys("test7@gmail.com");
		municipality.phonenumber().sendKeys("12367556888");
		municipality.officename().sendKeys("test");
		municipality.username().sendKeys("yahya1112345556");
		municipality.passwordtoenter().sendKeys(pw);
		municipality.passwordconfirm().sendKeys(pwc);
		municipality.signupaccount().click();
		String currentmessage = municipality.currentmessagedisplayed().getText();
		String expectedmessage = "Account successfully created.";
		Assert.assertNotEquals(currentmessage, expectedmessage);
		System.out.println("password structure is respected");

		/*
		 * Assert.assertFalse(driver.findElement(By.id("messageEr")).isDisplayed(),
		 * "Account successfully created."); String ActualTitle =
		 * driver.getCurrentUrl(); String ExpectedTitle = "Log in to Municipality";
		 * Assert.assertEquals(ActualTitle, ExpectedTitle); System.out.println("True");
		 */
	}

	@DataProvider
	public Object[][] getdata2() {
		Object[][] data = new Object[7][2];
		// combination1
		data[0][0] = "yahya";
		data[0][1] = "yahya";
		// combination2
		data[1][0] = "yahya1";
		data[1][1] = "yahya1";
		// combination3
		data[2][0] = "12345678";
		data[2][1] = "12345678";
		// combination4
		data[3][0] = "yahyaaaa";
		data[3][1] = "yahyaaaa";
		// combination5
		data[4][0] = "YAHYAAAA";
		data[4][1] = "YAHYAAAA";
		// combination6
		data[5][0] = "Yahya1234";
		data[5][1] = "Yahya12";
		// combination7
		data[6][0] = "Yahya123";
		data[6][1] = "Yahya1234";
		return data;
	}
}
