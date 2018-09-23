package edu.wzm.action.iterator.template;

public class Element {
    private String element;

    public Element(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Element{" +
                "element='" + element + '\'' +
                '}';
    }
}
