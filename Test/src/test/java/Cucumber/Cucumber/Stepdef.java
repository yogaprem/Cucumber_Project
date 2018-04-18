package Cucumber.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;

public class Stepdef {
	
	public static WebDriver objDriver;
	
	@Then("^The user launches the web site$")
	public void launchWebPage() {
		//System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		//objDriver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		objDriver = new FirefoxDriver();
		
		try{
			objDriver.get("http://automationpractice.com/index.php");
			System.out.println("Page launched");
			Thread.sleep(5000);
		}catch(Exception e){			
		}
	}
	
	@When("^I click SignIn enter required details$")
	public void clickSignIn() {
		try {

			objDriver.findElement(By.xpath("//*[contains(text(),\"Sign in\")]")).click();
			objDriver.findElement(By.id("email_create")).sendKeys("yogakart07@gmail.com");
			objDriver.findElement(By.id("SubmitCreate")).click();
			
			Thread.sleep(5000);
			
			objDriver.findElement(By.id("id_gender2")).click();
			objDriver.findElement(By.id("customer_firstname")).sendKeys("Yoga");
			objDriver.findElement(By.id("customer_lastname")).sendKeys("Karthiga");
			objDriver.findElement(By.id("email")).sendKeys("Yogakart83");
			objDriver.findElement(By.id("passwd")).sendKeys("apple");
			
			Select cmbDays = new Select(objDriver.findElement(By.id("days")));
			cmbDays.selectByValue("10");
			
			Select cmbMonths = new Select(objDriver.findElement(By.id("months")));
			cmbMonths.selectByValue("4");
			Select cmbYear = new Select(objDriver.findElement(By.id("years")));
			cmbYear.selectByValue("1990");
			
			objDriver.findElement(By.id("firstname")).sendKeys("Yoga");
			objDriver.findElement(By.id("lastname")).sendKeys("Karthiga");
			objDriver.findElement(By.id("company")).sendKeys("Wipro");
			objDriver.findElement(By.id("address1")).sendKeys("12 Ann Street");
			objDriver.findElement(By.id("address2")).sendKeys("Brisbane Central");
			objDriver.findElement(By.id("city")).sendKeys("Brisbane City");
			
			Select cmbState = new Select(objDriver.findElement(By.id("id_state")));
			cmbState.selectByValue("3");
			
			objDriver.findElement(By.id("postcode")).sendKeys("25251");
			
			Select cmbCountry = new Select(objDriver.findElement(By.id("id_country")));
			cmbCountry.selectByValue("21");
			
			objDriver.findElement(By.id("other")).sendKeys("Test Script");
			objDriver.findElement(By.id("phone")).sendKeys("131115");
			objDriver.findElement(By.id("phone_mobile")).sendKeys("048131115");
			objDriver.findElement(By.id("alias")).sendKeys("550 Queen street");
			
			objDriver.findElement(By.id("submitAccount")).click();
			Thread.sleep(5000);
		}
	catch(Exception ie) {
		}
	
}

@When("^I launch Summer Dresses and select filter$")
public void launchDresses() throws Exception {
	try{
		System.out.print("inside try");
		Actions action = new Actions(objDriver);
		action.moveToElement(objDriver.findElement(By.xpath("(//a[text() =\"Dresses\"])[2]"))).build().perform();
		Thread.sleep(2000);
		objDriver.findElement(By.xpath("(//a[text() =\"Summer Dresses\"])[2]")).click();
		Thread.sleep(5000);
		
		Select cmbFilter = new Select(objDriver.findElement(By.id("selectProductSort")));
		cmbFilter.selectByValue("price:asc");
		
	}catch(Exception ie) {
		throw ie;
	}
 }


}
			
