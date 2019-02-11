/*Create a class that contains a method that takes one parameter, the SKU, and returns a corresponding book object.
Use If Statements to populate the instance variables of the Book class and return the populated Book class.

Your database should contain the following books:*/

package data;
import main.Book;

public class BookDB extends Book {
    private String SKU = "";

    public BookDB(){
        super("Lewis and Clark", "Western Expeditions", "This is a book about Lewis and Clark's expeditions.");
        SKU = "R2D2MC";
        // take an SKU (Stock Keeping Unit) and populate the private member variables
        // constructor will by default return the appropriate BookDB object when it is called
        // you do not need a return statement
    }

    public BookDB(String SKU){
        switch (SKU){
            case "Java1001":
                setAll("Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50);
                break;
            case "Java1002":
                setAll("Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00);
                break;
                case "Orcl1003":
                setAll("OCP: Oracle Certified Professional Java SE", "Jeanna Boyarsky", "Everything you need to know in one place", 45.00);
                break;
            case "Python1004":
                setAll("Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50);
                break;
            case "Zombie1005":
                setAll("The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50);
                break;
            case "Rasp1006":
                setAll("Raspberry Pi Projects for the Evil Genius", "Donald Norris", " \tA dozen fiendishly fun projects for the Raspberry Pi!", 14.75);
                break;
            default:
                break;
        }

    }

    public void setSKU(String SKU){
        this.SKU = SKU;
    }

    public String getSKU(){
        return this.SKU;
    }

    public void setAll(String title, String author, String description, double price){
        setTitle(title);
        setAuthor(author);
        setDescription(description);
        setPrice(price);
    }

    public String getDisplayText(){
        return super.getDisplayText() + "SKU: " + getSKU();
    }

}
