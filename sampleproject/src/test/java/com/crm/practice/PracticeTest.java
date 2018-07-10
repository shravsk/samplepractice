package com.crm.practice;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.genericLib.BaseClass;
import com.crm.objectRepository.BrandsPage;
import com.crm.objectRepository.HomePage;

public class PracticeTest extends BaseClass {

	@Test
	public void practiceTest()
	{
		HomePage hp=new HomePage(d);
		hp.navigateToBrandsPage();
		BrandsPage bp=new BrandsPage(d);
		bp.navigateToDiscountPage();
	}
}
