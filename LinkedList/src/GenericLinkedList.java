
public class GenericLinkedList<T> {


    private static class Node<T> {
        T data; // Veri
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private int size;

    public GenericLinkedList() {
        this.head = null;
        this.size = 0;
    }


    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }


    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }


    public boolean addAt(int index, T data) {
        if (index < 0 || index > size) {
            System.out.println("Hata: Geçersiz indeks (" + index + "). 0 ile " + size + " arasında olmalıdır.");
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }

        Node<T> newNode = new Node<>(data);
        Node<T> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
        return true;
    }


    public T remove(int index) {

        if (head == null) {
            System.out.println("Hata: Liste boş, silme işlemi yapılamaz.");
            return null;
        }


        if (index < 0 || index >= size) {
            System.out.println("Hata: Geçersiz indeks (" + index + "). 0 ile " + (size - 1) + " arasında olmalıdır.");
            return null;
        }

        T removedData;
        if (index == 0) {
            removedData = head.data;
            head = head.next;
        } else {
            Node<T> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedData = current.next.data;
            current.next = current.next.next;
        }
        size--;
        return removedData;
    }


    public T get(int index) {

        if (head == null) {
            System.out.println("Hata: Liste boş, veri alınamaz.");
            return null;
        }


        if (index < 0 || index >= size) {
            System.out.println("Hata: Geçersiz indeks (" + index + "). 0 ile " + (size - 1) + " arasında olmalıdır.");
            return null;
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }


    public boolean set(int index, T newData) {

        if (head == null || index < 0 || index >= size) {
            if (head == null) {
                System.out.println("Hata: Liste boş, güncelleme yapılamaz.");
            } else {
                System.out.println("Hata: Geçersiz indeks (" + index + ").");
            }
            return false;
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = newData;
        return true;
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public void display() {
        if (head == null) {
            System.out.println("Liste: [] (Liste boş)");
            return;
        }
        Node<T> current = head;
        System.out.print("Liste: [");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println("]");
    }
}