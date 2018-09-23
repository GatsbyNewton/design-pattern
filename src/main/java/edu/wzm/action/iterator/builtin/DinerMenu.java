package edu.wzm.action.iterator.builtin;


import java.util.Iterator;

public class DinerMenu implements Menu {
    private static final int MAXIMUM_CAPACITY = 10;

    private int numberOfItems = 0;
    private MenuItem[] items;
    public DinerMenu() {
        this.items = new MenuItem[MAXIMUM_CAPACITY];

        add("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        add("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        add("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        add("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
        add("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice", true, 3.99);
        add("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89);
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(items);
    }

    public void add(String name, String description, boolean vegetarian, double price){
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAXIMUM_CAPACITY){
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        }else {
            items[numberOfItems] = item;
            numberOfItems++;
        }
    }
}
