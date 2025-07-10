package week3day2;

public class Checkbox extends Button {
	public void clickCheckButton() 
	{
		System.out.println("Click on the check button");
	}
	public static void main(String[] args) {
		Checkbox cbox = new Checkbox();
		cbox.clickCheckButton();
		cbox.submit();
	
        System.out.println("CheckBoxButton clicked");
    }
}
