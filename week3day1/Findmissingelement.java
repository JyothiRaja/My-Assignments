package week3day1;

import java.util.Arrays;
public class Findmissingelement {
	public static void main(String[] args) {
		int[] arr = {1, 4, 3, 2, 8, 6, 7};

 
        Arrays.sort(arr);

      
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] != arr[i] + 1) {
                System.out.println("The Missing number: " + (arr[i] + 1));
                break;
            }
        }
    }
}
