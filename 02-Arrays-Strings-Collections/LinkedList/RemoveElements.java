package LinkedList;

public class RemoveElements {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Print the LinkedList before removal
        System.out.println("Before removal: " + linkedList);

        // Remove an element from the LinkedList
        linkedList.remove("Banana");

        // Print the LinkedList after removal
        System.out.println("After removal: " + linkedList);
    }
}
