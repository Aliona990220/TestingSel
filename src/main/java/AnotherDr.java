import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AnotherDr {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\WebDrayver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://images.google.com/");
        WebElement el = driver.findElement((By.xpath("//span[@class='tdPRye']")));
        Actions actions = new Actions(driver);
        actions.moveToElement(el).click().build().perform();
        driver.findElement(By.xpath("//span[@class='IyNJid H4qWMc aXIg1b']")).click();
        driver.findElement((By.xpath("//input[@id='awyMjb']"))).sendKeys("C:\\Qy4KYbXwxE4.jpg");
        driver.quit();


    }
}
