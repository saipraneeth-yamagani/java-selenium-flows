package learningSE_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Textbox {

		public static void main(String[] args) throws Exception {
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver35 = new ChromeDriver();
			driver35.manage().window().maximize();
			
			driver35.get("https://github.com/login");
			Thread.sleep(3000);
		WebElement usernameTxt = driver35.findElement(By.id("login_field"));
			if(usernameTxt.isDisplayed()) {
			    
				if(usernameTxt.isEnabled()) {
					usernameTxt.sendKeys("sai praneeth");
					String enteredText = usernameTxt.getAttribute("value");
					System.out.println(enteredText);
					
					Thread.sleep(4000);
					usernameTxt.clear();
					driver35.quit();
				}
				else
					System.err.println("username textbox is not enabled");
			}
			else
				System.err.println("username textbox is not displayed");
		}
	

    }


