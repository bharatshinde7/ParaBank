package com.paraBank.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By userName = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By loginButton = By.xpath("//input[@value='Log In']");
	By forgotLogInInfo = By.xpath("//*[@id=\"loginPanel\"]/p[1]/a");
	By register = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
	
	public WebElement getUserName() {
		return driver.findElement(userName);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getSubmitAction() {
		return driver.findElement(loginButton);
	}
	
	public WebElement getForgotLogInInfo() {
		return driver.findElement(forgotLogInInfo);
	}
	
	public WebElement getRegister() {
		return driver.findElement(register);
	}
}
