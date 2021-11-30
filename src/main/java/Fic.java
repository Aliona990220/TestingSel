import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = ("https://ficbook.net/");
        driver.get(baseUrl);
        WebElement searchForFanFiction = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']//a")).get(11);

        searchForFanFiction.click();
        driver.close();
        driver.quit();
    }
}
