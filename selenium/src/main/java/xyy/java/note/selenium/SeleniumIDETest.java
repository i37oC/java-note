package xyy.java.note.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumIDETest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/Users/xyy/IdeaProjects/java-note/selenium/src/main/resources/geckodriver");
        //System.setProperty("webdriver.chrome.driver","/Users/xyy/IdeaProjects/java-note/selenium/src/main/resources/chromedriver");

        driver = new FirefoxDriver();
        baseUrl = "https://www.baidu.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testHehe() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.id("kw")).click();
        driver.findElement(By.id("kw")).clear();
        driver.findElement(By.id("kw")).sendKeys("asdfasf");
        driver.findElement(By.id("kw")).clear();
        driver.findElement(By.id("kw")).sendKeys("asdfasf");
        driver.findElement(By.id("su")).click();
        driver.findElement(By.id("su")).click();
        driver.findElement(By.linkText("asdfasf的微博_腾讯微博")).click();
        driver.findElement(By.linkText("asdfasf的微博_腾讯微博")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=app | ]]
        driver.findElement(By.linkText("关闭")).click();
        driver.findElement(By.linkText("关闭")).click();
        driver.findElement(By.cssSelector("img")).click();
        driver.findElement(By.cssSelector("#top-250278023676399-0 > a.clk-1 > img")).click();
        driver.findElement(By.cssSelector("#top-250278023676399-0 > a.clk-1 > img")).click();
        driver.findElement(By.linkText("关闭")).click();
        driver.findElement(By.linkText("关闭")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
