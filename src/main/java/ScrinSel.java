import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ScrinSel {
    private static DocFile FileUtils;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.ua/");

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

//        FileUtils.copyFile(scrFile, new File("C:\\Users\\alion\\OneDrive\\Зображення\\Знімки екрана\\scrin2.png"));
    }


}

