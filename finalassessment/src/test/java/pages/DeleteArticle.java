package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DeleteArticle {
	WebDriver driver;
@FindBy(xpath="//button[@class='btn btn-sm'][1]") WebElement deletbtn;




public DeleteArticle(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void deleteArt() {
	deletbtn.click();
	TestBase.alertTest();
}
}

