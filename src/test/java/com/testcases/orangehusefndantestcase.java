package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.library;
import com.pages.Orangehusingfindann;
import com.seleniumutils.selutils;

public class orangehusefndantestcase extends library{
	selutils utils;
	@BeforeClass
	public void startUp() {
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void loginpage() {
		Orangehusingfindann hrm = new Orangehusingfindann(driver);
		hrm.login("Admin", "admin123");
	}
	
	@AfterClass
	public void close() throws IOException {
		utils= new selutils(driver);
		utils.getTitle();
		utils.to_take_screenshot("src/test/resources/screenshot/orange2.png");
		
		quit();
	}

}
