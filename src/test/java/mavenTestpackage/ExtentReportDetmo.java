package mavenTestpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDetmo {

	ExtentReports extent;
	@BeforeTest
	public void Report()
	{
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter report =new ExtentSparkReporter(path);
		report.config().setDocumentTitle("Test Result");
		report.config().setReportName("Web autmoation result");
		
		
		 extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("tester", "Jothi");
				
		
	}
	
	
	
	@Test
	public void inintalDemo()
	{
		
		System.setProperty ("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com");
		extent.createTest("TestName");
		
		
	}
}
