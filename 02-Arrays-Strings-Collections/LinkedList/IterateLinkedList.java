package LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Iterate through the LinkedList using a for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Iterate through the LinkedList using an iterator
        System.out.println("\nIterating using an iterator:");
        java.util.Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
