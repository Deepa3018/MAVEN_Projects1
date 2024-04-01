import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll_page
{
    @Test
    void scroll_page() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fgcu.edu/canvas/");
        driver.manage().window().maximize();

        JavascriptExecutor exe = (JavascriptExecutor) driver;
        exe.executeScript("window.scroll(0,1000)", "");//scroll up
        Thread.sleep(3000);
        exe.executeScript("window.scroll(0,-1000)", "");//scroll down
        Thread.sleep(3000);
        driver.close();
    }
}
