package edu.wzm.action.iterator.example;

import java.util.List;

public class PancakeHouseIterator implements Iterator {
    private List<MenuItem> items;
    private int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size() ? true : false;
    }

    @Override
    public Object next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }

    @Override
    public void remove() {

    }
}
