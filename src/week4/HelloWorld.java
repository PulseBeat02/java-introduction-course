package week4;

public class HelloWorld {

  public static void main(String[] args) {

    // QUICK REVIEW

    // Defining an integer
    int number = 5;

    // Printing the number into console
    System.out.println(number);

    // Reassigning the integer to the value of "7"
    number = 7;

    // Increment by 1
    number++;

    // Decrement by 1
    number--;

    // Add 5
    number += 5;


    // WARMUP PROBLEM

    // Find the value of "mystery", after the following operations have been applied:
    int mystery = 9;
    mystery++;
    mystery -= 2;
    mystery--;
    mystery *= 3;
    mystery--;
    mystery %= 2;
    mystery += 17;
    mystery /= 3;

    System.out.println(mystery); // you should get 5


    // CONDITIONAL FORMAT

    // What is a conditional statement?
    // A conditional statement is a statement that is subject to one or more conditions to be met.

    // For example, in English:
    // "If I burn the food, then I can't eat dinner."
    // "If I don't walk the dog, then the dog will be upset."
    // "If I study for my test, then I can get a good grade."

    // What is common about all of these statements?
    // Well, they all follow the IF and THEN format. For example, if I had a statement
    // "If X, then Y", then I am implying that if X is true, then I will have to do Y.
    // Otherwise, I don't. For the example above ("If I burn the food, then I can't eat dinner"),
    // the X part is the "I burn the food", and the Y part is "I can't eat dinner".

    // What is the X and Y part for "If I smoke, then I will get lung disease."?

    // Programming also has conditionals. You may have heard these as "if statements", but
    // their official name is called a conditional. The conditional format for Java is as
    // follows (following the example above):

    // if (X) {
    //   Y
    // }

    // For instance:

    if (5 > 2) {
      System.out.println("5 is greater than 2!");
    }

    // Here, the condition we are checking is whether 5 is greater than 2 or not. Notice how
    // the condition is surrounded in parentheses! Then, if the condition is true, we execute
    // what is within the next brackets. We use the curly bracket to define what code we want to
    // run if the condition is true.
    // X would be "5 > 2", and Y would be "System.out.println("5 is greater than 2!");"

    // Obviously, the "condition" (which is 5 > 2) isn't always subject to greater than signs!

    // What is the data type in Java that can be true or false?
    // boolean!

    // The condition can be represented as a boolean too!

    boolean condition = 2 == 2;
    if (condition) {
      System.out.println("2 is equal to 2!");
    }

    // What do you think this will print out?
    // It will print out "2 is equal to 2!".


    // HANDLING WHAT HAPPENS OTHERWISE

    // Now what if we wanted to add an "else". Like if the conditional isn't true, we want to
    // do something else!

    // In english, this would be: "If I work, then I can get money, or else I can't be Bill Gates."
    // Notice how we have the IF X, THEN Y part, but then we also added the OR ELSE Z part to
    // represent what will happen if the condition (which is X) isn't true.

    // In this case, the X would be "I work", the Y would be "I can get money", and the Z (otherwise)
    // would be the "I can't be Bill Gates."

    // In programming, these are called else statement. In Java, the syntax is as follows:

    // if (X) {
    //   Y
    // } else {
    //   Z
    // }

    // For instance:

    if (2 > 6) {
      System.out.println("2 is greater than 6!");
    } else {
      System.out.println("2 is not greater than 6!");
    }

    // IF 6 is greater than 2, then we execute what's inside that block of code
    // "System.out.println("2 is greater than 6!");". Or else, we execute what happens otherwise:
    // "System.out.println("2 is not greater than 6!");"

    // X -> "2 > 6"
    // Y -> "System.out.println("2 is greater than 6!");"
    // Z -> "System.out.println("2 is not greater than 6!");"

    // Notice how the Y part is never executed if X is false.

    // What do you think this will print out?
    // This will print out "2 is not greater than 6!".
    // Can someone explain why this is the case?


    // HANDLING MULTIPLE CASES

    // Now suppose you are giving the following scenario. You want to code a program which
    // will print out a letter grade given a score from 1 to 100.
    // 95+ -> A+
    // 90 - 94 -> A-
    // 85 - 89 -> B+
    // 80 - 84 -> B
    // < 80 -> F-

    // Now you want to handle multiple cases at once. How can you do this?

    // Well, we introduce the else-if statement. The else-if statement is a statement
    // which is executed if the previous condition is false. For example, in English:

    // If the grade is greater or equal to 95, then put an A+, else if the grade is
    // between 90 and 94 inclusive, then put an A-, else if, etc.

    // In Java, they would look like such:

    // if (A) {
    //    doSomethingA();
    // } else if (B) {
    //    doSomethingB();
    // } else if ...
    // etc

    // When implementing the solution to our problem that we are given above, we
    // get the following:

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

    // Notice how if the first conditional fails, it proceeds to check the first else-if statement. If
    // that statement fails as well, it keeps going until it reaches an else block, where any grades
    // that do not satisfy any of these conditions are given an F-.

    // What would this print out?
    // It will print out B+

    // Why will print this out? Can someone explain the logic?


    // AND, OR, and NOT OPERATOR

    // In Java, we have three main ways to operate with our booleans.

    // AND operator -> &&
    // OR  operator -> ||
    // NOT operator -> !

    // We can use these operations to condense our logic.


    // AND OPERATOR (&&)

    // Suppose we wanted to check if our number is even and positive.
    // Assume our variable is named "number"

    // We know that we can check for positivity if number >= 0
    // We know that we can check if it's even if number % 2 == 0
    // ^
    // |
    // (does anyone want to explain why this is the case?). The main reason is due to because
    // % stands for modulo, and we know a number is divisible by the number if its modulo
    // is 0.

    // In code, we can do this:

    int num = 21;

    if (num > 0) { // check that it's positive
      if (num % 2 == 0) { // check that it's a multiple of 2 (we can nest conditionals!)
        System.out.println("The number is both positive and even");
      }
    }

    // If we use the AND operator, we can do this instead
    if (num > 0 && num % 2 == 0) { // if the number is positive AND even
      System.out.println("The number is both positive and even");
    }

    // Notice that we can combine the two smaller conditionals into one single statement with the
    // AND operator. In short, the AND operator only returns true if both conditionals are true.

    // Does anyone know what the above will print out?


    // OR OPERATOR (||)

    // For the OR operator, it is essentially the opposite of the AND operator. We only need
    // 1 out of the 2 conditions to be satisfied for the whole statement to return true.

    // For example, let's say we wanted to check if a number is divisible by 2 OR 3 with normal
    // logic.
    if (num % 2 == 0) { // check if it's divisible by 2
      System.out.println("The number is divisible by 2 or 3!");
    } else if (num % 3 == 0) { // check if it's divisible by 3
      System.out.println("The number is divisible by 2 or 3!");
    }

    // But we can compress that into the following!
    if (num % 2 == 0 || num % 3 == 0) { // check if it's divisible by 2, OR if it's divisible by 3
      System.out.println("The number is divisible by 2 or 3!");
    }

    // Does anyone know what the above will print out? (reminder, num is 21)

    // For both the NOT and the OR operator, we can chain multiple conditions like so:
    if (num % 1 == 0 && num % 2 == 0 && num % 3 == 0) {
      System.out.println("The number is divisible by 1, 2, and 3!");
    }


    // NOT OPERATOR (!)

    // The not operator directly reverses the output. For example, it would turn true to false, and
    // false to true.

    // As an example:

    boolean cond = false; // our condition
    if (!cond) { // if NOT condition (checking if the cond is false)
      System.out.println("The condition is false");
    }

    // OR

    boolean anotherCondition = !false; // this turns false into true
    System.out.println(anotherCondition);
  }

}
