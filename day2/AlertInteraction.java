package week4.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertInteraction {
	public static void main(String[] args)
	{
		EdgeDriver driver = new EdgeDriver(); 
        driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      
        driver.get("https://www.leafground.com/alert.xhtml");

        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
          org.openqa.selenium.Alert alert= driver.switchTo().alert();
        alert.sendKeys("TestLeaf");
        
        alert.dismiss();
        
        WebElement message= driver.findElement(By.xpath("//span[@id='confirm_result']"));
        String result= message.getText();
        System.out.println("message displayed after dismiss:" +result);
        
        if(result.contains(result))
        {
        	System.out.println("alert dismissed successfully");
        }
        else
        {
        	System.out.println("no message is displayed");
        }
    }
}
