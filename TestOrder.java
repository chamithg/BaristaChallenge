public class TestOrder {

    public static void main(String[] args) {
        Item latte = new Item("Latte", 2.99);
        Item cappusino = new Item("Cappucino", 3.99);
        Item Machiato = new Item("Machiato", 4.55);
        Item chai = new Item("Chai", 2.45);


        Order unspecifiedOrder1 = new Order();
        Order unspecifiedOrder2 = new Order();

        Order namedOrder1 = new Order("Sam");
        Order namedOrder2 = new Order("Noah");
        Order namedOrder3 = new Order("Jared");

        //! adding items to List

        unspecifiedOrder1.addItems(latte);
        unspecifiedOrder1.addItems(chai);

        unspecifiedOrder2.addItems(cappusino);
        unspecifiedOrder2.addItems(Machiato);

        namedOrder1.addItems(latte);
        namedOrder1.addItems(Machiato);
        namedOrder1.addItems(chai);

        namedOrder2.addItems(cappusino);
        namedOrder2.addItems(Machiato);
        namedOrder2.addItems(chai);

        namedOrder3.addItems(latte);
        namedOrder3.addItems(latte);
        namedOrder3.addItems(chai);


        unspecifiedOrder1.display();
        unspecifiedOrder2.display();
        namedOrder1.display();
        namedOrder2.display();
        namedOrder3.display();

        System.out.println(unspecifiedOrder1.getOrderTotal());
        System.out.println(unspecifiedOrder2.getOrderTotal());
        System.out.println(namedOrder1.getOrderTotal());
        System.out.println(namedOrder2.getOrderTotal());
        System.out.println(namedOrder3.getOrderTotal());




    }
    
}
