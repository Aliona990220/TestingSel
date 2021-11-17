import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverStartupAndFirstSteps {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().setSize(new Dimension(900, 500));

        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.selenium.dev/documentation/getting_started/installing_browser_drivers/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();

    }
}
