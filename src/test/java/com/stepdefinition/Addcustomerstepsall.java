package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Addcustomerstepsall {
	static WebDriver Driver;
@Given("The user is in telecom page")
public void the_user_is_in_telecom_page() {
	System.setProperty("webdriver.chrome.driver","E:\\ProjectWorkspace\\cucumber22\\driver\\chromedriver.exe");
	Driver=new ChromeDriver();
	Driver.get("http://demo.guru99.com/telecom/");
	Driver.manage().window().maximize();
}

@Given("The user click on add Customer")
public void the_user_click_on_add_Customer() throws Throwable {
	Driver.findElement(By.xpath("//a[text()='Add Customer'][1]")).click();
	   Thread.sleep(3000);
}

@When("The user filling all details")
public void the_user_filling_all_details(DataTable datalist) {
	List<String> customerdetailsList = datalist.asList(String.class);
	   //System.out.println(customerdetailsList);
		Driver.findElement(By.xpath("//label[@for='done']")).click();
		 Driver.findElement(By.id("fname")).sendKeys(customerdetailsList.get(0));
		   Driver.findElement(By.id("lname")).sendKeys(customerdetailsList.get(1));
		   Driver.findElement(By.id("email")).sendKeys(customerdetailsList.get(2));
		   Driver.findElement(By.name("addr")).sendKeys(customerdetailsList.get(3));
		   Driver.findElement(By.name("telephoneno")).sendKeys(customerdetailsList.get(4));
}
@When("The user filling all details with manual")
public void the_user_filling_all_details_with_manual(DataTable datamap) {
 Map<String,String>customerdetailsmap=datamap.asMap(String.class, String.class);   
 Driver.findElement(By.xpath("//label[@for='done']")).click();
 Driver.findElement(By.id("fname")).sendKeys(customerdetailsmap.get("fname"));
   Driver.findElement(By.id("lname")).sendKeys(customerdetailsmap.get("lname"));
   Driver.findElement(By.id("email")).sendKeys(customerdetailsmap.get("email"));
   Driver.findElement(By.name("addr")).sendKeys(customerdetailsmap.get("address"));
   Driver.findElement(By.name("telephoneno")).sendKeys(customerdetailsmap.get("phone"));
}


@When("The user click on submit button")
public void the_user_click_on_submit_button() {
	Driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Then("The user should be displayed id")
public void the_user_should_be_displayed_id() {
	 Assert.assertTrue(Driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
}

}
