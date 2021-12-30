import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewCekingEl {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.ua/");

        System.out.println("=======================");
        System.out.println("Navbar link checks");

        if(driver.findElement(By.xpath("//input[@value = 'Поиск в Google']"))!= null){
            System.out.println("Images link in Navbar is Present");
        }else{
            System.out.println("Images link in Navbar is Absent");
        }

        if(driver.findElement(By.xpath("//input[@value = 'Мне повезёт!']"))!= null){
            System.out.println("News link in Navbar is Present");
        }else{
            System.out.println("News link in Navbar is Absent");
        }


    }
}
