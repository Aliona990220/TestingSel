import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithAlerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html");
        driver.findElement(By.xpath("//a[text() = 'Developer']")).click();
//        driver.switchTo().window()
        for (String windowHandle : driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
        driver.findElement(By.xpath("//a[text() = 'Products']")).click();
        driver.quit();

    }
}
