
Question 3: Overload Method processNum()

Define a class Number to overload the method processNum().

1. Check if a number is abundant.

A number is considered Abundant if the sum of its factors (excluding itself) is greater than the number.


2. Calculate the HCF of two numbers.

Code Implementation:

class Number {
  
    // Method to check if a number is Abundant
    public boolean processNum(int abun) {
        int sum = 0;
        for (int i = 1; i <= abun / 2; i++) {
            if (abun % i == 0) {
                sum += i;
            }
        }
        return sum > abun;  // Return true if sum of factors is greater than the number
    }
  
    // Method to calculate HCF of two numbers
    public int processNum(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;  // HCF is stored in 'a' after the loop
    }
  
    public static void main(String[] args) {
        Number num = new Number();
      
        // Check for Abundant number
        int n = 12;  // Example number
        if (num.processNum(n)) {
            System.out.println(n + " is an Abundant number.");
        } else {
            System.out.println(n + " is NOT an Abundant number.");
        }
      
        // Calculate HCF
        int a = 36, b = 60;
        int hcf = num.processNum(a, b);
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
    }
}

Explanation:

1. The method processNum(int abun) checks if a number is abundant by summing its divisors and comparing the sum with the number.


2. The method processNum(int a, int b) calculates the HCF using the Euclidean algorithm.




---

Question 4: Search for a City Name and Display STD Code

We need to accept ten city names and their respective STD codes, then search for a city entered by the user.

Code Implementation:

import java.util.Scanner;

class CitySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        // Arrays to store cities and their STD codes
        String[] cities = new String[10];
        int[] stdCodes = new int[10];
      
        // Input city names and STD codes
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter city name: ");
            cities[i] = sc.nextLine();
            System.out.print("Enter STD code for " + cities[i] + ": ");
            stdCodes[i] = sc.nextInt();
            sc.nextLine();  // To consume the newline character
        }
      
        // Input city to search
        System.out.print("Enter city to search: ");
        String citySearch = sc.nextLine();
        boolean found = false;
      
        // Search for the city
        for (int i = 0; i < 10; i++) {
            if (cities[i].equalsIgnoreCase(citySearch)) {
                System.out.println("Operation Successful");
                System.out.println("City: " + cities[i] + ", STD Code: " + stdCodes[i]);
                found = true;
                break;
            }
        }
      
        if (!found) {
            System.out.println("Operation Unsuccessful");
            System.out.println("No data found.");
        }
      
        sc.close();
    }
}

Explanation:

1. The program accepts city names and STD codes into two arrays.


2. The user inputs a city name to search. If found, the city and its STD code are displayed, otherwise, a "No data found" message is shown.




---

Question 5: Selection Sort on an Integer Array

We need to sort an array of 10 integers using the Selection Sort technique.

Code Implementation:

import java.util.Scanner;

class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
      
        // Input 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
      
        // Selection sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
      
        // Display sorted array
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
      
        sc.close();
    }
}

Explanation:

1. The Selection Sort algorithm finds the smallest element in the array and swaps it with the first unsorted element.


2. The array is sorted in ascending order.




---

Question 6: Linear Search for Aadhar Number

Define a class to accept 20 names and their corresponding Aadhar numbers. Then, search for an Aadhar number.

Code Implementation:

import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        String[] names = new String[20];
        long[] aadhar = new long[20];
      
        // Input 20 names and their corresponding Aadhar numbers
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.nextLine();
            System.out.print("Enter Aadhar number for " + names[i] + ": ");
            aadhar[i] = sc.nextLong();
            sc.nextLine();  // Consume newline character
        }
      
        // Search for an Aadhar number
        System.out.print("Enter Aadhar number to search: ");
        long searchAadhar = sc.nextLong();
        boolean found = false;
      
        for (int i = 0; i < 20; i++) {
            if (aadhar[i] == searchAadhar) {
                System.out.println("Record found: Name = " + names[i]);
                found = true;
                break;
            }
        }
      
        if (!found) {
            System.out.println("Record does not exist.");
        }
      
        sc.close();
    }
}

Explanation:

1. The program stores 20 names and their Aadhar numbers in arrays.


2. The user can search for an Aadhar number, and if it’s found, the corresponding name is displayed.




---

Question 7: Sort and Display Weights of Ten People

We need to sort and display the weights of 10 people using the Selection Sort technique.

Code Implementation:

import java.util.Scanner;

class WeightSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] weights = new double[10];
      
        // Input weights of 10 people
        System.out.println("Enter weights of 10 people:");
        for (int i = 0; i < 10; i++) {
            weights[i] = sc.nextDouble();
        }
      
        // Selection sort algorithm
        for (int i = 0; i < weights.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < weights.length; j++) {
                if (weights[j] < weights[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            double temp = weights[minIndex];
            weights[minIndex] = weights[i];
            weights[i] = temp;
        }
      
        // Display sorted weights
        System.out.println("Sorted weights:");
        for (double weight : weights) {
            System.out.print(weight + " ");
        }
      
        sc.close();
    }
}

Explanation:

1. The program sorts the weights of 10 people using the Selection Sort technique.


2. It then prints the weights in ascending order.




---

Question 8: Convert String to Uppercase and Count Vowels

We need to convert a string to uppercase and count the number of vowels in it.

Code Implementation:

import java.util.Scanner;

class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
      
        // Convert to uppercase
        String upperStr = input.toUpperCase();
        System.out.println("Uppercase: " + upperStr);
      
        // Count vowels
        int vowelCount = 0;
        for (int i = 0; i < upperStr.length(); i++) {
            char ch = upperStr.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O

