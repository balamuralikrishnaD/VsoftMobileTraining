package com.vsoftAppium.test;

import java.time.Duration;

import org.testng.annotations.Test;

import com.vsoftAppium.training.TestBase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class TouchActions extends TestBase {
	@Test
	public void scrollUISelector() {
		boolean status = false;
		int counter = 1;

		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Views\"))"));

		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Views']")).click();

		while (!status && counter < 8) {
			try {
				driver.findElement(MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Tabs\"))"));
				status = true;
			} catch (Exception e) {
				counter++;
			}

			driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Tabs']")).click();

			driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='5. Scrollable']")).click();

			MobileElement from = driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='TAB 4']"));
			MobileElement to = driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='TAB 1']"));

			TouchAction tc = new TouchAction(driver);
			tc.press(ElementOption.element(from)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
					.moveTo(ElementOption.element(to)).release().perform();

		}
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='TAB 8']")).click();

	}
}
