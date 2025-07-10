package week3day1;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {5,6,7,8,9};
		int num1[]= {1,2,3,4,5,6};
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num1.length; j++) {
				
				if (num[i]==num1[j]) {
					System.out.println("intersection is:"+num[i]);
					
				}
				
			}
			
		}

	}


	}


