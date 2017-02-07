package com.Intelli.Jenkins.Jenkins;


import org.testng.annotations.Test;

import com.Inteli.Jenkins.testUtils.Helper;

import org.openqa.selenium.By;

public class AddEmployee extends Helper{
  @Test
  public void empAdded() throws InterruptedException {
	  login();
	  Thread.sleep(5000);
	  driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Dhir");
		driver.findElement(By.id("lastName")).sendKeys("Ambani");
		driver.findElement(By.id("btnSave")).click();
		
		
	  
	  }
}
