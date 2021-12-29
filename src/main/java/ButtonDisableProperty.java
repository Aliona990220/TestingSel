import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDisableProperty {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/jsref/prop_pushbutton_disabled.asp");
        Thread.sleep(5000);
        WebElement button2 = driver.findElement(By.xpath("//a[@id = 'w3loginbtn']"));

        System.out.println(button2.isDisplayed());

//        driver.quit();
    }
}
