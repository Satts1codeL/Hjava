Example of Using Arrays in Java:

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Access and print array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modify an element
        numbers[2] = 100;
        System.out.println("Modified element at index 2: " + numbers[2]);
    }
}