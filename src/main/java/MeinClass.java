import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeinClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/documentation/getting_started/installing_browser_drivers/");
        driver.close();
    }
}
