import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ComplexAct {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        WebElement link = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[text() = 'Electronics']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();
        WebElement element = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[text() = 'Electronics']"));
        actions.dragAndDrop(element, link).build().perform();

        actions.clickAndHold(link).moveToElement(element).release().build().perform();
        actions.contextClick(element).build().perform();
        actions.doubleClick(element).build().perform();

        Action action = actions.clickAndHold(link).moveToElement(element).release().build();
        action.perform();
        driver.quit();




    }
}
