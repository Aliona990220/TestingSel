import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WikiBut {
    public static void main(String[] args) {
        String baseUrl = "https://ru.wikipedia.org/wiki/";
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();

        driver.get("https://github.com");
        WebElement button = driver.findElement(By.xpath("//form[@class='mx-auto mx-md-0 col-5-max js-signup-form position-relative z-2']//button"));
        button.submit();
    }
}
