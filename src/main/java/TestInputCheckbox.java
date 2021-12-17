import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class TestInputCheckbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        ((JavascriptExecutor) driver).executeScript(
                "var inputs = document.getElementsByTagName('input');"+
                        "for (var i = 0; i < inputs.length; i++){"+
                        "if (inputs[i].type == 'checkbox'){"+
                        "inputs[i].checked=true;" +
                        "}"+
                        "}"
        );

        String test = (String)((JavascriptExecutor) driver).executeScript(
                "var controlGroupAlpha;" +
                        "var controlGroupBetta;" +
                        "var inputs = document.getElementsByTagName('input');"+
                        "for (var i = 0; i < inputs.length; i++){"+
                        "if (inputs[i].type == 'checkbox'){"+
                        "controlGroupAlpha = inputs[i].getAttribute('name');" +
                        "controlGroupBetta = controlGroupBetta+';'+ controlGroupAlpha;"+
                        "}"+
                        "}" +
                        "return controlGroupBetta;"
        );
        Reporter.log("All checked : "+test);


    }
    }
