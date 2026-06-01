package StringBuffer;

public class InsertMethod {

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("Java");

        buffer.insert(4, " Language");

        System.out.println(buffer);
    }
}
