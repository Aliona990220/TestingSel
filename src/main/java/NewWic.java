import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NewWic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ru.wikipedia.org/wiki/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Удод");
        System.out.println(driver.findElement(By.xpath("//div[@id='simpleSearch']/input")).getAttribute("value"));
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();


    }
}
