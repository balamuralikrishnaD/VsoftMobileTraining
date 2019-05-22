package com.vsoftAppium.training;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestBase {
	
	
	public static AppiumDriver<MobileElement> driver;
	
	public DesiredCapabilities cap = new DesiredCapabilities();
	
	@BeforeTest
	public void launchapplication() throws MalformedURLException {
		cap.setCapability("automationName", "uiautomator2");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability("platformName", "android");
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("appPackage", "com.example.android.apis");
		cap.setCapability("appActivity", "com.example.android.apis.ApiDemos");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	}

}
