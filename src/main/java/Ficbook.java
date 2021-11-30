import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ficbook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ficbook.net/");
        WebElement element = driver.findElements(By.xpath("//div[@class='header-t']//a")).get(5);
        element.click();
        driver.close();
        driver.quit();

    }
}
