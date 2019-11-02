package ClickAcademyPackage;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class CallerClass extends MyUltilityClass {
	
	
	
	@Test(enabled=true)
  public void TestCase1() {
		openbrowser();
		ClickRadioButton();
		SelectCountry();
	}	
		
    @Test(enabled=true)
 public void TestCase2() {
        openbrowser();
    	ClickOpenWindow();
        OpenTab();
        
        
    }
		
    @Test(enabled=true)
public void TestCase3() {	
    	openbrowser();
    	SelectDropDown();
    	ClickOption1();
    	inputNmae();
    	
  }
 
    
    
    
    //AllMethod are here
    
    boolean result;	
    public void openbrowser() {
    	driver.get("http://www.qaclickacademy.com/practice.php");
    	
   
    }
	
   public void ClickRadioButton() {
	   System.out.println("Click Radio1");
		WebElement radio=driver.findElement(By.xpath("//input[@value='radio1']"));
		
		result=radio.isDisplayed();
		
		if(result==true) {
			
			radio.click();
			System.out.println(" Radio1 is Click");
			}else {
				System.out.println("Radio1 isn't Click");
				
			}
   }
	
   public void SelectCountry() {
	   System.out.println("Select Country");
		WebElement radio=driver.findElement(By.xpath("//input[@type='text']"));
		
		result=radio.isDisplayed();
		
		if(result==true) {
	
			radio.sendKeys("Bangladesh");
			System.out.println(" select country");
			}else {
				System.out.println("country isn't select");
				
			}
}
   
   public void ClickOpenWindow() {
	   System.out.println("Click Open Window");
		WebElement radio=driver.findElement(By.xpath("//button[@id='openwindow']"));
		radio.isDisplayed();
		radio.click();		
}
   public void OpenTab() {
	   System.out.println("Click Open tap");
		WebElement radio=driver.findElement(By.xpath("//a[@id='opentab']"));
		radio.isDisplayed();
		radio.click();		
   
   }
   
   
   public void SelectDropDown()  {
		System.out.println("Select DropDown");
		Select day = new Select(driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]")));	
		day.selectByIndex(2);
		
	}
   public void ClickOption1() {
		 WebElement obj=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		 obj.isDisplayed();
		 obj.click();
		
		}
	  
   
   public void inputNmae() {
	   System.out.println("Input Name");
		WebElement radio=driver.findElement(By.xpath("//input[@id='name']"));
		
		result=radio.isDisplayed();
		
		if(result==true) {
			
			radio.sendKeys("javed");
			System.out.println(" Input Name");
			}else {
				System.out.println(" didn't input Name");
				
			}
}
   
  
   
   public void CloseBrowser() throws InterruptedException {
   	Thread.sleep(2000);
   	driver.close();
   }
 
  }


