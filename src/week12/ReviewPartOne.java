package week12;

public class ReviewPartOne {

  public static void main(String[] args) {

    // This week and next week will be reviewing material from past classes


    // WEEK #2 - Variable Definition and Mathematical Operations

    // Define an integer called "num" with the value 5
    int num = 5;

    // Print "num" out
    System.out.println(num);

    // Define a character called "character" with the value 'a'
    char character = 'a';

    // Define a String called "str" with the value "Hi"
    String str = "Hi";

    // Reassign the variable str to be "Hello" instead of "Hi"
    str = "Hello";

    // What will the following print out?
    int division = 5 / 2;
    System.out.println(division);

    // What will the following print out?
    double divide = 7 / 3;
    System.out.println(divide);

    // How do we tell Java to use decimal instead of integer division?
    double fixedDivide = 7 / 3d;
    System.out.println(fixedDivide);

    // What will the following print out?
    System.out.println(5 + 6 / 4 + 2 * 3 + 3 / 90);

    // What will the following print out?
    System.out.println(3 + 2 % 9 + 3 / 5 + 6);

    // Java Operator Precedence: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html


    // WEEK #3 - Comparisons and Compound Operators

    // What will the following print out?
    boolean comparison = 5 > 3;
    System.out.println(comparison);

    // Suppose we had a variable named "count"
    int count = 20;

    // How do we increment it by 1?
    count++;

    // How do we decrement it by 1?
    count--;

    // How do we increment it by 3 using a compound operator?
    count += 3;

    // How do we take the modulo of it by 5 using a compound operator?
    count %= 5;

    // How do we divide it by 10 using a compound operator?
    count /= 10;

    // What is the general compound operator pattern?
    // [operator]=

    // What is the value of "mysteryPartTwo" after everything is executed?
    int operatorMystery = 1;
    operatorMystery *= 5;
    operatorMystery /= 2; // HINT, / means divide
    operatorMystery++;

    // The answer is 3
    // mysteryPartTwo *= 5;  -> Multiplies 5 --> 5
    // mysteryPartTwo /= 2;  -> Divides 2    --> 5 / 2 = 2 (Integer Division)
    // mysteryPartTwo++;     -> Adds 1       --> 3

    int operatorMysteryTwo = -1;
    operatorMysteryTwo *= -1;
    operatorMysteryTwo++;
    operatorMysteryTwo++;
    operatorMysteryTwo--;
    operatorMysteryTwo -= 5;
    operatorMysteryTwo += 6;
    operatorMysteryTwo /= 3;

    // The answer is 1
    // mysteryPartThree *= -1;  -> Multiples -1 -> 1
    // mysteryPartThree++;      -> Adds 1       -> 2
    // mysteryPartThree++;      -> Adds 1       -> 3
    // mysteryPartThree--;      -> Subtracts 1  -> 2
    // mysteryPartThree -= 5;   -> Subtracts 5  -> -3
    // mysteryPartThree += 6;   -> Adds 6       -> 3
    // mysteryPartThree /= 3;   -> Divides 3    -> 1

    int operatorMysteryThree = -3;
    operatorMysteryThree++;
    operatorMysteryThree--;
    operatorMysteryThree += 3;
    operatorMysteryThree *= 0;
    operatorMysteryThree %= 6;
    operatorMysteryThree /= 0;

    // The answer is an exception. What is the exception?


    // WEEK #4 - Conditionals

    // Suppose we had a boolean which compares 2 and 2
    boolean two = 2 == 2;

    // If we wanted to check if "two" is true, and print out something, how would we do it?
    if (two) {
      System.out.println("2 is equal to 2!");
    }

    // Let's say that "two" is false. (It's always going to be true, yes, but for the sake of
    // review how would we add an else clause to it?)
    if (two) {
      System.out.println("2 is equal to 2!");
    } else {
      System.out.println("2 is not equal to 2!");
    }

    // As a reminder, you can use else if to handle multiple cases

    int grade = 89; // makeshift grade
    if (grade >= 95) { // grade is greater or equal to 95
      System.out.println("A+");
    } else if (grade >= 90) { // we already know the grade is NOT greater or equal to 95 (because we passed it)
      System.out.println("A-");
    } else if (grade >= 85) { // we already know the grade is NOT greater or equal to 90 (because we passed it)
      System.out.println("B+");
    } else if (grade >= 80) { // we already know the grade is NOT greater or equal to 85 (because we passed it)
      System.out.println("B");
    } else { // Otherwise, if the grade is something different (which in this case, is lower)
      System.out.println("F-");
    }

    // Now try this problem: An air quality measurement is performed in Boston.
    // If the air quality between 1 and 20 is excellent, an air quality between
    // 21 and 40 is good, an air quality between 41 and 50 is okay, and anything
    // else is poor. Given the following air quality rating:
    int airQuality = 27;

    // Write a condition to check the airQuality. Print out the rating based on
    // the air quality.
    if (airQuality >= 1 && airQuality <= 20) {
      System.out.println("Excellent");
    } else if (airQuality <= 40) {
      System.out.println("Good");
    } else if (airQuality <= 50) {
      System.out.println("Okay");
    } else {
      System.out.println("Poor");
    }

    // What will this print out?
    int a = 2;
    int b = 5;
    int c = 9;

    if (a > b) {
      a += b;
      b += c;
    } else if (a == b) {
      a += c;
      c += a;
    } else {
      a += a;
      b += a;
    }

    if (a * b > c) {
      a--;
      a -= 5;
    }


    // WEEK #5 - Arrays

    // What number do indexes in Java start with?
    // 0

    // What is the importance of arrays?
    // To store many variables in a single data structure.

    // Definition of an array is as follows:
    // [data type] [] [variable name] = new [data type][length];

    // In the following array:
    // {0, 1, 3, 8, 9, 2}

    // a) What index is the element 8 at?
    // b) What is the length of the array?

    // Define a String array called "strArray" with length 3
    String[] strArray = new String[3];

    // Define an integer array called "array" with length 5
    int[] array = new int[5];

    // Assign the value at index 0 in the array to be 5
    array[0] = 5;

    // Assign the 3rd element of the array to be 3
    array[2] = 3;

    // Print out the element at the 4th index of the array
    System.out.println(array[4]);

    // What will this give us?
    System.out.println(array[5]);

    // How do we check if the value of the element at index 3 is greater than the value of the element at index 2?
    if (array[3] > array[2]) {
      System.out.println("The value of the element at index 3 is greater than the value of the element at 2");
    }

    // How do we add the value of the third element of the array to the second element?
    array[1] += array[2];

    // How do we find the length of an array?
    int length = array.length;
  }

}
