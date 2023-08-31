package TestNgAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Parameterization {

	WebDriver driver;
	SoftAssert obj;
	@BeforeSuite
	public void DriverSetup() {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	}
	
	@BeforeTest
	public void InitialSetup() {
		driver = new FirefoxDriver();
		obj = new SoftAssert();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	@BeforeMethod
	public void OpenUrl() {
		driver.get("https://www.roicians.com/contact-us/");
	}	

	@DataProvider(name="data")
	public Object[][] input_fname(){
		return new Object[][] {{"Jeevan"}, {"Roicians"}, {"Software Testing"}};
	}
	
	@Test(dataProvider="data")
	public void Contactus_TC1_valid_fname(String fname) {
		driver.findElement(By.id("text-77525447616")).sendKeys(fname);
	}
	
	@AfterTest
	public void CloseTab() {
		driver.close();
	}
}
