package org.o7planning.servletexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFileServlet  {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://images.google.com/");
        WebElement el = driver.findElement((By.xpath("//span[@class='tdPRye']")));
        Actions actions = new Actions(driver);
        actions.moveToElement(el).click().build().perform();
        driver.findElement(By.xpath("//span[@class='IyNJid H4qWMc aXIg1b']")).click();
        driver.findElement((By.xpath("//input[@id='awyMjb']"))).sendKeys("C:\\Qy4KYbXwxE4.jpg");
        driver.quit();


    }

}

