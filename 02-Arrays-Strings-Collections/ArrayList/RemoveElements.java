import java.util.ArrayList;

public class RemoveElements {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(); // Create an ArrayList of strings ArrayList<String> is a resizable array, which can be found in the java.util package.

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Before Remove: " + fruits);

        fruits.remove("Banana");

        System.out.println("After Remove: " + fruits);
    }
}