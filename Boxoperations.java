package learningSE_TestNG;


//    import java.util.List;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

    public class Boxoperations {
    @Test
    	public static void main(String[] args) {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver355 = new ChromeDriver();
	driver355.manage().window().maximize();
    		
    		
    		driver355.get("https://www.demoqa.com/automation-practice-form");
    		driver355.manage().window().maximize();



    		WebElement checkBoxSelected = driver355.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
    		boolean isSelected = checkBoxSelected.isSelected();

    		// performing click operation if element is not selected 
    		if(isSelected == false) {
    			checkBoxSelected.click();
    		}

    		/**
    		 * Validate isDisplayed and click
    		 */
    		WebElement checkBoxDisplayed = driver355.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
    		boolean isDisplayed = checkBoxDisplayed.isDisplayed();

    		// performing click operation if element is displayed
    		if (isDisplayed == true) {
    			checkBoxDisplayed.click();
    		}

    		/**
    		 * Validate isEnabled and click
    		 */
    		WebElement checkBoxEnabled = driver355.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
    		boolean isEnabled = checkBoxEnabled.isEnabled();

    		// performing click operation if element is enabled
    		if (isEnabled == true) {
    			checkBoxEnabled.click();
    		}

    	}

    }

