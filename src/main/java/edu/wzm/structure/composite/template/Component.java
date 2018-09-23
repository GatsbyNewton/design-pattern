package edu.wzm.structure.composite.template;

/**
 * 组合模式：安全方式
 */
public interface Component {
    void display(int depth);

    default void add(Component component){

    }

    default void remove(Component component){

    }
}
