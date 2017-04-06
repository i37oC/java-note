package xyy.java.note.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author xyy
 * @version 1.0 2017/3/21.
 * @since 1.0
 */
public class FacebookLoginSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("sfasdf");
    }
}
