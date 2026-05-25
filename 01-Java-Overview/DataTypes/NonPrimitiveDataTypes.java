package DataTypes;

import java.util.Arrays;

public class NonPrimitiveDataTypes {

    public static void main(String[] args) {

        // String
        String name = "Manoj";

        // Array
        int[] numbers = {10, 20, 30, 40};

        // Class object
        Student student = new Student("Rahul", 22);

        System.out.println("=== Non-Primitive Data Types ===");

        System.out.println("String value: " + name);

        System.out.println("Array values: " + Arrays.toString(numbers));

        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
    }
}

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}