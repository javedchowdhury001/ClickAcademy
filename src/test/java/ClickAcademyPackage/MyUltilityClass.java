package ClickAcademyPackage;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MyUltilityClass {
 
 WebDriver driver;

 @BeforeTest
  public void beforeTest() {
  WebDriverManager.chromedriver().setup();
  driver=new ChromeDriver();  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
