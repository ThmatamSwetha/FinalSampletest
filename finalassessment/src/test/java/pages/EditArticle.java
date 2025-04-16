package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditArticle {
	@FindBy(css="div.banner") WebElement page;
	@FindBy(xpath="/html/body/div/main/div/div[1]/div/div/button[2]/a") WebElement editart;
@FindBy(xpath="//button[text()='Update Article']") WebElement updatebtn;

public EditArticle(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public boolean pagedisplayed() {
	return page.isDisplayed();
}
public void edit() {
	editart.click();
	updatebtn.click();
}}