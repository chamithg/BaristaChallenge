import java.util.ArrayList;

public class Order {

    //! member variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();
    //! constructor

    public Order(String name) {
        this.name = name;
        this.ready = false;
      
    }
    public Order() {
        this.name = "guest";
        this.ready = false;
      
    }
    
    //!Methods

    public void addItems(Item item) {
        items.add(item);
    }
    
    public String getStatusMessage() {
        if (this.ready) {
            return "your order is ready";
        } else {
            return "Thank you for waiting, Your order will be comming soon";
        }
    }

    public double getOrderTotal() {
        double orderTotal = 0.0;
        for (Item item : items) {
            orderTotal += item.getPrice();
        }

        return orderTotal;
    }


    public void display() {
        System.out.println(name);
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total : $"+ this.getOrderTotal());
    }



    //!Getter and setter

    public void setName(String name) {
        this.name = name;
    }
    public void setReddy(Boolean ready) {
        this.ready = ready;
    }   
    public String getName() {
        return this.name;
    }
    public boolean getReady() {
        return this.ready;
    }    
    public ArrayList<Item> getItems() {
        return this.items;
    } 




}
