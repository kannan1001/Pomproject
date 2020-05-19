package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.library;
import com.pages.Orangehrmlogin;

public class orangehrmloginadmintestcase extends library
{
	@BeforeClass
	public void startUp() throws InterruptedException {
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
		Orangehrmlogin ologin=new Orangehrmlogin(driver);
		Thread.sleep(3000);
		ologin.loginToOrangeHrm_username("Admin");
		ologin.loginToOrangeHrm_password("admin123");
		ologin.loginToApp_Loginbutton();
	}
	
	@Test
	public void admintab() {
		Orangehrmlogin ologin1=new Orangehrmlogin(driver);
		ologin1.clickonAdmin();
		ologin1.clickonAdmin();
		ologin1.Adminpage_username("George");
		ologin1.Adminpage_adminuserrole("ESS");
		ologin1.Adminpage_adminempname("Hamilton");
		ologin1.Adminpage_adminstatus("Enabled");
		ologin1.Adminpage_searchbutton();
	}
	@AfterClass
	public void close() throws IOException {
		screenshot("src//test//resources//screenshot//orangelogin1.png");
		quit();
	}
	


}
