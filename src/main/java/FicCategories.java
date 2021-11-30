import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FicCategories {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = ("https://ficbook.net/");
        driver.get(baseUrl);
        WebElement categories = driver.findElements(By.xpath("//div[@class='categories-list categories-block-box']//span")).get(0);

        categories.click();
        driver.close();
        driver.quit();
    }
}
