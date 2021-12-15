import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitLoginForM {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/");

        // get login button
        WebElement element = driver.findElement(By.linkText("Sign in"));
        element.click();
        // get login input
        WebElement login = driver.findElement(By.xpath(("//input[@name='login']")));
        login.click();
        login.clear();
        login.sendKeys("1234");
        // get pwd input
        WebElement pwd = driver.findElement(By.xpath(("//input[@name='password']")));
        pwd.click();
        pwd.clear();
        pwd.sendKeys("567890");
        // get button input
        WebElement button = driver.findElement(By.xpath(("//input[@name='commit']")));
        button.click();

        System.out.println(element);
//        driver.quit();
    }
}
