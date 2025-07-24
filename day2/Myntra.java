package week4.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeDriver driver=new ChromeDriver();
	
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Bags",Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Men']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Handbags']")).click();
	   
		Thread.sleep(2000);
	   WebElement element = driver.findElement(By.xpath("//span[@class='title-count']"));
	   System.out.println("No.of.Items found:"+element.getText());
	  
	    List<WebElement> Brands = driver.findElements(By.xpath("//ul[@class='brand-list']/li/label"));
	    List<String> BrandList = new ArrayList<>();
	    for (WebElement BrandElement : Brands) {
	    	String BrandName = BrandElement.getText();
	    	String BNameAlone = BrandName.split("\\(")[0].trim();
	    	BrandList.add(BNameAlone); 	
			}
	    System.out.println("List of the Brands"+ BrandList);
	  
	    List<WebElement> Products = driver.findElements(By.xpath("//h4[@class='product-product']"));
	    List<String> ProductList=new ArrayList<>();
	    for (WebElement BagName : Products) {
	    	String BagNames = BagName.getText();
	    	ProductList.add(BagNames);    	
			}
	System.out.println("List of the bag names:"+ ProductList);
	
	}

}
