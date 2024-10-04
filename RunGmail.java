package learningSE_TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunGmail {

//	public static void main(String[] args) {
//	
//			System.setProperty("webdriver.edge.driver","D:\\driversTEST\\edgedriver_win64\\msedgedriver.exe");
//			WebDriver driver1 = new EdgeDriver();
//			
//			driver1.manage().window().maximize();
//			driver1.get("https://www.gmail.com");
//			
//			driver1.quit();

    @Test
    public void TestGoogle() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	    driver.manage().window().maximize();
	    driver.get("https://dribbble.com/search");

	    driver.findElement(By.name("q")).sendKeys("MUTI", Keys.ENTER);

	    System.out.println(driver.getTitle());

	
	    driver.close();
	    Thread.sleep(5000);

	
    }

    @Test
    public void TestWebNw() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver2 = new ChromeDriver();

	driver2.manage().window().maximize();

	driver2.get("https://www.facebook.com/");
	driver2.findElement(By.name("email")).sendKeys("taylorswift", Keys.ENTER);

	System.out.println(driver2.getTitle());

	driver2.switchTo().newWindow(WindowType.TAB);
	driver2.get("https://www.google.com");

	driver2.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);

	driver2.quit();

    }

    @Test
    public void TestMAX() {

	WebDriverManager.chromedriver().setup();
	WebDriver driverTest2 = new ChromeDriver();

	driverTest2.manage().window().maximize();
	driverTest2.get("https://www.google.com/");
	driverTest2.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);

	driverTest2.switchTo().newWindow(WindowType.TAB);
	driverTest2.get("https://www.walmart.com");
//driverTest2.findElement(By.name("q")).sendKeys("iphone 15 pro max",Keys.ENTER);
	System.out.println("successfully runned");
	driverTest2.quit();

    }
}
