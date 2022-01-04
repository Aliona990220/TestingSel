import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Phan {
    private final WebDriver driver;
    JavascriptExecutor js;

    String baseURL = "http://www.indianrail.gov.in/inet_Srcdest.html";

    public Phan(WebDriver driver) {
        this.driver = driver;
    }

    public void getTrains(String src, @org.jetbrains.annotations.NotNull String dest){
        driver.get(baseURL);

        String xpathSrc = null;
        WebElement elemSrc =  driver.findElement(By.xpath(xpathSrc));
        setAttributeValue(elemSrc, src.toUpperCase());

        String xpathDest = null;
        WebElement elemDest = driver.findElement(By.xpath(xpathDest));
        setAttributeValue(elemDest, dest.toUpperCase());

        WebElement elemGetDetails = driver.findElement(By.xpath("//*[@id='formId']/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[16]/td[2]/input[1]"));
        elemGetDetails.click();

        System.out.println(driver.getCurrentUrl()+ " "+ driver.getTitle());

    }

    public void setAttributeValue(WebElement elem, String value){
        String scriptSetAttrValue = "arguments[0].setAttribute(arguments[1],arguments[2]);";
        js.executeScript(scriptSetAttrValue, elem, "value", value);
    }
    public static void main(String [] args){
        System.out.println(System.getProperty("phantomjs.binary"));


    }

}


