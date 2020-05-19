package com.seleniumutils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.library;

public class selutils extends library {
	WebDriver driver;
	public selutils(WebDriver driver) {
		
		this.driver=driver;
	}
	public void to_take_screenshot(String path) {
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    
		try 
		{
			FileUtils.copyFile(source, new File(path));
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	public void getTitle() {
		String title=driver.getTitle();
		System.out.println(driver.getTitle());
		//Assert.assertEquals(title, "Expected");
		
	}
	public void Explicitwait(String locator1) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(locator1))));
	}

}
