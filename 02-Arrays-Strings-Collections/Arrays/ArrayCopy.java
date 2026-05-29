package Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4, 5};

        int[] copied = new int[original.length];

        for (int i = 0; i < original.length; i++) {

            copied[i] = original[i];
        }

        System.out.println("Copied Array Elements:");

        for (int number : copied) {
            System.out.println(number);
        }
    }
}
