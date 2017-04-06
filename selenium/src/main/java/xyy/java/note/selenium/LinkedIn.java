package xyy.java.note.selenium;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkedIn {
	WebDriver driver = null;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"/Users/xyy/IdeaProjects/java-note/selenium/src/main/resources/chromedriver");


		driver = new ChromeDriver();
		String baseUrl = "https://www.linkedin.com/";
		driver.get(baseUrl);

	}

	@Test
	public void login() throws InterruptedException {
		WebElement login = driver.findElement(By.id("login-email"));
		login.sendKeys("tjgcourage11@163.com");

		WebElement pwd = driver.findElement(By.id("login-password"));
		pwd.sendKeys("lxtjgzfl@1206");

		WebElement in = driver.findElement(By.name("submit"));
		in.click();

		Set<Cookie> cookieSet = driver.manage().getCookies();

		System.out.println("cookieSet" + cookieSet);
		Thread.sleep(10000);
	}

	@Test
	public void profile() {
		// here it gives error to me : Unable to locate element
		Actions action = new Actions(driver);
		WebElement profile = driver.findElement(By.xpath("//*[@id='img-defer-id-1-25469']"));
		action.moveToElement(profile).build().perform();
		driver.quit();
	}

}