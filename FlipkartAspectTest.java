package learningSE_TestNG;
import org.testng.annotations.Test;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class FlipkartAspectTest {
    public static void main(String[] args) {

    }
   @Test  
    public static void laptop() throws InterruptedException {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver365 = new ChromeDriver();

        driver365.manage().window().maximize();


        driver365.get("https://www.flipkart.com");

        Thread.sleep(3000);

   
    driver365.findElement(By.name("q")).sendKeys("mac book air2", Keys.ENTER);

  Thread.sleep(4000);
try {
    driver365.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
} catch (Exception e) {
  
}
WebElement firstLaptop = driver365.findElement(By.cssSelector("div[class='Nx9bqj _4b5DiR']"));


firstLaptop.click();
Thread.sleep(3000);

ArrayList<String> tabs = new ArrayList<>(driver365.getWindowHandles());


driver365.switchTo().window(tabs.get(1));
WebElement addToCartButton = driver365.findElement(By.cssSelector("button[class='QqFHMw vslbG+ In9uk2']"));

addToCartButton.click();
Thread.sleep(5000);

driver365.switchTo().window(tabs.get(1));
driver365.get("https://www.flipkart.com/viewcart"); 
Thread.sleep(5000);

driver365.getTitle();
System.out.println(driver365.getTitle());


driver365.quit();

    }
}

	
