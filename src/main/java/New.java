import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://ru.wikipedia.org/wiki/");
        WebElement element = driver.findElement(By.xpath("//*[text()='Write and Earn']"));

    }
}
