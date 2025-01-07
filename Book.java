import java.util.*;
class Books{
String name,author;
int numPages,price;


Books(String name, String author, int price, int numPages){
this.name = name;
this.author = author;
this.price = price;
this.numPages = numPages;
}
public String toString()
{
String name, author, price, numPages;
name = "Book name: " + this.name + "\n";
author = "Author name: " + this.author + "\n";
price = "Price: " + this.price + "\n";
numPages = "Number of pages: " + this.numPages + "\n";
return name + author + price + numPages;
}
}

 class Book
{

public static void main(String args[])

{

Scanner s = new Scanner(System.in);

int n; String name; String author; int price; int numPages;

System.out.println(" enter the number of books");
n = s.nextInt();


Books[] b = new Books[n];
for ( int i=0;i<n;i++)
{
System.out.println(" enter the name,author, price and number of pages of books");

name=s.next();
author=s.next();
price=s.nextInt();
numPages=s.nextInt();
b[i]=new Books(name,author,price,numPages);

}
for(int i=0;i<n;i++){
System.out.println(b[i]);

        }

     }
	
   }

