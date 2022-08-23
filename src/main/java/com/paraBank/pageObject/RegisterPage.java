package com.paraBank.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	public WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	By firstName = By.xpath("//input[@id=\"customer.firstName\"]");
	By lastName = By.xpath("//input[@id=\"customer.lastName\"]");
	By address = By.xpath("//input[@id=\"customer.address.street\"]");
	By city = By.xpath("//input[@id=\"customer.address.city\"]");
	By state = By.xpath("//input[@id=\"customer.address.state\"]");
	By zipCode = By.xpath("//input[@id=\"customer.address.zipCode\"]");
	By phoneNumber = By.xpath("//input[@id=\"customer.phoneNumber\"]");
	By ssn = By.xpath("//input[@id=\"customer.ssn\"]");
	By userName = By.xpath("//input[@id=\"customer.username\"]");
	By password = By.xpath("//input[@id=\"customer.password\"]");
	By confirm = By.xpath("//input[@id=\"repeatedPassword\"]");
	By register = By.xpath("//input[@value='Register']");

	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}

	public WebElement getLastName() {
		return driver.findElement(lastName);
	}

	public WebElement getAddress() {
		return driver.findElement(address);
	}

	public WebElement getCity() {
		return driver.findElement(city);
	}

	public WebElement getState() {
		return driver.findElement(state);
	}

	public WebElement getZipCode() {
		return driver.findElement(zipCode);
	}

	public WebElement getPhoneNumber() {
		return driver.findElement(phoneNumber);
	}

	public WebElement getSSN() {
		return driver.findElement(ssn);
	}

	public WebElement getUserName() {
		return driver.findElement(userName);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getConfirmPassword() {
		return driver.findElement(confirm);
	}

	public WebElement getRegisterButton() {
		return driver.findElement(register);
	}
}
