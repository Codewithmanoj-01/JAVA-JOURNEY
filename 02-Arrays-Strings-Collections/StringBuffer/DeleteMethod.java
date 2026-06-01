package StringBuffer;

public class DeleteMethod {

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("Java Programming");

        buffer.delete(4, 16);

        System.out.println(buffer);
    }
}
