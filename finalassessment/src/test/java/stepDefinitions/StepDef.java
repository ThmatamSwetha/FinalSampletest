package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateArticle;
import pages.DeleteArticle;
import pages.EditArticle;
import pages.LoginPage;

public class StepDef {
	
	WebDriver driver=TestBase.getDriver();
	
	LoginPage loginPage;
	DeleteArticle deleteArticle;
	EditArticle editArticle;
	CreateArticle createArticle;
	
	public StepDef() {
		
		loginPage=new LoginPage(driver);
		createArticle=new CreateArticle(driver);
		editArticle=new EditArticle(driver);
		deleteArticle=new DeleteArticle(driver);
		
		
		
	}
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/login");
			
		
	}
	@When("user Provide {string} and {string}")
	public void user_provide_and(String struser, String strpwd) {
		loginPage.loginintoapp(struser, strpwd);
	    
	}
	@Then("user should be on home page")
	public void user_should_be_on_home_page() {
	 Assert.assertTrue( loginPage.titledispalyed());
	}

@Given("User should be on  new article page")
public void user_should_be_on_new_article_page() {
	createArticle.clickonarticle();
   
}
@When("User enter article details")
public void user_enter_article_details(DataTable dataTable) {
	List<List<String>> data=dataTable.asLists();
	String string=data.get(1).get(0);
	String string2=data.get(1).get(1);
	String string3=data.get(1).get(2);
	String string4=data.get(1).get(3);
	
	createArticle.publishArticle(string, string2, string3, string4);
	createArticle.clickOn();
   
}
@Then("error message should be displayed")
public void error_message_should_be_displayed() {
   Assert.assertTrue(createArticle.errorisDispalyed());
}
@Then("Article details page must be displayed")
public void article_details_page_must_be_displayed() {
	Assert.assertTrue(editArticle.pagedisplayed());
   
}
@When("user update article detail")
public void user_update_article_detail() {
	editArticle.edit();
  
}
@Then("Article detail mustbe updated")
public void article_detail_mustbe_updated() {
	Assert.assertTrue(editArticle.pagedisplayed());
}
@When("User delete article")
public void user_delete_article() {
	deleteArticle.deleteArt();
   
}
@Then("Article must be deleted")
public void article_must_be_deleted() {
	Assert.assertTrue( loginPage.titledispalyed());
}

}
