package org.example.tree;

public class CustomBinaryTree<T extends Comparable<T>> {

    private Node<T> root;

    public CustomBinaryTree() {
        this.root = null;
    }

    public void insert(T data) {
        root = insertRecursive(root, data);
    }

    private Node<T> insertRecursive(Node<T> current, T data) {
        if (current == null) {
            return new Node<>(data);

        }


        if (data.compareTo(current.data) < 0) {
            current.left = insertRecursive(current.left, data);

        } else if (data.compareTo(current.data) > 0) {
            current.right = insertRecursive(current.right, data);

        } else {
            return current;
        }

        return current;
    }


    private void traverseInOrder(Node<T> node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }

    }
    public void displayInOrder() {
        System.out.print("Ağaç (In-Order): [ ");
        traverseInOrder(root);
        System.out.println("]");
    }
    public void displayPreOrder() {

        System.out.print("Ağaç (In-Order): [ ");
        traversePreOrder(root);
        System.out.println("]");
    }
    public void displayPostOrder() {
        System.out.print("Ağaç (In-Order): [ ");
        traversePostOrder(root);
        System.out.println("]");
    }

    private void traversePreOrder(Node<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    private void traversePostOrder(Node<T> node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
