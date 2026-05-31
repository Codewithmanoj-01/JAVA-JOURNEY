package StringClass;

public class StringComparison {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";

        System.out.println(str1.equals(str2));

        System.out.println(str1.equals(str3));

        System.out.println(str1.equalsIgnoreCase(str3)); // equalsIgnoreCase() method compares two strings, ignoring case considerations.
    }
}
