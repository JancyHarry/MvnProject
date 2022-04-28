package org.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.task.AdactinHotel;

public class SelectHotel extends AdactinHotel {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement selectRadiobtn;
	
	@FindBy(id = "continue")
	private WebElement continueNxtpage;

	public WebElement getSelectRadiobtn() {
		return selectRadiobtn;
	}

	public WebElement getContinueNxtpage() {
		return continueNxtpage;
	}
	
	
}
