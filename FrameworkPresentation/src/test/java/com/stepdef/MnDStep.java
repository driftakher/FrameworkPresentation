package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.common.Base;
import com.page.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MnDStep extends Base{
	
	HomePage HP;
	
	@Given("^I can access the eBay page$")
	public void i_can_access_the_eBay_page() throws Throwable {
		driver=geteBay();
		HP = new HomePage(driver);
		//HP = PageFactory.initElements(driver, HomePage.class);
	}

	@When("^I click on sign in$")
	public void i_click_on_sign_in() throws Throwable {
		HP.get_SignIn().click();

	}

	@When("^I gave valid id$")
	public void i_gave_valid_id() throws Throwable {
		HP.get_id_text().sendKeys("crazy_cat_bd@hotmail.com");

	}

	@When("^I gave valid password$")
	public void i_gave_valid_password() throws Throwable {
		HP.get_pass_text().sendKeys("Born@1990");

	}

	@When("^I click on Sign In Button$")
	public void i_click_on_Sign_In_Button() throws Throwable {
		HP.get_Sign_button().submit();

	}

	@When("^I mousehover to electronics to camera & photo$")
	public void i_mousehover_to_electronics_to_camera_photo() throws Throwable {
		Actions ac = new Actions (driver);
		ac.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[2]"))).perform();
		ac.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Cameras & Photo')]"))).click().build().perform();
		//ac.moveToElement(driver.findElement(By.xpath("//div[@id='slider']")), 50, 0).perform();
		}

	@Then("^I can access camera & photo page$")
	public void i_can_access_camera_photo_page() throws Throwable {
		String ext = "Cameras & Photo for sale | eBay";
		String act = driver.getTitle();
		if(ext.equals(act)) {
			System.out.println(ext + " MouseHover is perfect");
		}
		else {
			System.out.println(ext+ " MouseHover is wrong");
		}
		driver.quit();

	}

	@When("^I click on dropdown manu SHOP BY CATEGORY$")
	public void i_click_on_dropdown_manu_SHOP_BY_CATEGORY() throws Throwable {
		Select se = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
		se.selectByVisibleText("Computers/Tablets & Networking");
		WebElement CnT = se.getFirstSelectedOption();
		System.out.println(CnT);
	
	}

	@When("^I click on Computer & Tablets$")
	public void i_click_on_Computer_Tablets() throws Throwable {
		driver.findElement(By.xpath("//input[@id='gh-btn']")).submit();

	}

	@Then("^I can access Computer & Tablets page$")
	public void i_can_access_Computer_Tablets_page() throws Throwable {
		String ddext = "Computers, Tablets & Network Hardware for sale | eBay";
		String ddact =driver.getTitle();
		if (ddext.equals(ddact)) {
			System.out.println(ddext + " dropdown is perfect");
		}
		else {
			System.out.println(ddext + " dropdown is wrong");
		}
		driver.quit();
	}


}
