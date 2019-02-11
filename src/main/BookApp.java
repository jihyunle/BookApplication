package main;
import data.BookDB;
import java.util.Scanner;

public class BookApp {
    public static void main(String[]args){
        // Create an instance of a Book
        // And print the author, title and description

        // using no-arg constructor
        Book b1 = new Book();
        b1.setAuthor("Stephen King");
        b1.setTitle("Horror stories");
        b1.setDescription("This is a collection of horror stories written by Stephen King.");
        System.out.println(b1.getDisplayText());

        // using three-args constructor
        Book b2 = new Book("Stephen King", "Horror stories",
                "This is a collection of horror stories written by Stephen King.");
        System.out.println(b2.getDisplayText());


        /*
        * Create a method that returns the pricing for a requested number of books.
        * Five books at $20.00 should return $100, if they are in stock.
        * If they are not in stock, that should be handled appropriately (hint - you decide).*/
        Book b3 = new Book();
        Scanner input = new Scanner(System.in);
        promptUser(input, b3);
        if (b3.getIsInStock()){ // if true
            System.out.println("$" + b3.calculatePrice());

        } else {
            showOutOfStock(input);
        }

        /*
        * Create a constructor in the BookDB  class that takes an SKU and populates the private member variables.
        * The constructor by default will return the appropriate BookDB object when it is called.
        * You do not need to include a return statement.*/
        BookDB bDB1 = new BookDB();
        System.out.println(bDB1.getSKU());

        System.out.println(bDB1.getDisplayText());


        /**/
        System.out.println("Please enter the SKU number: ");
        BookDB bDB2 = new BookDB(input.nextLine());
        System.out.println(bDB2.getDisplayText());




    }

    public static void promptUser(Scanner sc, Book b3){
        System.out.println("How many books would you like to order?");

        b3.setNumberOfBooks(sc.nextInt());

        System.out.println("How much does the book cost each?");
        b3.setPrice(sc.nextDouble());
        sc.nextLine();  // consume newline remaining character

        System.out.println("Are the book(s) in stock? (Y|N)");
        if (sc.nextLine().equalsIgnoreCase("Y")){
            b3.setIsInStock(true);
        } else {
            b3.setIsInStock(false);
        }
    }

    public static void showOutOfStock(Scanner sc){
        System.out.println("The book is out of stock. Please review your inventory");
//        System.out.println("...");
//        System.out.println("Welcome back. Would you like to create a new order? (Y|N");
//        if (sc.nextLine().equalsIgnoreCase("Y")){
//            promptUser();
//        }
    }
}
