package com.Inteli.Jenkins.testUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Helper {
	protected static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\BrowserDrivers\\chromedriver.exe" );
		//System.setProperty("webdriver.gecko.driver", "C:\\learnjava\\SeleniumTraining\\Files\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();//FirefoxDriver();
		driver.manage().window().maximize();	
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}

	public void login() throws InterruptedException {
		// Enters User name and password
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login Completed");

		//verify title

		String title = driver.getTitle();
		if (title.equalsIgnoreCase("OrangeHRM")) {
			System.out.println("Title is correct"); 
		} else {
			System.err.println("Title is not correct");
		}

		//Verify Welcome Text
		String welcomeText = driver.findElement(By.id("welcome")).getText();
		if (welcomeText.equalsIgnoreCase("Welcome Admin")) {
			System.out.println("Welcome Admin is displayed");

		} else {
			System.err.println("Welcome Admin is not displayed");
		}
	}
	//Logout

	@AfterTest
	public void closeBrowser()  {

		driver.findElement(By.id("welcome")).click();
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Logout"));
		//Thread.sleep(2000);
		//		if (driver.findElements(By.id("welcome")).isEmpty()) {
		//			System.err.println("Logout not successful");
		//		} else {
		//				System.out.println("Logout Completed");
		//			}

		driver.quit();


	}
}

