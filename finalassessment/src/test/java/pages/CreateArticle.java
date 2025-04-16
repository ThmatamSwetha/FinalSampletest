package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateArticle {
	@FindBy(xpath="//a[@href='#/editor']") WebElement newArticle;
	@FindBy(xpath="//input[@name='title']") WebElement title1;
	@FindBy(xpath="//input[@name='description']") WebElement descp;
	@FindBy(xpath="//textarea[@name='body']") WebElement body;
	@FindBy(xpath="//input[@name='tags']")WebElement tag;
	@FindBy(xpath="//button[text()='Publish Article']") WebElement submitbtn;
	@FindBy(xpath="/html/body/div/main/div/div/div/div/form/fieldset/span")WebElement error;
	public CreateArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickonarticle() {
		newArticle.click();
	}
	public void publishArticle(String strtitle,String desp,String strBody,String strtag) {
		
		title1.sendKeys(strtitle);
		descp.sendKeys(desp);
		body.sendKeys(strBody);
		tag.sendKeys(strtag);
		
	}
	public void clickOn() {
		submitbtn.click();
	}
	public boolean errorisDispalyed() {
		return error.isDisplayed();
	}

}
