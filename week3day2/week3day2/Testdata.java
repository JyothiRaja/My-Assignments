package week3day2;

public class Testdata
{
	public void enterCredentials() {
		System.out.println("Enter credentials");
	}
	public void navigateToHomePage() {
		System.out.println("Navigate to Home Page");
	}
	public static void main(String[] args) {
		Testdata Td = new Testdata();
		Td.enterCredentials();
		Td.navigateToHomePage();
	}
}