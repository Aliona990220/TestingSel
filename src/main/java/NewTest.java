import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shafa.ua/uk/");
        WebElement login = driver.findElements(By.xpath("//div[@class='_1C8R7Ed8PZh8800Q5y1A']//a")).get(2);
        Thread.sleep(3000);
        login.click();
        Thread.sleep(2000);
        WebElement email = driver.findElements(By.xpath("//div[@class='_2ze0hXfd8Fj8W5fmqJC6']//input")).get(0);
        email.click();
        email.sendKeys("Aliona");

        WebElement password = driver.findElements(By.xpath("//div[@class='_2ze0hXfd8Fj8W5fmqJC6']//input")).get(1);
        password.click();
        password.sendKeys("*******");
        driver.quit();
    }
}
