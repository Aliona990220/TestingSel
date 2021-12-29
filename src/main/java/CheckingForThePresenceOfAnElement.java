import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingForThePresenceOfAnElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");

        if (driver.findElements(By.xpath("//a[text() = 'Log in']")).size() > 0){
            System.out.println("Search element is presented");
        }else {
            System.out.println("Cannot find an element");
        }
        driver.quit();

    }
}
