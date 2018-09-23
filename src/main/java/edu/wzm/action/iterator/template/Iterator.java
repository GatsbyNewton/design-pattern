package edu.wzm.action.iterator.template;

public interface Iterator {

    Element first();

    Element next();

    boolean isDone();

    Element currentItem();
}
