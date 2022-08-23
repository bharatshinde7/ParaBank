package com.paraBank.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\ParaBankAssignment\\src\\main\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", "D:\\Drivers\\firefoxbrowse\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Drivers\\edgedriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}

	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;

	}
}
