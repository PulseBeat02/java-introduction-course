package week8;

import java.util.Random;

public class LoopsReview {

  public static void main(String[] args) {

    // Let's review some array concepts:

    // How do I define a String array with the name "strArray" and with length 2? (Don't assign anything)
    String[] strArray = new String[2];

    // How do I set the element at the first index (of strArray) to be equal to "Dog"?
    strArray[0] = "Dog";

    // How do I print out the element at the first index (of strArray)?
    System.out.println(strArray[0]);


    // Define an integer array with values {1, 2, 3, 5} called "numbers".
    int[] numbers = {1, 2, 3, 5};

    // Add one to the 3rd element in the array.
    numbers[2]++;

    // Add the value of the 4th element to the 2nd element of the array.
    numbers[3] += numbers[1];


    // Let's review some loop concepts:

    // What are loops? How are they useful in the context of programming?
    // A loop is a block of a code which is repeated until a certain condition
    // is met. They are useful in the context of programming because they allow
    // us to write something repetitive concisely (for example, we don't have
    // to write System.out.println 100 times. We can just use a loop for it)

    // What are the 4 main types of loops?
    // - enhanced for loop (for-each loop)
    // - normal for loop
    // - while loop
    // - do while loop

    int[] array = {-1, 3, 1, -3, -1};

    // Enhanced For Loop Structure:
    // for ([element] : [data structure]) {
    //    // do something with element
    // }
    for (int element : array) {
      System.out.println(element);
    }

    // Normal For Loop Structure:
    // If we break it down, we get the following syntax:
    // for (initialization; condition; iteration (or updation)) {
    //   // do something
    // }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    // Does anyone want to explain what the three different stages (initialization,
    // condition, iteration (or updation) stand for?

    // While Loop Structure:
    // while (condition) {
    //  // do something here
    // }
    int whileCounter = 0;
    while (whileCounter < array.length) {
      System.out.println(array[whileCounter]);
      whileCounter++;
    }

    // Do-While Loop Structure:
    // The format for the do-while loop is relatively simple too. It is
    // do {
    //   // some code
    // } while (condition);
    int doWhileCounter = 0;
    do {
      System.out.println(array[doWhileCounter]);
      doWhileCounter++;
    } while (doWhileCounter < array.length);

    // What is the difference between a do-while loop and a normal while loop?
    // A do-while loop executes the action first, and then checks the condition. Whereas
    // a normal while loop checks the condition first and then executes the action.

    // Let's try some problems easy to hard. Today is just going to be a ton of problem
    // solving.


    // PROBLEM SOLVING

    // Write a for loop that prints out every single element in the array. It can be
    // an enhanced for loop (for-each loop) or a normal for loop!

    // ENHANCED FOR LOOP
    for (int element : array) {
      System.out.println(array);
    }

    // NORMAL FOR LOOP
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

    // Write a for loop that prints out every other element in the array.
    // (for example, print the element at index 0, 2, 4, etc)

    // Notice how the change here is that instead of i++, we put i += 2. That way
    // we get every other element in the array.
    for (int i = 0; i < array.length; i += 2) {
      System.out.println(array[i]);
    }

    // Write a for loop that adds all the elements inside the array together!
    // Hint: create a variable to keep track of the sum
    int sum = 0; // sum variable
    for (int number : array) { // for each element
      sum += number; // add to the sum
    }
    System.out.println(sum);

    // Write a for loop that checks if there is a mirror sum of the array
    // that adds to 0. For example, in the array {-1, 3, 1, -3, -1}
    // (same array above), 3 and -3 are mirrors of each other, -1 and the
    // other -1 are mirrors of each other etc. If those two numbers add
    // to be 0, print out that they add to 0.
    for (int i = 0; i < array.length; i++) {
      int left = array[i];
      int right = array[array.length - i - 1];
      if (left + right == 0) {
        System.out.println("They add to 0!");
      }
    }

    // Copy and paste the following block of code:
    //    public static int diceSum() {
    //      final Random random = new Random();
    //      int first = random.nextInt(6) + 1;
    //      int second = random.nextInt(6) + 1;
    //      return first + second;
    //    }

    // Write a while loop which continuously checks if the diceSum equals to 6.
    // If it doesn't equal to 6, keep trying.
    // reassign the dice sum using "diceSums = diceSum();"
    int diceSums = diceSum();
    while (diceSums != 6) {
      diceSums = diceSum();
    }

    // Write a while loop which continuously checks if the diceSum is less than
    // 6. If it isn't less than 6, keep going.
    int diceSumPart2 = diceSum();
    while (diceSumPart2 >= 6) {
      diceSumPart2 = diceSum();
    }

    // INTRODUCING STRING#EQUALS

    // There is a way to compare Strings in Java. Does anyone want to guess how
    // you would do so?

    String first = "Hello World";
    String second = "Hello World";
    System.out.println(first == second); // this actually prints false

    // The reason why that prints false is because String is a class. In Java,
    // there are mainly two types of categories. Classes and primitives. Primitives
    // (like int, double, float, boolean, etc) are basically values that can be
    // compared using ==. When we have a class, using == will basically compare
    // its reference in the memory. This is confusing at first, but will make sense
    // more later on.

    // The proper way to compare the content of these Strings is the equals method.
    System.out.println(first.equals(second));

    // We append .equals on our String and pass in "second" as our argument. This returns
    // a boolean which says if it the Strings are equal or not.

    // Print out whether the Strings are equal or not
    String compareMeOne = "El Mundo";
    String compareMeTwo = "World";
    System.out.println(compareMeOne.equals(compareMeTwo));

    // PROBLEMS USING String#equals

    // Do you remember how to define a String[]?
    String[] strings = {"Hello", "World"};

    // Make a loop which tries to find the index of the element "Hello" in the strings array.
    // For example, in this case, it would return 0 because "Hello" is at index 0 in this
    // array.
    for (int i = 0; i < strings.length; i++) { // loop through each element
      String element = strings[i]; // each String in the array
      if (element.equals("Hello")) { // check if it equals "Hello"
        System.out.println(i); // print out i (the index) if it does equal to it
      }
    }

    // Check if all elements inside the array equal to "Hello". If it doesn't,
    // print out "Not all elements inside the array are not equal to Hello!".
    // Then BREAK right after.
    for (int i = 0; i < strings.length; i++) { // loop through each element
      String element = strings[i]; // each String in the array
      if (!element.equals("Hello")) { // check if it does NOT equal to "Hello"
        System.out.println("Not all elements inside the array are not equal to Hello!");
        // print out the message
        break;
      }
    }

    // Why did I tell you to BREAK right after the statement? (Note, requires a little
    // of logic reasoning).
    // The reasoning is because we are checking if all elements are equal to "Hello". If we find
    // 1 single element which doesn't equal "Hello", we can stop because this automatically means
    // that not all the elements equal "Hello".
  }

  public static int diceSum() {
    final Random random = new Random();
    int first = random.nextInt(6) + 1;
    int second = random.nextInt(6) + 1;
    return first + second;
  }
}
