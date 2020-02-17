package firstmavenproject.hellojava;



import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    { 	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        TakesScreenshot shot = (TakesScreenshot)driver;
        File srcFile = shot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("screenshot/ganesh.jpg");
        FileUtils.copyFile(srcFile, destFile);
        System.out.println("Screenshot is taken successfully");
        
    }
}
