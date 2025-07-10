package week3day2;

public class Edge extends Browser{

	public void takesnap() {
		System.out.println("takesnap edge");
	}
	public void clearcookie() {
		System.out.println("Clear cookie from edge");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Edge e= new Edge();
 e.openurl();
 e.navigateback();
 e.closebroser();
 e.takesnap();
 e.clearcookie();

	}

}
