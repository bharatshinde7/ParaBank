package com.paraBank.testCases.pages;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.paraBank.base.base;
import com.paraBank.pageObject.LandingPage;
import com.paraBank.pageObject.LoginPage;
import com.paraBank.pageObject.RegisterPage;

public class HomePage extends base {

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(HomePage.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void basePageNaviagation() throws IOException, InterruptedException

	{
		driver.get(prop.getProperty("url"));
		log.info("Driver initialization done");

		log.info("Click on Register button on login page");
		LoginPage login = new LoginPage(driver);
		login.getRegister().click();

		LandingPage landingPage = new LandingPage(driver);

		log.info("Start the registration for user.....");
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.getFirstName().sendKeys(prop.getProperty("firstName"));
		registerPage.getLastName().sendKeys(prop.getProperty("lastName"));
		registerPage.getAddress().sendKeys(prop.getProperty("address"));
		registerPage.getCity().sendKeys(prop.getProperty("city"));
		registerPage.getState().sendKeys(prop.getProperty("state"));
		registerPage.getZipCode().sendKeys(prop.getProperty("zipCode"));
		registerPage.getPhoneNumber().sendKeys(prop.getProperty("phoneNumber"));
		registerPage.getSSN().sendKeys(prop.getProperty("ssn"));
		registerPage.getUserName().sendKeys(prop.getProperty("userName"));
		registerPage.getPassword().sendKeys(prop.getProperty("password"));
		registerPage.getConfirmPassword().sendKeys(prop.getProperty("confirmpassword"));
		registerPage.getRegisterButton().click();
		log.info("User registration is completed.....");

		landingPage.getlogOut().click();

		log.info("User login process start.....");
		login.getUserName().sendKeys(prop.getProperty("userName"));
		login.getPassword().sendKeys(prop.getProperty("password"));
		login.getSubmitAction().click();
		log.info("User login process end.....");

		log.info("Start Account Processing.....");
		Thread.sleep(2000);
		landingPage.getOpenNewAccount().click();
		landingPage.getAccountsOverview().click();
		log.info("End Account Processing.....");

		log.info("Logout user process start.....");
		landingPage.getlogOut().click();
		log.info("Logout user process end.....");
	}

	// @AfterTest
	public void teardown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
