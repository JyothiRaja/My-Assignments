package week1.day2;

public class Fibonacciseries {
	public static void main(String[] args) {
		int s = 8;
		int a=0;
		int b=1;
		System.out.print(a+","+b+",");
		for (int i = 2; i <s; i++) 
		{
			int next = a+b;
			System.out.print(next +",");
			a=b;
			b=next;
		}

	}
}
