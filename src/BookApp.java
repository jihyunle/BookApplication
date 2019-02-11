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

    }
}
