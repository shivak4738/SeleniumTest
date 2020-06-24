package test.menlo.tech;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.menlo.tech.test.base.AbstractMenloQuisitiveSeleniumTest;

import test.menlo.tech.ui.po.MenloQusitiveHomePageObject;


public class MenloQuisitiveTest extends AbstractMenloQuisitiveSeleniumTest{

	MenloQusitiveHomePageObject homePage;

	@Test(priority=1)
	public void testIsTextPresent() {

		final String menloURL = env.getRequiredProperty("menloURL");
		driver.get(menloURL);
		driver.manage().window().maximize();

		homePage = PageFactory.initElements(driver,
				MenloQusitiveHomePageObject.class);

		Boolean isTextPresent = homePage.isTextPresent();

		assertTrue(isTextPresent, "isTextPresent is not present");
	}

	@Test(priority=2)
	public void testIsSolutionsDropDownPresent() {

		Boolean isSolutionsTextPresent = homePage.isSolutionsDropdownExists();

		assertTrue(isSolutionsTextPresent, "isSolutionsTextPresent is not present");
	}

	@Test(priority=3)
	public void testIsIndustriesDropDownPresent() {

		Boolean isIndustriesTextPresent = homePage.isIndustriesDropdownExists();

		assertTrue(isIndustriesTextPresent, "isIndustriesTextPresent is not present");
	}

	@Test(priority=4)
	public void testIsCompanyDropDownPresent() {

		Boolean isCompanyTextPresent = homePage.isCompanyDropdownExists();

		assertTrue(isCompanyTextPresent, "isCompanyTextPresent is not present");
	}
	

}
