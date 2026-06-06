package LinkedList;

public class FirstAndLastElement {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Get the first element
        String firstElement = linkedList.getFirst();
        System.out.println("First element: " + firstElement);

        // Get the last element
        String lastElement = linkedList.getLast();
        System.out.println("Last element: " + lastElement);
    }
}
