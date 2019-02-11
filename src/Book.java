import java.util.Scanner;

public class Book {

    private String title = "";
    private String author = "";
    private String description = "";
    private double price = 0;
    private boolean isInStock;
    private int numberOfBooks = 0;

    public Book(){
        System.out.println("In no-arg constructor");
    }

    public Book(String a, String t, String d){  // overloaded version
        System.out.println("In three-arg constructor");
        author = a;
        title = t;
        description = d;
    }

    public void setTitle(String t){
        title = t;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String a){
        author = a;
    }

    public String getAuthor(){
        return author;
    }

    public void setDescription(String d){
        description = d;
    }

    public String getDescription(){
        return description;
    }

    public void setPrice(double p){
        price = p;
    }

    public double getPrice(){
        return price;
    }

    public void setIsInStock(boolean i){
        isInStock = i;
    }

    public boolean getIsInStock(){
        return isInStock;
    }

    public void setNumberOfBooks(int n){
        numberOfBooks = n;
    }

    public int getNumberOfBooks(){
        return numberOfBooks;
    }

    public double calculatePrice(){
        return price * numberOfBooks;
    }

//    public void showOutOfStock(){
//        System.out.println("The book is out of stock. Please review your inventory");
//        System.out.println("...");
//        System.out.println("Welcome back. Would you like to create a new order? (Y|N");
//        if ()
//    }

//    public void promptUser(){
//        System.out.println("How many books would you like to order?");
//        Scanner sc = new Scanner(System.in);
//        setNumberOfBooks(sc.nextInt());
//
//        System.out.println("How much does the book cost each?");
//        setPrice(sc.nextDouble());
//
//        System.out.println("Are the book(s) in stock? (Y|N)");
//        if (sc.nextLine().equalsIgnoreCase("Y")){
//            setIsInStock(true);
//        } else {
//            setIsInStock(false);
//        }
//    }

    public String getDisplayText(){
        return "Author: " + getAuthor() + "\t Title: " + getTitle() + "\t Description: " + getDescription() + "\t";
    }
}
