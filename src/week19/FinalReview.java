package week19;

import java.util.Random;

public class FinalReview {

  public static void main(String[] args) {

    // This is our last course of the semester! To wrap things up, I would figure I would just
    // create a small test to review all the content that we have covered.

    // (1) Create an integer named "number," and set the value of it to be 9. Subtract 5 from
    // number. Divide number by 3. Take the modulo of number with 9. Then print it out. (2m)
    int number = 0;
    number -= 5;
    number /= 3;
    number %= 9;
    System.out.println(number);

    // (2) Add and subtract 1 from the number using the special operator. (1m)
    number++;
    number--;

    // (3) What is the value of "mystery"? (2m)
    int mystery = -2;
    mystery *= -5;
    mystery--;
    mystery++;
    mystery += 6;
    mystery /= 8;

    // (4) Make a conditional to check if 2 is greater than 6. If it is, print out true. (2m)
    if (2 > 6) {
      System.out.println(true);
    }

    // (5) Make a conditional to check if the variable "number" is divisible by 2 and 3. If it is
    // true, print out true. (2m)
    if (number % 2 == 0 && number % 3 == 0) {
      System.out.println(true);
    }

    // (6) Create an int[] with the name "array" with size 5. Set the value at the first index to be
    // 2. Set the value of the third index to be 4. (2m)
    int[] array = new int[5];
    array[0] = 2;
    array[3] = 4;

    // (7) Write a for-each loop. As a reminder, a for-each loop is a loop where you loop through
    // each element inside a data structure! Print out every element inside of array using a
    // for-each loop. HINT: Review notes. (5m)
    for (int element : array) {
      System.out.println(array);
    }

    // (8) Now write a normal for loop. Use i as your looping variable and add all the elements
    // inside the array together. Print the sum out at the end. (5m)
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    System.out.println(sum);

    // (9) Copy and paste the following method:
//    public static int dice() {
//      return new Random().nextInt(6) + 1;
//    }
    // Call the method, which rolls a die for you. Keep looping the dice until you reach 6. (6m)
    int dice = dice();
    while (dice != 6) {
      dice = dice();
    }

    // (10) Print out the 2nd element of "array". (1m)
    System.out.println(array[1]);

    // (11) Print out the sum of the 2nd element and 4th element of "array". (2m)
    System.out.println(array[1] + array[3]);

    // (12) What will the following print out? (2m)
    System.out.println("abcabcabc".indexOf("abc", 5));

    // (13) Will the following result print out true? (3m)
    String str = "hi";
    String anotherStr = str;
    System.out.println(str == anotherStr && str.equals(anotherStr));

    // (14) Write a method that computes the average of two integers. Name this method
    // "average," and accept two integers. Return an integer too. Add the static modifier
    // to it. (3m)

    // (15) Write a void method that computes the product of two doubles. Name this method
    // "product," and accept two doubles. Return a double too. Add the static modifier to it. (3m)

    // (16) Let's write a Employee class.

    // (a) Create the class header. Name the class Employee. (1m)

    // (b) Create three variables inside the class. Add a String for firstName, lastName, and int
    // for age. (2m)

    // (c) Create a constructor that passes in the first name, last name, and age. Set the arguments
    // of constructor to be the values in the class. (4m)

    // (d) Create three methods in this class. Create a method called getFirstName, which returns
    // the firstName, getLastName, which returns the lastName, and getAge, which returns the age. (4m)

    class Employee {

      String firstName;
      String lastName;
      int age;

      Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
      }

      String getFirstName() {
        return firstName;
      }

      String getLastName() {
        return lastName;
      }

      int getAge() {
        return age;
      }
    }

  }

  // (9)
  public static int dice() {
    return new Random().nextInt(6) + 1;
  }

  // (14)
  static int average(int a, int b) {
    return (a + b) / 2;
  }

  // (15)
  static double product(double a, double b) {
    return a * b;
  }

}
