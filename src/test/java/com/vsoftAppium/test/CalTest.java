package com.vsoftAppium.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vsoftAppium.training.TestBase;

public class CalTest extends TestBase{
	
	@Test
	public void calcTest() {
		
		
		//Addition
		driver.findElement(By.xpath("//android.widget.Button[@text='8']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='5']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();
		System.out.println("Result of addition "+driver.findElement(By.id("com.android.calculator2:id/result")).getText());
	}
	
	
	

}
