package firstmavenproject.hellojava;



import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public void testCase() throws IOException {
		// TODO Auto-generated method stub

	
     	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        TakesScreenshot shot = (TakesScreenshot)driver;
        File srcFile = shot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("screenshot/ganesh.png");
        FileUtils.copyFile(srcFile, destFile);
        System.out.println("Screenshot is taken successfully");
        Assert.assertTrue(false);
    }
}
