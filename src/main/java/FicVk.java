import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FicVk {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = ("https://ficbook.net/");
        driver.get(baseUrl);
        WebElement emblemVK = driver.findElements(By.xpath("//ul[@class='social-top list-inline']//li")).get(0);

        emblemVK.click();
        driver.close();
        driver.quit();
    }
}
