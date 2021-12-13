import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookText {
    public static void main(String[] args) {
        String baseUrl = "http://www.facebook.com/";
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.findElement(By.linkText("Вход")).click();
        System.out.println("title of page is: " + driver.getTitle());
//        driver.quit();
    }
}
