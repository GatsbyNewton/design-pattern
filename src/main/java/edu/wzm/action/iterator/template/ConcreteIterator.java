package edu.wzm.action.iterator.template;

import java.util.List;

public class ConcreteIterator implements Iterator{
    private List<Element> aggregates;
    int position = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregates = aggregate.getItems();
    }

    @Override
    public Element first() {
        return aggregates.get(0);
    }

    @Override
    public Element next() {
        Element element = null;
        if (position < aggregates.size()){
            element = aggregates.get(position);
        }
        position++;
        return element;
    }

    @Override
    public boolean isDone() {
        return position < aggregates.size() ? false : true ;
    }

    @Override
    public Element currentItem() {
        return aggregates.get(position);
    }
}
