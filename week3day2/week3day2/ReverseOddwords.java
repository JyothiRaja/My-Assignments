package week3day2;

public class ReverseOddwords {
	public static void main(String[] args) 
	{
	 String test = "I am a software tester in test leaf";
         String[] words = test.split(" ");	       
	     System.out.print("Output: ");
	        for (int i = 0; i < words.length; i++)
	        {
	           	if (i % 2 == 0)
	           	{
	              char[] charArray = words[i].toCharArray();
	                for (int j = charArray.length - 1; j >= 0; j--) 
	                {
	                    System.out.print(charArray[j]);
	                }
	            } 
	           	else 
	           	{
	               	    System.out.print(words[i]);
	            }
	            	    System.out.print(" ");
	        }

	}
}
