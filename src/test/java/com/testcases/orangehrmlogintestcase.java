package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.library;
import com.pages.Facebooklogin;
import com.pages.Orangehrmlogin;

public class orangehrmlogintestcase extends library {
	@BeforeClass
	public void startUp() {
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void login()
	{
		Orangehrmlogin ologin=new Orangehrmlogin(driver);
		ologin.loginToOrangeHrm_username("Admin");
		ologin.loginToOrangeHrm_password("admin123");
		ologin.loginToApp_Loginbutton();
		
	}
	@AfterClass
	public void close() throws IOException {
		screenshot("src//test//resources//screenshot//orangelogin.png");
		quit();
	}
	

}
