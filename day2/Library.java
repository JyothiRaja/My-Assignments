package week1.day2;

public class Library {
	public String addbook(String bookTitle)
	{
		System.out.println("Book added sucessfully");
		return bookTitle;
	}
	public void issuebook()
	{
	System.out.println("Book issued successfully");	
	}
    public static void main(String[] args) 
    {
	Library lib=new Library();
	String Title=lib.addbook("Java coding");
	System.out.println("BookTitle:" +Title);
	lib.issuebook();
	}
}
