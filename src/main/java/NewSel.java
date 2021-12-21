import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NewSel {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seasonvar.ru/");
        WebElement ul_element = driver.findElement(By.xpath("//div[@class='news']"));
        List<WebElement> a_All = ul_element.findElements(By.tagName("a"));
        System.out.println(a_All.size());
        for (WebElement webElement : a_All) {
            System.out.println(webElement.getText());
        }

        for(WebElement element : a_All){
            System.out.println(element.getText());
        }
        driver.quit();
    }
}
