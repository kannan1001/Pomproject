package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.library;
import com.pages.Facebooklogin;
import com.pages.Facebookregister;

public class registertestcase extends library{

	@BeforeClass
	public void startUp() {
		launchApplication("chrome","https://facebook.com");
	}
	@Test
	public void register()
	{
		Facebookregister fbreg=new Facebookregister(driver);
		fbreg.firstname("keerthi");
		fbreg.lasttname("bala");
		fbreg.emailorNum("keerthi1233@gmail.com");
		fbreg.newPassword("4rhf!");
		fbreg.birthday("Jan", 19, 1987);
		fbreg.selectsex("Male");
		fbreg.clickonsignup();
		
	}
	@AfterClass
	public void close() throws IOException {
		screenshot("src//test//resources//screenshot//fb1.png");
		quit();
	}
}
