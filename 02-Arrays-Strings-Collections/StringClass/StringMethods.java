package StringClass;

public class StringMethods {

    public static void main(String[] args) {

        String text = "Java Programming";

        System.out.println("Common String Methods");

        System.out.println("Uppercase: " + text.toUpperCase());

        System.out.println("Lowercase: " + text.toLowerCase());

        System.out.println("Contains Java: " + text.contains("Java"));

        System.out.println("Starts With Java: " + text.startsWith("Java"));

        System.out.println("Ends With ming: " + text.endsWith("ming"));

        System.out.println("Substring: " + text.substring(5));
    }
}
