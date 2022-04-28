package org.task;

import org.locator.AdactinLogin;
import org.locator.BookAHotel;
import org.locator.HotelSearch;
import org.locator.SelectHotel;
import org.openqa.selenium.WebElement;

public class Adactinmain extends AdactinHotel {

	public static void main(String[] args) {
		Adactinmain a = new Adactinmain();
		a.getDriver();
		a.lauchURL("http://adactinhotelapp.com/");

		// Logiin
		AdactinLogin login = new AdactinLogin();
		WebElement txtUserName = login.getTxtUserName();
		a.enterText(txtUserName, "Esraozan");
		WebElement txtPassword = login.getTxtPassword();
		a.enterText(txtPassword, "kiolkiol@0607");
		WebElement btnLogin = login.getBtnLogin();
		a.btnClick(btnLogin);

		// Search Hotel
		HotelSearch search = new HotelSearch();
		WebElement selectLocation = search.getSelectLocation();
		a.dropDown(selectLocation, "London");
		WebElement selectHotels = search.getSelectHotels();
		a.dropDown(selectHotels, "Hotel Sunshine");
		WebElement roomType = search.getRoomType();
		a.dropDown(roomType, "Deluxe");
		WebElement roomNos = search.getRoomNos();
		a.dropDown(roomNos, "2 - Two");
		WebElement dataIn = search.getDataIn();
		a.enterText(dataIn, "30/04/2022");
		WebElement dataOut = search.getDataOut();
		a.enterText(dataOut, "30/04/2022");
		WebElement adultRoom = search.getAdultRoom();
		a.dropDown(adultRoom, "1 - One");
		WebElement childRoom = search.getChildRoom();
		a.dropDown(childRoom, "1 - One");
		WebElement btnSubmit = search.getBtnSubmit();
		a.btnClick(btnSubmit);

		// Select Hotel
		SelectHotel select = new SelectHotel();
		WebElement selectRadiobtn = select.getSelectRadiobtn();
		a.btnClick(selectRadiobtn);
		WebElement continueNxtpage = select.getContinueNxtpage();
		a.btnClick(continueNxtpage);

		// Book A Hotel
		BookAHotel bh = new BookAHotel();
		WebElement txtFirstName = bh.getTxtFirstName();
		a.enterText(txtFirstName, "Esra");
		WebElement txtLastName = bh.getTxtLastName();
		a.enterText(txtLastName, "Ozan");
		WebElement txtAddress = bh.getTxtAddress();
		a.enterText(txtAddress, "2 Churchill Pl, London E14 5RB, United Kingdom");
		WebElement txtCreditCardNo = bh.getTxtCreditCardNo();
		a.enterText(txtCreditCardNo, "6789054326789087");
		WebElement dropCreditCardType = bh.getDropCreditCardType();
		a.dropDown(dropCreditCardType, "VISA");
		WebElement dropCCMonth = bh.getDropCCMonth();
		a.dropDown(dropCCMonth, "March");
		WebElement dropCCYear = bh.getDropCCYear();
		a.dropDown(dropCCYear, "2022");
		WebElement txtCVNo = bh.getTxtCVNo();
		a.enterText(txtCVNo, "091");
		WebElement btnBookNow = bh.getBtnBookNow();
		a.btnClick(btnBookNow);
		
		
		
		
		
		
		
		
		

	}
}
