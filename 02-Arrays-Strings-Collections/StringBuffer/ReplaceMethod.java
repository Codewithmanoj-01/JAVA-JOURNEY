package StringBuffer;

public class ReplaceMethod {

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("Java Programming");

        buffer.replace(5, 16, "Developer");

        System.out.println(buffer);
    }
}
