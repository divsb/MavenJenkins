package com.Intelli.Jenkins.Jenkins;



import org.testng.annotations.Test;

import com.Inteli.Jenkins.testUtils.Helper;

import org.openqa.selenium.By;


public class DeleteEmployee extends Helper{
  @Test
  public void empDeleted() throws InterruptedException {
	  login();
	  Thread.sleep(5000);
	  driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("Sri");
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.name("chkSelectRow[]")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
		
//		List<WebElement> tableRows = driver.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
//		System.out.println("Number of Rows in the table:"+tableRows.size());
//		for (int i = 0; i < tableRows.size(); i++) {
//			if (tableRows.get(i).findElements(By.tagName("td")).get(2).getText().equalsIgnoreCase("Sri") && tableRows.get(i).findElements(By.tagName("td")).get(3).getText().equalsIgnoreCase("Divs")) {
//				tableRows.get(i).findElements(By.tagName("td")).get(0).click();
//				driver.findElement(By.id("btnDelete")).click();
//				driver.findElement(By.id("dialogDeleteBtn")).click();
//				if (driver.findElement(By.cssSelector("div.message.success.fadable")).getText().contains("Successfully Deleted")) {
//					System.out.println("Selected employee deleted message displayed");
//				} else {
//					System.err.println("No message displayed after delete");
//				}
//				break;
			}

			
		
		
		
  
}

