package rssroy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class selenium_work {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		// Robot robot = new Robot();
		System.setProperty("http.proxyHost", "proxylb.icicibankltd.com");
		System.setProperty("http.proxyPort", "80");
		System.setProperty("https.proxyHost", "proxylb.icicibankltd.com");
		System.setProperty("https.proxyPort", "80");

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addExtensions(new File("src/main/resources/GoogleTranslate.crx"));
		driver = new ChromeDriver(options);
		System.out.println("Going to URL");
		driver.get("https://ebillet.dk/biograf/movie.aspx");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//WebElement elementEdit =driver.findElement(By.cssSelector("#ctl00_MainContentPlaceHolder_lblContentsHeader"));
		Actions action = new Actions(driver);
		/*action.moveToElement(elementEdit);
		action.contextClick(elementEdit).build().perform();
		action.contextClick(elementEdit).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click().build().perform();*/
		action.contextClick().build().perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(50);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(50);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(50);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(50);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(50);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(50);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ((WebElement) driver).sendKeys("\uE035");
		//driver.close();

	}

}
