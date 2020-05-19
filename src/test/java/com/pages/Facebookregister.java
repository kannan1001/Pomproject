package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookregister {
	protected WebDriver driver;
	By Firstname=By.name("firstname");
	By Lastname=By.name("lastname");
	By emailorMobNum=By.name("reg_email__");
	By newpassword=By.name("reg_passwd__");
	By month=By.id("month");
	By day=By.id("day");
	By year=By.id("year");
	public Facebookregister(WebDriver driver) {
		this.driver=driver;
	}
	
	public void firstname(String fname) {
		driver.findElement(Firstname).sendKeys(fname);
		
	}
	public void lasttname(String lname) {
		driver.findElement(Lastname).sendKeys(lname);
	}
	public void emailorNum(String emailornum) {
		driver.findElement( emailorMobNum).sendKeys(emailornum);
	}
	public void newPassword(String pwd) {
		driver.findElement(newpassword).sendKeys(pwd);
	}
	
	public void birthday(String month1,int day,int year) {
		 Select m = new Select(driver.findElement(By.id("month")));
	      m.selectByVisibleText("Jan");
	      
	    //selectByIndex
	      Select d = new Select(driver.findElement(By.id("day")));
	      d.selectByIndex(12);
	      
	      //selectByValue
	      Select y= new Select(driver.findElement(By.id("year")));
	      y.selectByValue("1990");
	   }
	public void selectsex(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			driver.findElement(By.id("u_0_7")).click();
		}
		else if(gender.equalsIgnoreCase("female")) {
			driver.findElement(By.id("u_0_6")).click();
		}
		else if (gender.equalsIgnoreCase(" ")) {
			driver.findElement(By.id("u_0_8")).click();
		}
		
	}
	public void clickonsignup() {
		driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
	}
}