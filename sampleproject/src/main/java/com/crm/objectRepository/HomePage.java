package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//a[text()='CRAFTSVILLA BRANDS']")
	WebElement Brands;
	
	
	public HomePage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void navigateToBrandsPage()
	{
		Brands.click();
	}
}
