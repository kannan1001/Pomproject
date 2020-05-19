package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Orangehrmlogin {
	protected WebDriver driver;
	
	Select menu;
	By username=By.id("txtUsername");
	By password=By.id("txtPassword");
	By loginbutton=By.name("Submit");
	By admin=By.id("menu_admin_viewAdminModule");
	By adminusername=By.id("searchSystemUser_userName");
	By adminuserrole=By.id("searchSystemUser_userType");
	By adminempname=By.id("searchSystemUser_employeeName_empName");
	By adminstatus=By.id("searchSystemUser_status");
	By adminsearchbutton=By.id("searchBtn");
	public Orangehrmlogin(WebDriver driver) {
		this.driver=driver;
	}
	public void loginToOrangeHrm_username(String userid)
	{
		driver.findElement(username).sendKeys(userid);
	}
	public void loginToOrangeHrm_password(String passwd)
	{
		driver.findElement(password).sendKeys(passwd);
	}
	public void loginToApp_Loginbutton()
	{
		driver.findElement(loginbutton).click();
	}
	public void clickonAdmin() {
		driver.findElement(admin).click();
	}
	public void Adminpage_username(String username)
	{
		driver.findElement(adminusername).sendKeys(username);
	}
	
	public void Adminpage_adminuserrole(String role)
	{
		menu= new Select(driver.findElement(adminuserrole));
		menu.selectByVisibleText(role);
	}
	public void Adminpage_adminempname(String empname)
	{
		driver.findElement(adminempname).sendKeys(empname);
	}
	public void Adminpage_adminstatus(String status)
	{
		menu= new Select(driver.findElement(adminstatus));
		menu.selectByVisibleText(status);
	}
	public void Adminpage_searchbutton()
	{
		driver.findElement(adminsearchbutton).click();
	}
	

}
