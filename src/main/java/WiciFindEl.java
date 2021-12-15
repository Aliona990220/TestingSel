import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WiciFindEl {
    public static void main(String[] args) {
        String baseUrl = "https://ru.wikipedia.org/wiki/";
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.manage().window().maximize();

        WebElement log = driver.findElement(By.linkText("Log in"));
        WebElement log2 = driver.findElement(By.partialLinkText("Donate"));
        WebElement seartchFiled = driver.findElement(By.name("search"));
        WebElement input = driver.findElement(By.tagName("input"));
        WebElement element = driver.findElement(By.cssSelector("div#simpleSearch input#searchButton"));
        driver.quit();


    }
}




