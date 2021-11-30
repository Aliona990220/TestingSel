import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PictureFanfictionBook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = ("https://ficbook.net/");
        driver.get(baseUrl);
        WebElement pictureOfFanfictionBook = driver.findElement(By.xpath("//div[@class='form-search']/input"));
        pictureOfFanfictionBook.click();
        driver.close();
        driver.quit();
    }
}
