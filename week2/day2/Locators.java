package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.sjavac.options.Options;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver1=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver11=new ChromeDriver(options);
		driver11.manage().window().maximize();
		driver11.get("http://leaftaps.com/opentaps/control/main");
		driver11.findElement(By.id("username")).sendKeys("demosalesmanager");
		WebElement pwd = driver11.findElement(By.name("PASSWORD"));
		pwd.sendKeys("crmsfa");
		
		driver11.findElement(By.className("decorativeSubmit")).click();
		driver11.findElement(By.partialLinkText("CRM")).click();
		//click on leads
		driver11.findElement(By.linkText("Leads")).click();
		//click on create lead
		driver11.findElement(By.linkText("Create Lead")).click();
		driver11.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver11.findElement(By.id("createLeadForm_firstName")).sendKeys("Jyothi");
		driver11.findElement(By.id("createLeadForm_lastName")).sendKeys("Raja");
		driver11.findElement(By.id("createLeadForm_dataSourceId"));
		WebElement sourceDD = driver11.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(sourceDD );
		sel.selectByIndex(4);

		WebElement marketDD = driver11.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel1=new Select(marketDD);
		sel1.selectByVisibleText("Automobile");
		WebElement onwershipDD = driver11.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel2=new Select(onwershipDD);
		sel2.selectByValue("OWN_CCORP");
		driver11.findElement(By.name("submitButton")).click();
	    String title= driver11.getTitle();
	    System.out.println(title);
	    driver11.close();
	}

}
