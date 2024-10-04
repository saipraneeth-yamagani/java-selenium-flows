package learningSE_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.openqa.selenium.WindowType;

public class AssertTEST {
    @Test
    public void seew() {

	WebDriverManager.chromedriver().setup();
	WebDriver driver2 = new ChromeDriver();

	driver2.manage().window().maximize();
	driver2.get("https://www.facebook.com/");

driver2.findElement(By.name("email")).sendKeys("taylorswift", Keys.ENTER);

	System.out.println("Facebook Page Title: " + driver2.getTitle());

	driver2.switchTo().newWindow(WindowType.TAB);
	driver2.get("https://www.google.com");

	WebElement searchBox = driver2.findElement(By.name("q"));
	searchBox.sendKeys("selenium", Keys.ENTER);

	String actualTitle = driver2.getTitle();
	System.out.println("Actual Google Page Title: " + actualTitle);

	String expectedTitle = "selenium";
	assertTrue(actualTitle.toLowerCase().contains(expectedTitle.toLowerCase()),
		"The title does not contain the expected text.");

	driver2.quit();
    }
}
