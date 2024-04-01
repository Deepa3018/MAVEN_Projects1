import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebElements_size {

    @Test
    void url_currenturl() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/login.html");

//get the current url
        String currenturl= driver.getCurrentUrl();
        System.out.println(currenturl);
        driver.manage().window().maximize();

//get the title of the page
        String title_page=driver.getTitle();
        System.out.println(title_page);

//give valid email and password
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.name("passwd"));
        email.sendKeys("deepamagi@gmail.com");
        Thread.sleep(5000);
        password.sendKeys("abcd123**");
        Thread.sleep(5000);
//login
        WebElement login = driver.findElement(By.id("SubmitLogin"));
        login.click();

//get the current url
        String currenturlnew= driver.getCurrentUrl();
        System.out.println(currenturlnew);

        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println(link.size());

        // getting name of the links
        for (WebElement l : link) {
            System.out.println(l.getText());
        }

        driver.quit();
        }
    }
