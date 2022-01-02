
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Screenshots {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org/");

        File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        try {

//            FileUtils.copyFile(screen, new File("C:\\work\\screen1.png"));

//        }catch (IOException e){
//            e.printStackTrace();
//        }



    }
}
