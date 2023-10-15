package com.junitTest.TestSelenium;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openga.selenium.WebDriver;
import org.openga.selenium.WebElement;
import org.openga.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }
  
  private org.openqa.selenium.WebDriver driver;
  
  @Test
  public void f() {
	  org.openqa.selenium.WebElement cuadroBusqueda = driver.findElement(By.name("q"));
	  
	  	cuadroBusqueda.sendKeys("pagina principal .....");
	  	cuadroBusqueda.click();
	  	
	  	cuadroBusqueda.submit();
	  	
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	
	  	assertEquals("pagina principal.....- Google search", driver.getTitle());
  }

}
