package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonePDAsPageObject extends Base {
public PhonePDAsPageObject() {
		
		PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[@id=logo]/h1/a = 'Homepage']")
private WebElement textToValildate;
@FindBy(xpath = "//*[@id=menu]/div[2]/ul/li[6]/a='PhonePDAsPage']")
private WebElement PhonePDAsPageButton;

}
