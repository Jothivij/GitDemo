package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Loginpage lo = new Loginpage(driver);
		
		lo.search("compl");
		Thread.sleep(2000);
		lo.company("icon");
		
		
		
		
		
		
	}

}
