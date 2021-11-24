import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrNew {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ru.wikipedia.org/wiki/");
        WebElement elements = driver.findElements(By.xpath("//div[@class='main-top-right main-plainlist']//span")).get(0);
        elements.click();
        driver.quit();
    }

}
