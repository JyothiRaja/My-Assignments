package week3day2;

public class Execution {
	
		public static void main(String[] args) 
		{
	       
	        Testdata td = new Testdata();
	        td.enterCredentials();
	        td.navigateToHomePage();
	        
	        
	        Logindata ld = new Logindata();
	        ld.enterCredentials();      
	        ld.navigateToHomePage();    
	        ld.enterUsername();          
	        ld.enterPassword();         
	    }
}
