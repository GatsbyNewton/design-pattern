package edu.wzm.action.iterator.template;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {

    private static final int MAXIMUM_CAPACITY = 10;
    private int position = 0;
    private List<Element> items;

    public ConcreteAggregate() {
        this.items = new ArrayList<>(MAXIMUM_CAPACITY);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public void addItem(String element)
    {
        Element item = new Element(element);
        if (position >= MAXIMUM_CAPACITY) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            items.add(item);
            position = position + 1;
        }
    }

    public List<Element> getItems() {
        return items;
    }
}
