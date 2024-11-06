package swatitest;

public class Library {
 String libraryName;
String location;
 static int noOfBook=200;
 static  int noOfPerson=50;

int total;
int totalPerson;
Library( String libraryName){
	this.libraryName=libraryName;
	
}
Library(String libraryName,String location){
	
	this.libraryName=libraryName;
	this.location=location;
}
public int addBook(int book){
	int total=noOfBook+book;
	return total;
}
public int bookToPerson(int person){
	int totalPerson=noOfPerson+person;
	return totalPerson ;
}
public String displayBookDetails() {
	System.out.println("enter library name:"+libraryName);
	System.out.println("enter library location:"+location);
	System.out.println("enter library no of books:"+noOfBook);
	System.out.println("enter library no of person:"+noOfPerson);
	System.out.println(" the total book:"+addBook(5));
	System.out.println("the total no of person:"+bookToPerson(10));
	
	return "name"+libraryName+" library location"+location+"books"+noOfBook+
			"no of person"+noOfPerson+"total book"+total+"total person"+totalPerson;
}
	public static void main(String[] args) {
		 Library l3=new Library("nit","hyd");
			l3.displayBookDetails();
		/*Library l1=new Library("nit","n,n");
		l1.addBook(5);
		Library l2=new Library("nit","hyd");
		l2.bookToPerson(10);*/
	}
}
