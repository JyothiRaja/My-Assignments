package week3day2;

public class Execution {
	
		public static void main(String[] args) 
		{
	       
	        Testdata td = new Testdata();
	        td.enterCredentials();
	        td.navigateToHomePage();
	        
	        
	        Logindata ltd = new Logindata();
	        ltd.enterCredentials();      
	        ltd.navigateToHomePage();    
	        ltd.enterUsername();          
	        ltd.enterPassword();         
	    }
}
