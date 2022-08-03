import org.w3c.dom.views.DocumentView;

public class Item {

    //! member variables
    private String name;
    private double price;

    //!constructor

    public Item(String name, double price) {
        this.price = price;
        this.name = name;
    }




    //!getters and setters

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }

}