package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addtariff {
	static WebDriver Driver;
	@Given("The user is in telecom home page")
	public void the_user_is_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver","E:\\ProjectWorkspace\\cucumber22\\driver\\chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get("http://demo.guru99.com/telecom/");
		Driver.manage().window().maximize();
	}

	@Given("The user click on add tariffplan")
	public void the_user_click_on_add_tariffplan() {
		Driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("The user is filling all the tariff details {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_is_filling_all_the_tariff_details(String monthrent, String freeloc, String freeintt, String smspack, String locchge, String intepermin, String smsper) {
		Driver.findElement(By.xpath("//input[@name='rental']")).sendKeys(monthrent);
		Driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys(freeloc);
		Driver.findElement(By.xpath("//input[@name='inter_minutes']")).sendKeys(freeintt);
		Driver.findElement(By.xpath("//input[@name='sms_pack']")).sendKeys(smspack);
		Driver.findElement(By.xpath("//input[@name='minutes_charges']")).sendKeys(locchge);
		Driver.findElement(By.xpath("//input[@name='inter_charges']")).sendKeys(intepermin);
		Driver.findElement(By.xpath("//input[@name='sms_charges']")).sendKeys(smsper);
	}

	@When("The user click on tariff submit button")
	public void the_user_click_on_tariff_submit_button() {
		Driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("The user should be displayed congratulation you add Tariff Plan")
	public void the_user_should_be_displayed_congratulation_you_add_Tariff_Plan() {
		 Assert.assertTrue(Driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}

}
