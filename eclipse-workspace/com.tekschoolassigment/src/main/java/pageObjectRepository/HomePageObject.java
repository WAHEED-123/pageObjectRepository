package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=logo]/h1/a")
	private WebElement textToValildate;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement userNameFiled;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButtonMain;
	
	public void validateHomePage() {
		String text = textToValildate.getText();
		if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified!");
		}else {
			logger.info("Text does not match!");
		}
	}
	public void clickOnMyAccountButton() {
		myAccountButton.click();
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public void enterUserName() {
		userNameFiled.sendKeys("karim.man@gmail.com");
	}
	public void enterPassword() {
		passwordField.sendKeys("Karimjan22133");
	}
	//The below two methods are for Exmaple keyword practice
	public void enterUserNameWithParam(String username) {
		userNameFiled.sendKeys(username);
	}
	public void enterPasswordWithParam(String password) {
		passwordField.sendKeys(password);
	}
	public void clickOnLoginButtonMain() {
		loginButtonMain.click();
	}

}
