import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MarketYandex {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://market.yandex.ru/");

        driver.findElement(By.xpath("//a[text() = 'Бытовая техника']")).click();
//        driver.findElement(By.xpath("//a[text() = 'Стиральные машины']")).click();


       List<WebElement> list = driver.findElements(By.xpath("//ul[@id = 'subItems']//li"));
       if (list.size() == 5){
           System.out.println("It`s ok");
       }else {
           System.out.println("FAIL!");
       }

       }

}
