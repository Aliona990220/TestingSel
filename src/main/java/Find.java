import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); driver.get("https://www.softwaretestinghelp.com/");
        WebElement textDemo = driver.findElement(By.xpath("//*[text()='Write and Earn']"));
        if(textDemo.isDisplayed()) {
            System.out.println("Element found using text");
        } else System.out.println("Element not found"); driver.quit();
    }
    }

