package org.baseclass;

import org.locator.LoginPage;
import org.openqa.selenium.WebElement;

public class FBClass extends FunctionalLib {

	public static void main(String[] args) {
		FunctionalLib lib=new FunctionalLib();
		
		lib.getDriver();
		lib.lauchURL("https://www.facebook.com/");
		
		LoginPage l=new LoginPage();
		WebElement txtUserName = l.getTxtUserName();
		lib.enterText(txtUserName, "Welcome");
		 driver.navigate().refresh();
		 
		 lib.enterText(txtUserName, "JAV");
		 
		 WebElement txtPassword = l.getTxtPassword();
		 lib.enterText(txtPassword, "1234#Abc");
		 
		 WebElement btnLogin = l.getBtnLogin();
		 lib.btnClick(btnLogin);
	}

}
