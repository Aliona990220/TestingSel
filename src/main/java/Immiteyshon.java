import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Immiteyshon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com.ua/");

        keyPress();
        keyPress();
        keyRelease();
        keyRelease();
    }

    private static void keyRelease() {
        System.out.println("VK_OPEN_BRACKET");
    }

    private static void keyPress() {
        System.out.println("VK_SHIFT");
    }
    
}

