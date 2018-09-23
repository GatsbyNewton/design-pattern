package edu.wzm.structure.composite.example;

public interface Company {
    void duty();

    void display(int depth);

    default void add(Company company){

    }

    default void remove(Company company){

    }
}
