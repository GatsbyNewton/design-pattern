package edu.wzm.action.iterator.example;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu{
    private List<MenuItem> items;

    public PancakeHouseMenu() {
        this.items = new ArrayList<>();

        add("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        add("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        add("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        add("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseIterator(items);
    }

    public void add(String name, String description, boolean vegetarian, double price){
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        items.add(item);
    }
}
