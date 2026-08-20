package org.example.stack;

import java.util.EmptyStackException;

public class GenericStack<T> {

    public static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> top;
    private int size;

    public GenericStack() {
        this.top = null;
        this.size = 0;
    }

    //PUSH
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    //POP
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;

    }
    public boolean isEmpty() {
        return top == null; // veya size == 0
    }

    //PEEK
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;

    }
    public int size() {
        return size;
    }

    //Display Method
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack: [] (Stack boş)");
            return;
        }
        Node<T> current = top;
        System.out.print("Stack (Üstten Alta): [ ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" ]");
    }

}
