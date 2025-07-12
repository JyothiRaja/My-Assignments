package week3day2;

public class Safari extends Browser {
	public void readermode() {
		System.out.println("readermode from safari");
	}
	public void fullscreen() {
		System.out.println("Fullscreen from safari");
	}
	public static void main(String[] args) {
		
 Safari s= new Safari();
 s.openurl();
 s.navigateback();
 s.closebroser();
 s.readermode();
 s.fullscreen();
}
}