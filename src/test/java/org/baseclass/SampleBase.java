package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleBase {
	public static WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void lauchURL(String url) {
		driver.get(url);
	}

	public void enterText(WebElement element, String name) {
		element.sendKeys(name);
	}

	public void btnClick(WebElement btnclick) {
		btnclick.click();

	}

	public WebElement locatingElement(String locator, String value) {
		WebElement element = null;
		switch (locator) {
		case "id":
			element = driver.findElement(By.id(value));
			break;
		case "name":
			element = driver.findElement(By.name(value));
			break;
		case "xpath":
			element = driver.findElement(By.xpath(value));
			break;

		default:
			break;
		}
		return element;
	}

	public void screenShots(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(path));

	}
	
	public void windowHandling() {
		String parentWin = driver.getWindowHandle();
		Set<String> allWinId = driver.getWindowHandles();
		for (String win : allWinId) {
			if(! (parentWin.equals(win))) {
				driver.switchTo().window(win);
				
			}
			
		}
		

	}
	

}
