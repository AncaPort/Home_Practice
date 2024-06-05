package home_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolDemoSelenium {

    public static void main(String[] args) {

        String baseUrl = "https://www.w3schools.com/";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        System.out.println("Title of the page: " + driver.getTitle());






    }

}
