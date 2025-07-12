package week3day2;

public class Button extends Webelement{
	public void submit() {
		System.out.println("Click submit button");
	}
	public static void main(String[] args) {
		Button b = new Button();
		b.submit();
		b.setText("Nice to meet you ");
		b.click();
	}
}
