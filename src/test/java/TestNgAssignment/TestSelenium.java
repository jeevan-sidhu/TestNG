package TestNgAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSelenium {
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
		driver.get("https://www.roicians.com/");
	}
	
	@Test(priority=1, groups={"Title"})
	public void getTitle() {
		String s = driver.getTitle();
		obj.assertEquals(s, "Google");
		System.out.println("getTitle is executed");  //It will show even if the assertion fails
		obj.assertAll();
	}
	
	@Test(priority=2, groups={"Verification"})
	public void RoicianLogoDisplay() {
		boolean res = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/section[2]/div/div[1]/div/div/div/div/a/div/div/img"))
				.isDisplayed();
		System.out.println(res);
	}
	
	@AfterTest
	public void CloseTab() {
		driver.close();
	}
}
