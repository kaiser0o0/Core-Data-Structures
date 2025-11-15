import java.util.*;

public static void main(String[] args) {

    GenericLinkedList<String> list = new GenericLinkedList<>();

    System.out.println("1. Başa Ekleme (addFirst):");
    list.addFirst("Java");
    list.addFirst("Siber");
    list.display();

    System.out.println("\n2. Sona Ekleme (add):");
    list.add("Backend");
    list.display();

    System.out.println("\n3. İndekse Ekleme (addAt):");
    list.addAt(1, "Guvenlik");
    list.display();
    list.addAt(10, "Hata");

    System.out.println("\n4. Veri Alma (get(2)): " + list.get(2));

    System.out.println("\n5. Veri Düzenleme (set(0, 'Yeni Siber')): " + list.set(0, "Yeni Siber"));
    list.display();

    System.out.println("\n6. Silme İşlemleri (remove(2)):");
    String silinen = list.remove(2);
    System.out.println("Silinen veri: " + silinen);
    list.display();

    System.out.println("\n7. Performans Kontrolü (size()): " + list.size());

    System.out.println("\n8. Hata Yönetimi Testi (Liste boşaltılıyor):");
    list.remove(0);
    list.remove(0);
    list.remove(0);

    list.display();


    list.remove(0);


    list.get(0);
}
