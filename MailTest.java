package learningSE_TestNG;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MailTest {

    @Test
    public void MailTTest() {

	System.setProperty("webDriver.edge.driver", "D:\\driversTEST\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver1 = new EdgeDriver();

	driver1.manage().window().maximize();
	driver1.get("https://www.gmail.com");

	driver1.quit();
    }
}
