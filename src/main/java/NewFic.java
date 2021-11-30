import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewFic {
    static String baseUrl = "https://ficbook.net/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        WebElement authors = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']//a")).get(2);
        authors.click();
        driver.close();
        driver.quit();



    }
}
