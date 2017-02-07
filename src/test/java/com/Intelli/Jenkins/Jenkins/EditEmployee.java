package com.Intelli.Jenkins.Jenkins;


import org.testng.annotations.Test;

import com.Inteli.Jenkins.testUtils.Helper;

import org.openqa.selenium.By;


public class EditEmployee extends Helper{
  @Test
  public void empChanged() throws InterruptedException{
	  login();
	  Thread.sleep(3000);
	  driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("0011")).click();
		driver.findElement(By.id("btnSave")).click();
		
   driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Teju");
		driver.findElement(By.id("btnSave")).click();
  }
}
