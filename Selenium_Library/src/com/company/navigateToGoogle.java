package com.company;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateToGoogle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@href='/Trips']")).click();
		driver.findElement(By.xpath("html/body//a[@href='/CheapFlightsHome']/span")).click();
		
		driver.findElement(By.xpath("//*[@class='query origWithLabel'] [@placeholder='From where?']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@class='query destWithLabel'] [@placeholder='To where?']")).sendKeys("Pune");
		driver.findElement(By.xpath("//*[@class='picker-label target']")).click();
		
		String date = "15-Feb 2022";
		String splitter[] = date.split("-");
		String checkInmonth_year = splitter[1];
		String checkInday = splitter[0];
		selectDate(checkInmonth_year, checkInday);
		
		date = "19-Feb 2022";
		splitter = date.split("-");
		String checkOutmonth_year = splitter[1];
		String checkOutday = splitter[0];
		selectDate(checkOutmonth_year, checkOutday);
		
	}
	
	public static void selectDate(String month_year, String day) throws InterruptedException{
		
        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='picker-label target']"));
		
		for(int i=0; i<elements.size(); i++){
			System.out.println(elements.get(i).getText());
			//selecting a month
			if(elements.get(i).getText().equals(month_year)){
				//selecting a date
				List<WebElement> days = driver.findElements(By.xpath("//*[@class='rsdc-cell rsdc-day rsdc-startrange']"));
				for(WebElement d:days){
					System.out.println(d.getText());
					if(d.getText().equals(day)){
						d.click();
						return;
					}
				}
			}
		}
		Thread.sleep(2000);
		selectDate(month_year, day);
	}

}
