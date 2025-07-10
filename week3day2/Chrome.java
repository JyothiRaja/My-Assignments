package week3day2;

public class Chrome extends Browser {
	public void openincognito() {
	
			System.out.println("open Incognito");
	}
	public void clearcache() {
		
		System.out.println("Clear cache from chrome");
}
	public static void main(String[]args) {
		Chrome c= new Chrome();
		c.openurl();
		c.navigateback();
		c.closebroser();
		c.openincognito();
		c.clearcache();
	}

}
