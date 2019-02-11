public class BookDB extends Book {
    private String SKU = "";

    public BookDB(){
        super("Lewis and Clark", "Western Expeditions", "This is a book about Lewis and Clark's expeditions.");
        SKU = "R2D2MC";
        // take an SKU (Stock Keeping Unit) and populate the private member variables
        // constructor will by default return the appropriate BookDB object when it is called
        // you do not need a return statement
    }

    public void setSKU(String SKU){
        this.SKU = SKU;
    }

    public String getSKU(){
        return this.SKU;
    }

    public String getDisplayText(){
        return super.getDisplayText() + "SKU: " + getSKU();
    }

}
