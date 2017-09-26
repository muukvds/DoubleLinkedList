public class Main {
    public static void main(String[] args)
    {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);
        doubleLinkedList.add(4);
        doubleLinkedList.add(5);
        doubleLinkedList.add(6);
        doubleLinkedList.add(7);
        doubleLinkedList.add(8);
        doubleLinkedList.add(9);
        doubleLinkedList.add(10);

        doubleLinkedList.printList();

        doubleLinkedList.remove(6);
        doubleLinkedList.remove(3);

        doubleLinkedList.printList();

    }
}
