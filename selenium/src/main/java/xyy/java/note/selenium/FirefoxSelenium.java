package xyy.java.note.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author xyy
 * @version 1.0 2017/3/21.
 * @since 1.0
 */
public class FirefoxSelenium {
    public static void main(String[] args) {
        //System.setProperty("webdriver.firefox.bin","/Applications/Firefox.app/Contents/MacOS/firefox-bin");
        System.setProperty("webdriver.gecko.driver","/Users/xyy/IdeaProjects/java-note/selenium/src/main/resources/geckodriver");
        WebDriver driver = new FirefoxDriver();
        WebDriver.Navigation navigation = driver.navigate();
        navigation.to("http://www.baidu.com");
        //driver.findElement(By.id("email")).sendKeys("sfasdf");
    }
}
