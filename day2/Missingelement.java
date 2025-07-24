package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Missingelement {
	public static void main(String[] args) {
		

		List<Integer> numbers = new ArrayList<Integer>();
		Collections.addAll(numbers, 1,2, 3, 4, 10, 6, 8);
		System.out.println(numbers);
		
		

		Collections.sort(numbers);
		System.out.println(numbers);
		
		for(int i=0;i<numbers.size()-1;i++) {
			int current = numbers.get(i);
			int next=numbers.get(i+1);
			
			if(current+1 != next) {
				for(int j=current+1;j<next;j++) {
					System.out.println("Missing number is: "+j);
				}
			}
		}}}