What is String Handling in Java ?

In Java, the String class is used to represent sequences of characters. Strings are immutable, meaning once a String object is created, it cannot be changed. The Java String class provides various methods for manipulating and examining strings. 



Below are some methods in your syllabus and their process of implementation 



String Class Methods

1. String trim()

Removes whitespace from both ends of a string.

String str = "  Hello World  ";
String trimmedStr = str.trim();  // "Hello World"




2. String toLowerCase()

Converts all characters in the string to lowercase.

String str = "HELLO";
String lowerStr = str.toLowerCase();  // "hello"




3. String toUpperCase()

Converts all characters in the string to uppercase.

String str = "hello";
String upperStr = str.toUpperCase();  // "HELLO"




4. int length()

Returns the number of characters in the string.

String str = "Hello";
int len = str.length();  // 5





5. char charAt(int n)

Returns the character at the specified index.

String str = "Hello";
char ch = str.charAt(1);  // 'e'




6. int indexOf(char ch)

Returns the index of the first occurrence of the specified character. Returns -1 if the character is not found.

String str = "Hello";
int index = str.indexOf('l');  // 2



7. int lastIndexOf(char ch)

Returns the index of the last occurrence of the specified character. Returns -1 if the character is not found.

String str = "Hello";
int lastIndex = str.lastIndexOf('l');  // 3




8. String concat(String str)

Concatenates the specified string to the end of the current string.

String str1 = "Hello";
String str2 = " World";
String result = str1.concat(str2);  // "Hello World"




9. boolean equals(String str)

Checks whether two strings are exactly the same (case-sensitive).

String str1 = "Hello";
String str2 = "hello";
boolean isEqual = str1.equals(str2);  // false




10. boolean equalsIgnoreCase(String str)

Checks whether two strings are equal, ignoring case differences.

String str1 = "Hello";
String str2 = "hello";
boolean isEqual = str1.equalsIgnoreCase(str2);  //
 true




11. int compareTo(String str)

Compares two strings lexicographically.

String str1 = "Apple";
String str2 = "Banana";
int result = str1.compareTo(str2);  // -1 (str1 < str2)





12. int compareToIgnoreCase(String str)

Compares two strings lexicographically, ignoring case differences.

String str1 = "apple";
String str2 = "Banana";
int result = str1.compareToIgnoreCase(str2);  // -1 (str1 < str2, ignoring case)






13. String replace(char oldChar, char newChar)

Replaces all occurrences of oldChar with newChar in the string.

String str = "Hello";
String replacedStr = str.replace('l', 'p');  // "Heppo"





14. String substring(int beginIndex)

Returns a new string starting from the specified index to the end of the string.

String str = "Hello World";
String substr = str.substring(6);  // "World"





15. String substring(int beginIndex, int endIndex)

Returns a new string starting from beginIndex and ending at endIndex (exclusive).

String str = "Hello World";
String substr = str.substring(0, 5);  // "Hello"





16. boolean startsWith(String str)

Checks if the string starts with the specified substring.

String str = "Hello World";
boolean startsWith = str.startsWith("Hello");  // true






17. boolean endsWith(String str)

Checks if the string ends with the specified substring.

String str = "Hello World";
boolean endsWith = str.endsWith("World");  // true






18. String valueOf(all types)

Converts a value (primitive type or object) to its string representation.

int num = 10;
String str = String.valueOf(num);  // "10"





String Array

You can create arrays of strings in Java using the following syntax:

String[] strArray = {"Hello", "World", "Java"};
for (String str : strArray) {
    System.out.println(str);
}

This will output:

Hello
World
Java

I'll explain or I've already explained them in class 

- Sattik 