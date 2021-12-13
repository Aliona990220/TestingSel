import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WheitTeme {
    public static void main(String[] args) {
        String baseUrl = "http://www.facebook.com/";
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().setSize(new Dimension(1280, 970));


        WebElement element = driver.findElement(By.id("email"));
        Assert.assertTrue(element.isDisplayed());
        driver.quit();

    }

    }

