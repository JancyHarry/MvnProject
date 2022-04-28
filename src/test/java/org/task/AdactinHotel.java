package org.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {
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

	// public void implicitlyWait(int sec) {
	// driver.manage().timeouts().implicitlyWait(driver,Duration.ofSeconds(10));
	//
	// }
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

	public void dropDown(WebElement drop, String val) {

		Select select = new Select(drop);

		// select.selectByValue(val);
		select.selectByVisibleText(val);
		// select.selectByIndex(no);

	}
	
	
}
