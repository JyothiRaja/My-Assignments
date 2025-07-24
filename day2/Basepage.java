package week4.day2;

public class Basepage {
	public void findElement() {
		System.out.println("Element Found");
	}
	public void clickElement() {
		System.out.println("Element CLicked");
	}
	public void enterText() {
		System.out.println("Text Entered Successfully");
	}
	public void performCommonTasks() {
		System.out.println("Common Tasks performed");
	}
	public static void main(String[] args) {
		Basepage bp = new Basepage();
		bp.findElement();
		bp.clickElement();
		bp.enterText();
		bp.performCommonTasks();
	}
}
