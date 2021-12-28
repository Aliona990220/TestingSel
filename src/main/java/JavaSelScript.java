import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSelScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org/");

        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("alert('HELLO WORLD!');");
        executor.executeScript("window.scrollBy(0, 1000)","");
        executor.executeScript("window.scrollBy(0, -1000)","");

    }
}
