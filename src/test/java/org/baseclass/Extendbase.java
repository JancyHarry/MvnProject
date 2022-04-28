package org.baseclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Extendbase extends SampleBase {

	public static void main(String[] args) throws IOException {
		Extendbase ex = new Extendbase();
		ex.getDriver();
		ex.lauchURL("https://www.facebook.com/");
		WebElement txtUsername = ex.locatingElement("id", "email");
		ex.enterText(txtUsername, "Esra@1234");
		WebElement txtPassword = ex.locatingElement("id", "pass");
		ex.enterText(txtPassword, "1234@dfhh");
		WebElement buttonClick = ex.locatingElement("name", "login");
		ex.btnClick(buttonClick);
		ex.screenShots("C:\\Users\\lenovo\\Pictures\\Screenshot\\failedlogin.png");
		ex.lauchURL("https://www.amazon.in/");
		WebElement searchBox = ex.locatingElement("id", "twotabsearchtextbox");
		ex.enterText(searchBox, "iphone 13");
		WebElement searchIcon = ex.locatingElement("id", "nav-search-submit-button");
		ex.btnClick(searchIcon);
		WebElement prctIphone = ex.locatingElement("xpath", "(//span[text()='Apple iPhone 13 (128GB) - (Product) RED'])[1]");
        ex.btnClick(prctIphone);
        ex.windowHandling();
        WebElement btnAdd = ex.locatingElement("id", "add-to-cart-button");
        ex.btnClick(btnAdd);
	}
	
	
	
	
	
	

}
