package com.paraBank.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By openNewAccount = By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a");

	By accountsOverview = By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");

	By logOut = By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getOpenNewAccount() {
		return driver.findElement(openNewAccount);
	}

	public WebElement getAccountsOverview() {
		return driver.findElement(accountsOverview);
	}

	public WebElement getlogOut() {
		return driver.findElement(logOut);
	}

}
