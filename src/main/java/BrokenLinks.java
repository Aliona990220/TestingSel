import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();;
        String homePage = "http://www.zlti.com";
        String url;
        HttpURLConnection huc;
        int respCode;


        driver.manage().window().setSize(new Dimension(900, 500));

        driver.get(homePage);

        List<WebElement> links = driver.findElements(By.tagName("a"));
        WebElement f = driver.findElement(By.xpath("\\div a"));

        for (WebElement link : links) {

            url = link.getAttribute("href");

            System.out.println(url);

            if (url == null || url.isEmpty()) {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }

            if (!url.startsWith(homePage)) {
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }

            try {
                huc = (HttpURLConnection) (new URL(url).openConnection());

                huc.setRequestMethod("HEAD");

                huc.connect();

                respCode = huc.getResponseCode();

                if (respCode >= 400) {
                    System.out.println(url + " is a broken link");
                } else {
                    System.out.println(url + " is a valid link");
                }

            } catch (IOException e) {

                e.printStackTrace();
            }
        }

            driver.quit();

        }
    }


