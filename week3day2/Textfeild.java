package week3day2;

public class Textfeild extends Webelement {
	public String getText() {
		return "Return Text value as output";
	}
	public static void main(String[] args) {
		Textfeild Tf = new Textfeild();
		System.out.println(Tf.getText());
		Tf.click();
		Tf.setText("Welcome");
	}
}

