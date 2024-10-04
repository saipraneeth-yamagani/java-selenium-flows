package learningSE_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locater {


    public static void highlight(WebDriver driver34, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver34;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:white')", element);
    }

    @Test
    public void runlocaters() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver34 = new ChromeDriver();

        driver34.manage().window().maximize();
        
//        ->>
        //  GitHub login page locaters action githubb
        driver34.get("https://github.com/login");
        Thread.sleep(3000);

        // Highlightingg  different locators
        
        
        
//        by ID
        highlight(driver34, driver34.findElement(By.id("login_field")));
        Thread.sleep(3000);
//by name
        highlight(driver34, driver34.findElement(By.name("password")));
        Thread.sleep(3000);

        System.out.println("curent page to navigated to"
        	+ driver34.getTitle());
        
//        by class name
  highlight(driver34, driver34.findElement(By.className("header-logo")));
  System.out.println("curent page to navigated to"
  	+ driver34.getTitle());

//  by link text
      highlight(driver34, driver34.findElement(By.linkText("Forgot password?")));
        Thread.sleep(3000);
        System.out.println("curent page to navigated to"
        	+ driver34.getTitle());

     highlight(driver34, driver34.findElement(By.partialLinkText("Create an acc")));
        Thread.sleep(3000);
        System.out.println("curent page to navigated to");
//tag name locator
      highlight(driver34, driver34.findElement(By.tagName("h1")));
        Thread.sleep(3000);
        System.out.println("curent page to navigated to"
        	+ driver34.getTitle());
// xpath locator
     highlight(driver34, driver34.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
        Thread.sleep(3000);
        
        String NowURL = driver34.getCurrentUrl();
	System.out.println("Current URL:next navigate to the web page  " + NowURL);
	
	
//	css selector locator
        highlight(driver34, driver34.findElement(By.cssSelector("input[name='commit']")));
        Thread.sleep(3000);

       
        driver34.quit();
    }
}
