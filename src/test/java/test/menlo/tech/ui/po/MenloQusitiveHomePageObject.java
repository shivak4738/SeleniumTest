package test.menlo.tech.ui.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenloQusitiveHomePageObject {

	private WebDriver driver;


	@FindBy(xpath="//*[@id=\"menu-item-12243\"]/a")
	private WebElement solutionsDropdownElement;

	@FindBy(xpath="//*[@id=\"menu-item-1296\"]/a")
	private WebElement industriesDropdownElement;
	
	@FindBy(xpath="//*[@id=\"menu-item-677\"]/a")
	private WebElement companyDropdownElement;

	@FindBy(xpath="//*[@id=\"et-boc\"]/div/div/div[1]/div/div/div[1]/div/p/span")
	private WebElement textElement;

	public Boolean isTextPresent() {

		return !textElement.getText().isEmpty();
	}

	public Boolean isSolutionsDropdownExists() {

		return !solutionsDropdownElement.getText().isEmpty();
	}

	public Boolean isIndustriesDropdownExists() {

		return !solutionsDropdownElement.getText().isEmpty();
	}

	public Boolean isCompanyDropdownExists() {
		
		return !companyDropdownElement.getText().isEmpty();
	}

}
