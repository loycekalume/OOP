
package objectclass;

import java.util.Scanner; 

 class Book {
String  title;
String author;
int numberOfpages;
}


public class BookInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the title of the book:");
		b.title=in.nextLine();
		System.out.println("Please enter the authour name:");
		b.author=in.nextLine();
		System.out.println("Please enter the number of pages:");
		b.numberOfpages=in.nextInt();
		System.out.println("The book title is: "         +b.title);
		System.out.println("The book author is:"         +b.author);
		System.out.println("The book has 150 pages");
		
	}

}
