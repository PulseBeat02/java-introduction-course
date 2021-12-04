package week3;

public class HelloWorld {

  public static void main(String[] args) {

    // Quick Review:

    // How would I define an integer named "integer," that has the value 5?
    int integer = 5;
    // ^    ^     ^
    // type name  value

    // How would I define a String named "str," that has the value "Hello World?
    String str = "Hello World";

    // How would I define a decimal named "decimal," that has the value 0.76?
    double decimal = 0.76;

    // How would I define a character named "c," that has the value of 'd'?
    char c = 'd';

    // What is the main format of how we define these types of variables?
    // The format is [type] [name] = [value];

    // Now suppose I have this integer called "number"
    int number = 0;

    // I want you to reassign "number" to 5. How would I do this?
    number = 5;

    // Notice how the format is [variable name] = [value];

    // If I do this:
    int d = 5 / 2;
    // What is the value of d?

    // What about this?
    double division = 5d / 2;

    // Why can't we do:
    // boolean bool = 5 / 2;

    // Suppose we assign the following value onto x
    int x = (5 + 2) * 8 - 3 * 9; // what is the value of x?
    // We still follow order of operations:
    // 7 * 8 - 3 * 9
    // 56 - 27
    // 29

    // COMPARISONS

    // What are comparisons?
    // In math, comparisons are inequalities are equalities (for example they use the =, <, >, <=, or >= sign
    // to COMPARE two values). In computer science, they are the same meaning. We are comparing
    // two different values using inequalities.

    // Let's first do some basic comparison logic.

    // Is 5 > 3? true
    // Is 7 < 3? false
    // Is 9 ≥ 2? true! Keep in mind it is 9 is greater OR equal to 2. If one of the conditions
    // (greater than 2, or equal to 2) is true, then the whole statement is true.

    // In Java, the following comparison signs are used:

    // > -> greater than
    // < -> less than
    // >= -> greater than OR equal to. Notice how the ≥ symbol is NOT used.
    // <= -> less than OR equal to. Notice how the ≤ symbol is NOT used.
    // == -> equal

    // Obviously, comparison operators can only be true or false.

    boolean comparison = 5 > 2; // we are assigning the comparison 5 > 2 to the boolean
    // comparison. If it is true, then comparison will be true. Otherwise, it will be false.
    // Remember that booleans can only be true or false in Java.

    System.out.println(comparison); // If we print out the variable, it will return true
    // because 5 is greater than 2

    comparison = 5 < 3; // we can also reassign the variable of comparison (from above).
    // This will set it to be false because 5 is not less than 3.

    System.out.println(comparison); // false

    // We can also print the value directly. We don't have to assign it to a variable.
    System.out.println(9 < 8); // false

    // What will this print out?
    System.out.println(5 == 5); // true

    // What about this?
    System.out.println(7 > -1); // true


    // VARIABLE INCREMENTATION

    // Just like most languages, Java has an easy way to increment and decrement variables.
    // You remember how we had to assign variables right? Suppose we had a integer called
    // count:

    int count = 0;

    // We want to increase it by one. How can we do this?
    // Well, what we can do is get the original value of count, and add one to it. And then
    // assign that value to count. In code:

    count = count + 1;

    // The right side is ALWAYS computed first. Because count is 0 at the time, we have 0 + 1
    // is 1. This means we are assigning count to 1. We successfully incremented our variable
    // by 1. We can keep doing this so:

    count = count + 1; // count is 2 now
    count = count + 1; // count is 3 now
    // .. etc

    // However, Java has an easy way to do this.
    count++;

    // [variable name]++;

    // What count++ does is that it automatically increases the value of count by 1.
    // It is the exact same as "count = count + 1", but more simplified.


    // VARIABLE DECREMENTATION

    // Similar to incrementing a variable by 1, we can also decrement variables
    // in Java using a similar trick. When doing it manually, we could:
    count = count - 1; // we assign the value of (count - 1) to the count variable.
    // right side ALWAYS calculated first.

    count--;

    // [variable name]--;

    // What count-- does is that it automatically decreases the value of count by 1.
    // It is the exact same as "count = count - 1", but more simplified.


    // REVIEW

    // I want you to increment and decrement these variables. How would I increment?
    int incrementMe = 2;

    // How would I decrement?
    int decrementMe = 3;


    // COMPOUND OPERATORS

    // Now let's suppose we wanted to increment or decrement by something more than 1.
    // If we want to do this, we can no longer use count++, or count-- shown above.

    // For example, if we want to add 3, we could do something like this manually:
    int incrementThree = 0;
    incrementThree = incrementThree + 3;

    // But that is too long. That's why many other languages including Java added
    // what is called "compound operators". Does anyone know or want to take a guess
    // on what compound operators are?

    // Well, compound operators are a set of operators which makes it easy to increment
    // or decrement by a certain value without having to write the whole process
    // manually (like we did above with "incrementThree = incrementThree + 3;").

    // There are many kinds of compound operators. For example, there is an addition
    // compound operator, subtraction compound operator, multiplication compound operator,
    // etc. But they all do the same concept: They either add, subtract, or multiply (depending
    // on what the operation is) based on the value.

    // For example, the addition compound operator is "+="

    incrementMe += 3; // this is the exact same thing above "incrementThree = incrementThree + 3;"

    // The subtraction compound operator is "-="

    int decrementThree = 3;
    decrementThree -= 3; // this is the exact same thing above "decrementThree = decrementThree - 3;"

    // Can you guess what *= does?
    int mysteryCompound = 3;
    mysteryCompound *= 3;

    // HINT: * means multiply

    // The answer is that it multiplies the value by 3.

    // Overall, compound operators are a great way to simplify a lot of statements. Let's do some
    // problems:

    // What is the value of "mystery" after everything is executed?
    int mystery = 1;
    mystery++;
    mystery += 2;
    mystery--;

    // The answer is 3
    // mystery++;    -> Adds 1      --> 2
    // mystery += 2; -> Adds 2      --> 4
    // mystery--;    -> Subtracts 1 --> 3

    // What is the value of "mysteryPartTwo" after everything is executed?
    int mysteryPartTwo = 1;
    mysteryPartTwo *= 5;
    mysteryPartTwo /= 2; // HINT, / means divide
    mysteryPartTwo++;

    // The answer is 3
    // mysteryPartTwo *= 5;  -> Multiplies 5 --> 5
    // mysteryPartTwo /= 2;  -> Divides 2    --> 5 / 2 = 2 (Integer Division)
    // mysteryPartTwo++;     -> Adds 1       --> 3

    // Now let's try a hard one.
    // What is the value of "mysteryPartThree" after everything is executed?
    int mysteryPartThree = -1;
    mysteryPartThree *= -1;
    mysteryPartThree++;
    mysteryPartThree++;
    mysteryPartThree--;
    mysteryPartThree -= 5;
    mysteryPartThree += 6;
    mysteryPartThree /= 3;

    // The answer is 1
    // mysteryPartThree *= -1;  -> Multiples -1 -> 1
    // mysteryPartThree++;      -> Adds 1       -> 2
    // mysteryPartThree++;      -> Adds 1       -> 3
    // mysteryPartThree--;      -> Subtracts 1  -> 2
    // mysteryPartThree -= 5;   -> Subtracts 5  -> -3
    // mysteryPartThree += 6;   -> Adds 6       -> 3
    // mysteryPartThree /= 3;   -> Divides 3    -> 1

  }

}
