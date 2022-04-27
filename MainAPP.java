package Info;
import Employee.Employe;
import Book.Books;
import Book.Authors;



import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
   
        Scanner sc= new Scanner(System.in);
        
        Employe e=new Employe("aaa","eee",5,350000);
        System.out.print(e);
       
        Book b=new Book("eee",5,5);
        System.out.println();
        System.out.print(b);
        
}
}