package com.admindemo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	private WebDriver driver;
	
	@FindBy (xpath="//input[@name='Email']")
	WebElement emailf;
	
	@FindBy (xpath="//input[@id='Password']")
	WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement loginbutton;
	
	public AdminPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
