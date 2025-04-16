package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//@FindBy(xpath="/html/body/div/header/nav/div/ul[2]/li[2]/a") WebElement loginbtn;
	@FindBy(name="email") WebElement emailname;
	@FindBy(name="password") WebElement pwd;
	@FindBy(xpath="//button[text()='Login']") WebElement login;
	@FindBy(xpath="//a[text()='conduit']") WebElement title;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void loginintoapp(String email,String pwd1) {
		//loginbtn.click();
		emailname.sendKeys(email);
		pwd.sendKeys(pwd1);
		login.click();
		
	}
	public boolean titledispalyed() {
		return title.isDisplayed();	}
	

}
