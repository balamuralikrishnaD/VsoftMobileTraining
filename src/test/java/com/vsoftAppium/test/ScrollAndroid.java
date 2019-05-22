package com.vsoftAppium.test;

import java.time.Duration;

import org.testng.annotations.Test;

import com.vsoftAppium.training.TestBase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class ScrollAndroid extends TestBase {

	@Test
	public void scrollUISelector() {

		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Views\"))"));

		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Views']")).click();

	}

}
