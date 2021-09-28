package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By textbox = By.xpath("//input[@id='srchword']");
	//By company =By.xpath("//input[@id='query']");
	By company =By.cssSelector("//input[class='getquoteinput']");
	
	public void search(String text)
	{
		  driver.findElement(textbox).sendKeys(text);;
	}
	
	public void company(String comp)
	{
		  driver.findElement(company).sendKeys(comp);;
	}
	
}
