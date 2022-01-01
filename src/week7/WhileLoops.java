package week7;

import java.util.Random;

public class WhileLoops {

  public static void main(String[] args) {

    // FOR LOOPS REVIEW

    // You remember for loops right?
    int[] array = {2, 3, 4, 5, 1};

    // How do we print out each element inside of array?
    for (int element : array) {
      System.out.println(element);
    }

    // How do we print out all the elements inside the array backwards?
    for (int i = 0; i < array.length; i++) {
      int index = array.length - i - 1;
      System.out.println(array[index]);
    }

    // OR

    for (int i = array.length - 1; i >= 0; i--) {
      System.out.println(array[i]);
    }

    // How can we print out the String "dog", 1000 times?
    for (int i = 0; i < 1000; i++) {
      System.out.println("dog");
    }

    // WHILE LOOPS

    // We have covered for loops in the last lesson. That leaves us with 2 more types of
    // loops. While loops, and do-while loops. We will cover both while loops and do-while
    // loops.

    // Suppose that we want to use a loop right. However, we don't want to loop because of
    // indexes. We just want to loop until a certain condition is met, we don't care about
    // anything else. Or in other words, we want to repeat a block of code an unknown number
    // of times until a certain condition is met. This is when while loops come in. Consider
    // looking at the following example:

    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }

    // A while loop structure is pretty simple. It's just a simple condition:
    // while (condition) {
    //  // do something here
    // }

    // The condition is always checked first here before the block of code is executed.

    // Beware of the while loop however! You can easily get into a scenario where
    // you get an infinite loop. Does anyone want to explain what an infinite loop is?
    // An infinite loop is a loop which never ends in the program, and will continue
    // to loop until the program is force quit.

    // For example
    // int spigots = 5;
    // while (spigots < 6) {
    //   System.out.println("Not enough spigots!");
    // }

    // Notice how that we do not update the variable spigots at all inside our
    // while loop. This means that spigots will always be equal to 5, and always
    // be less than 6. The while loop will never end because the condition is
    // never met! It will just keep printing "Not enough spigots!"

    // Try running the code above and see. You will be stuck and the app will
    // just keep running. To cancel the process, click the red square which says
    // "Stop"

    // Now copy and paste the following method below:
    // public static int dice() {
    //   return new Random().nextInt(6) + 1;
    // }

    // I want you to create a while loop which will loop until the dice returns
    // a 6. To call the method, you just call dice() like so: int roll = dice();

    // Keep rolling the dice until you get a 6!
    int roll = dice(); // first roll a dice
    while (roll != 6) { // check if the dice isn't a 6. If it isn't, we must keep going!
      // we have to keep rolling the dice. We assign the value of dice() to roll
      roll = dice();
    }

    // Now I want you to do a similar step, but instead of rolling one dice, I want you to
    // roll 2. Roll two dice, and make a while loop that will keep checking if the dice
    // adds to be 7.
    int dice1 = dice(); // we roll a dice
    int dice2 = dice(); // we roll another dice
    while (dice1 + dice2 != 7) { // we add the dice together. If we don't get 7, we must keep going
      // keep rolling the dice, and assign the new values of our dice to dice1 and dice2
      dice1 = dice();
      dice2 = dice();
    }

    // DO-WHILE LOOPS

    // Do-while loops are a form of while loop which are similar to while loops but with one catch.
    // The block of code is ALWAYS executed at least once before the condition is checked.

    // For example:

    int apples = 2;
    do {
      System.out.println("I still print!");
    } while (apples > 5);

    // Notice that when you run this code, "I still print!" is still printed in the console even
    // thought 2 is not greater than 5.

    // The format for the do-while loop is relatively simple too. It is
    // do {
    //   // some code
    // } while (condition);

    // Infinite loops still exist for do while loops. For example:
    // int bananas = 3;
    // do {
    //   System.out.println("Too many bananas!");
    // } while (bananas > 2);

    // Notice how Intellij gives us a warning: "bananas" is not updated inside the loop. It is
    // hinting to us that there is an infinite loop here, because we are checking if bananas
    // is greater than 2 (which it is), but never updating the bananas variable.

    // WHILE LOOPS WITH COUNTERS
    // One of the most commonly used aspects with while loops is a counter.

    // For example, suppose I wanted to check the logarithm with base 2 of some number.

    int number = 32; // the number we are checking the logarithm for
    int count = 0; // the counter variable
    // while the number is not equal to 1 (because we stop when number reaches 1
    // (32 -> 16 -> 8 -> 4 -> 2 -> 1)
    while (number != 1) {
      number /= 2; // we divide the number by 2 (same as number = number / 2)
      count++; // we add one to the count
    }
    System.out.println(count); // prints out 5

    // Obviously, the above code will not work for numbers that aren't powers of 2 such
    // as 27, 31, etc, but it is a good example of how counter variables are used.

    // Now I want you to do the opposite. Instead of taking the logarithm of a number
    // with base 2, I want you to take the power. For example, I have an int variable
    // named power, and I want you to calculate 2^5 using a while loop.

    int power = 5; // power
    int counter = 0; // counter
    int result = 1; // number
    while (counter != power) { // we check if the counter is not the power
      result *= 2; // if it isn't the power, we multiply by 2 (because 2^5 = 2 * 2 * 2 * 2 * 2)
      counter++; // we add 1 to the counter, so we keep track of how many times we multiplied
    }
    System.out.println(result); // prints out 32

    // INFINITE LOOPS MINI LESSON
    // From the reputation I gave above, it may seem that infinite loops are bad. But in reality,
    // they are useful. In fact, many real life applications require infinite loops. The software
    // which is connected to your keyboard is using an infinite loop to check if you have typed
    // a key.

    // There are two main ways to create an infinite loop.

    // for (;;) {
    // }

    // OR

    // while (true) {
    // }

    // Notice how in the for loop, nothing is being updated. There is no initialization, condition,
    // update, etc. Because of this, we are just forever looping because we aren't satisfying
    // a specific condition.

    // In the second loop (while loop), because the condition is always satisfied (true), it will
    // just keep looping forever.

    // There is an ongoing debate on which to use, and many programmers don't have a consensus
    // on which loop to choose. I personally choose the second one because it makes more "sense"
    // logically to me, but either is fine.

    // CONTINUE KEYWORD
    // You probably remember from last week how we used the break keyword to immediately exit out
    // of a for loop. The same can be applied to a while loop too.

    int num = 5;
    while (true) { // infinite loop
      if (num == 1) {
        break; // break out of the loop
      }
      num--; // update the variable
    }

    // There is also another keyword called continue. The continue keyword is a keyword that allows
    // you to skip the current iteration and immediately move to the next iteration. For example:

    int iteration = 0;
    while (iteration != 5) {
      if (iteration == 3) {
        iteration++;
        continue;
      }
      System.out.println(iteration);
      iteration++;
    }

    // Notice here how 3 is not printed at all. This is because when iteration is at 3, we
    // skip the println statement by to continue keyword, which automatically moves on to the
    // next iteration or loop. We make sure to add 1 to iteration however when iteration is
    // equal to 3, or else we get an infinite loop as a result.

    // WRAPPING UP LOOPS

    // Let's wrap up loops.
    // Loops are a fundamental part of programming which allows us to repeat a block of code.

    // I want you now to type in chat what are in the blanks

    // For loops have two different types of loops. The  ____ loop and the normal for loop. There
    // are two different while loops. The ___ loop and the normal while loop. ___ loops tend to
    // focus on satisfying a condition with an unknown number of times. ___ loops iterate until
    // a certain condition is met with a variable, and ___ loops iterate each element within a
    // data structure.

    // A variable can be used in conjunction of a while loop. This variable is called a ____
    // variable, and it is useful for storing how many times you have iterated.

    // ____ is a keyword that exits the loop immediately. While ____ is a keyword that skips
    // to the next iteration.

    // There are ___ ways to write an infinite loop. You can write it with

    // for (;;) { // some code }
    // OR
    // while (true) { // some code }

    // CHALLENGE PROBLEM

    // Write a for loop which prints out the max sum you can get from adding any two
    // elements within an array.
    int[] max = {1, -9, 1, -5, 9, -2, 1, -3, 6};
    int answer = max[0] + max[1]; // starting value
    for (int first : max) { // loop through array, first number
      for (int second : max) { // loop through array, second number (nested loops)
        int sum = first + second; // get sum from the elements added
        if (sum > answer) { // if the sum is greater than the answer (maximum), update the value
          answer = sum;
        }
      }
    }
    System.out.println(answer);
  }

  public static int dice() {
    return new Random().nextInt(6) + 1;
  }

}
