package home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOpencartSelenium {

    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://demo.opencart.com/";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        System.out.println("Title of the page: " + driver.getTitle());

        Thread.sleep(2000);

      //  driver.findElement(By.name("search")).sendKeys("Tablets");

      //  driver.findElement(By.className("btn")).click();

      //  driver.findElement(By.linkText("Cameras")).click();
      //  driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a"));

       // driver.findElement((By.className("img-fluid"))).click();

      //  driver.findElement(By.linkText("My Account")).click();
      //  driver.findElement(By.tagName("i"));

        driver.findElement(By.className("img-fluid"));
        driver.findElement(By.linkText("iPhone")).click();
    }
}
