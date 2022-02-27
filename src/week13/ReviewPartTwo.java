package week13;

import java.util.Random;

public class ReviewPartTwo {

  public static void main(String[] args) {

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
    // System.out.println(array[5]);

    // How do we check if the value of the element at index 3 is greater than the value of the element at index 2?
    if (array[3] > array[2]) {
      System.out.println("The value of the element at index 3 is greater than the value of the element at index 2");
    }

    // How do we add the value of the third element of the array to the second element?
    array[1] += array[2];

    // How do we find the length of an array?
    int length = array.length;


    // WEEK #6 - For Loops

    // Why are loops useful?
    // What are the two main types of loops?

    // There are two types of for loops. The enhanced for loop (or for-each loop) and the
    // typical for loop.

    // The for-each loop cycles through each element of a data structure. For example, in
    // this case, each object inside the array is being assigned to element.
    int[] demo = {1, 3, 5, 7, 9};
    for (int element : demo) {
      System.out.println(element);
      // The loop goes through each element of the array left to right.
      // 1, 3, 5, 7, 9
    }

    demo = new int[]{5, 9, 1, 3};
    for (int element : demo) {
      System.out.println(element);
      // What will this print out?
    }

    // Write your own for each loop to print out each element of demo2
    int[] demo2 = {0, 1, 2, 3, 4};
    for (int element : demo2) {
      System.out.println(demo2);
    }

    // Write a for loop that adds each element inside the array demo2 together. Hint, use
    // compound operators to add the variable to the sum variable.
    int sum = 0;
    for (int element : demo2) {
      sum += element;
    }
    System.out.println(sum);

    // Write a for loop that multiplies all the elements inside the array demo2 together. Use compound operators.
    int product = 1;
    for (int element : demo2) {
      product *= element;
    }

    // The typical for loop has three parts. Initialization, condition, and updation.
    // for (initialization; condition; iteration (or updation)) {
    //   // do something
    // }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    // int i = 0 -> initialization
    // i < array.length -> condition
    // i++ -> updation

    for (int j = 0; j < array.length - 2; j++) {
      System.out.println(array[j + 1]);
    }
    // What is the:
      // initialization?
      // condition?
      // updation?
    // of the loop above?

    // Notice the value of i here
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // What do you think this will print?
    // 0, 1, 2, 3, 4

    // Why does it print that?

    // Now for the following:
    int[] forLoopArray = {9, 6, 3, 0};
    int len = forLoopArray.length;
    for (int i = 0; i < len; i++) {
      System.out.println(i);
    }

    // What will the above print out?
    // It will print out 0, 1, 2, 3. These are the indexes of our array!
    // We can substitute i for the index of our array.
    for (int i = 0; i < len; i++) {
      System.out.println(array[i]);
      // array[0] -> first element. We can substitute i in here from our loop because it's our index
      // array[1] -> so on
    }

    // Write a for loop that adds each element of the array together:
    int[] problem = {0, 9, 6, 7, -1};
    int problemSum = 0;
    for (int i = 0; i < problem.length; i++) {
      problemSum += problem[i];
    }
    System.out.println(problemSum);

    // Write a for loop that prints the elements of the array "problem" in reverse:
    for (int i = 0; i < problem.length; i++) {
      problemSum += problem[problem.length - i - 1];
    }


    // WEEK #7 - While Loops

    // There are two types of while loops. The do-while loop and the typical while
    // loop. What is the difference between a while loop and a do-while loop?

    // A while loop continues to loop until a condition is met.

    // What happens if the condition is never met? What do we call this loop?

    // Copy the following method:
//    public static int dice() {
//      return new Random().nextInt(6) + 1;
//    }

    int j = 0; // assign a variable j to be 0
    while (j < 5) { // while j is less than 5
      System.out.println(j); // print it out
      j++; // increment it by one
    }

    // Write a while loop that continues to roll the dice until it rolls a 6
    int roll = dice();
    while (roll != 6) {
      roll = dice();
    }

    // Write a while loop that continues to roll the dice until it rolls something less than 6
    int roll2 = dice();
    while (roll2 >= 6) {
      roll2 = dice();
    }

    // Write a while loop that continues to roll two dice until it adds to 6
    int dice1 = dice();
    int dice2 = dice();
    while (dice1 + dice2 != 6) {
      dice1 = dice();
      dice2 = dice();
    }

    // Supplementary Keywords

    // Continue keyword -> automatically skips to the next iteration.
    for (int element : array) {
      if (element == 5) {
        continue; // skips the println and goes to the next iteration
      }
      System.out.println(element);
    }

    // Break keyword -> automatically breaks out of the loop.
    int x = 5;
    while (true) {
      if (x == 5) {
        break;
        // breaks out of the infinite loop, meaning it just will stop
        // the whole loop entirely and not even go to the next cycle.
      }
    }

    // Loop Problems

    // Write a loop that prints out the index of an element. Then break out of it.
    // For example, {0, 5, 6, 3} is the array and the element to search is 6. You
    // print out 2 because 2 is the index of the element 6 inside the array.
    int[] loopProblemArray = {0, 5, 1, 3};
    int target = 3;
    for (int i = 0; i < loopProblemArray.length; i++) {
      if (loopProblemArray[i] == target) {
        System.out.println(i);
        break;
      }
    }
  }

  public static int dice() {
    return new Random().nextInt(6) + 1;
  }

}
