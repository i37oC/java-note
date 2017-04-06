package xyy.java.note.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author xyy
 * @version 1.0 2017/3/21.
 * @since 1.0
 */
public class SeleniumTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        //System.setProperty("webdriver.chrome.driver","/Users/xyy/.m2/repository/org/seleniumhq/selenium/selenium-chrome-driver/3.3.1/selenium-chrome-driver-3.3.1.jar!/org/openqa/selenium/chrome/ChromeDriver.class");
        //Class.forName("org.openqa.selenium.chrome.ChromeDriver");
        //System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        System.setProperty("webdriver.chrome.driver","/Users/xyy/IdeaProjects/java-note/selenium/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");

    }
}
