package week4.day1;

public class Overloadandride {
	public void reportStep(String msg, String status) 
	 {
	        System.out.println("Message: " + msg);
	        System.out.println("Status: " + status);
	    }
	 public void reportStep(String msg, String status, boolean snap) 
	 {
	        System.out.println("Message: " + msg);
	        System.out.println("Status: " + status);
	        if (snap) {
	            System.out.println("Snapshot is taken.");
	        } 
	        else 
	        {
	            System.out.println("Snapshot is not taken.");
	        }
	    }
	public static void main(String[] args) 
	{
		Overloadandride obj= new Overloadandride();
		 obj.reportStep("Hai","Hello");
		 obj.reportStep("testleaf", "java", false);
	  	    	}}