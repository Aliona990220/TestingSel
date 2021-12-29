import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDisableProperty {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_pushbutton_disabled2");
        Thread.sleep(2000);
        WebElement button1 = driver.findElement(By.xpath("//button[@id = 'myBtn']"));
        System.out.println(button1.isDisplayed());

        WebElement button2 = driver.findElement(By.xpath("//a[@id = 'getwebsitebtn']"));
        System.out.println(button2.isEnabled());

        driver.quit();
    }
}
