package repertoireobjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class log {
	WebDriver driver;
	
	public log(WebDriver driver) {
		this.driver = driver;
	}
	private By dropdown = By.id("kc-current-locale-link");
	String value = "Arabic";
	private By lang = By.xpath("//a[contains(text(),'" + value + "')]");
	private By mail = By.id("username");
	private By mp = By.cssSelector(":focus");
	private By signin = By.xpath("//*[@id=\"kc-form-buttons\"]/input");
	private By email = By.linkText("Sign Up");
	private By contractor = By.id("Contractor");
	private By org = By.id("user.attributes.organisation");
	private By crnumber = By.id("user.attributes.crNumber");
	private By eemail = By.id("email");
	private By phone = By.id("user.attributes.phone");
	private By office = By.id("user.attributes.officeLocation");
	private By user = By.id("username");
	private By pass = By.id("password");
	private By passconfirm = By.id("password-confirm");
	private By signupp = By.xpath("//*[@id=\"kc-form-buttons\"]/input");
	private By currmessage = By.id("kc-page-title");

	public WebElement dropdownbox() {
		return (driver.findElement(dropdown));
	}

	public WebElement languagetoselect() {
		return (driver.findElement(lang));
	}

	public WebElement mailaddress() {
		return (driver.findElement(mail));
	}

	public WebElement Motdepasse() {
		return (driver.findElement(mp));
	}

	public WebElement signinaccount() {
		return (driver.findElement(signin));
	}

	public WebElement emaillog() {
		return (driver.findElement(email));
	}

	public WebElement contractorbutton() {
		return (driver.findElement(contractor));
	}

	public WebElement organization() {
		return (driver.findElement(org));
	}

	public WebElement contractornumber() {
		return (driver.findElement(crnumber));
	}

	public WebElement eemailaddress() {
		return (driver.findElement(eemail));
	}

	public WebElement phonenumber() {
		return (driver.findElement(phone));
	}

	public WebElement officename() {
		return (driver.findElement(office));
	}

	public WebElement username() {
		return (driver.findElement(user));
	}

	public WebElement passwordtoenter() {
		return (driver.findElement(pass));
	}

	public WebElement passwordconfirm() {
		return (driver.findElement(passconfirm));
	}

	public WebElement signupaccount() {
		return (driver.findElement(signupp));
	}

	public WebElement currentmessagedisplayed() {
		return (driver.findElement(currmessage));
	}

}
