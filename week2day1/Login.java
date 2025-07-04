package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	
driver.findElement(By.id("email")).sendKeys("jyothiraja@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and login")).click();
		String title = driver.getTitle();
		
System.out.println(title);
		
	}



	}


