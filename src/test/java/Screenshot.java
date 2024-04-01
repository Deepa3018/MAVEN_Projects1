import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Screenshot
{
    @Test
    void screenshot() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\pictures\\screenshot_testng.png");
        FileHandler.copy(src, des);
    }
}
