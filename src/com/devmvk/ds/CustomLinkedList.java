package com.devmvk.ds;

public class CustomLinkedList<T> {

    private CustomLinkedList<T> link;
    private T value;

    public CustomLinkedList<T> getLink() {
        return link;
    }

    public void setLink(CustomLinkedList<T> link) {
        this.link = link;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
