package week3day2;

public class Webelement {
	
	public void click() {
		System.out.println("CLick on the web element");
	}
	public void setText(String text) {
		System.out.println(text);
	}
	public static void main(String[] args) {
		Webelement we = new Webelement();
		we.click();
		we.setText("Hello Element");
	}

}
