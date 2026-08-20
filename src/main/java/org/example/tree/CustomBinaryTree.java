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

    public void displayInOrder() {
        System.out.print("Ağaç (In-Order): [ ");
        traverseInOrder(root);
        System.out.println("]");
    }

    private void traverseInOrder(Node<T> node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }

    }
}
