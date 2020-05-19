package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.library;
import com.pages.Facebooklogin;

public class logintestcase extends library {
	@BeforeClass
	public void startUp() {
		launchApplication("chrome","https://facebook.com");
	}
	@Test
	public void login()
	{
		Facebooklogin lpage=new Facebooklogin(driver);
		lpage.loginToApp_username("gjh@gmail.com");
		lpage.loginToApp_password("hdgh");
		lpage.loginToApp_Loginbutton();
		
	}
	@AfterClass
	public void close() throws IOException {
		screenshot("src//test//resources//screenshot//fb.png");
		quit();
	}

}
