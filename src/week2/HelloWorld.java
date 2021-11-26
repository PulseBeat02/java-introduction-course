package week2;

public class HelloWorld {

  public static void main(String[] args) {

    // In Java, comments are written with //. Comments are useful because they allow us to
    // take notes on the code we write.

    // To make a large comment (also known as a block comment), we use /* and end with */

    /*

    My block comment

     */

    // Welcome to Java Introduction Course, let's start off with printing to the console.
    System.out.println("Hello World");

    // To run the program, click on the green arrow next to the "main" line
    // OUTPUT: Hello World

    // what do you notice?
    // all statements end with semicolons in Java
    // think the semicolon as a "period" in English.
    // I walked to the park.

    // Now let's change it to something else!
    System.out.println("Hello Class");

    // After running, notice how it changes the output to "Hello Class"
    // "Hello Class" is known as a String. A String is a combination of characters
    // Each character of Hello Class is H, E, L, L, O, " ", C, L, A, S, S, and when
    // combined forms the "Hello Class" String.

    // ===========================
    // VARIABLES
    // ===========================

    // Now let's define some variables. What are variables?
    // Similar to math, variables are a symbol which represents a value

    // In Java, you can separate these variables into different categories. These
    // categories include String (described above), char (character), int (integer), float (decimal),
    // double (decimal), short (short), and boolean (true or false).

    // These types of variables are known as primitives. The only exception to this is
    // String. You will notice that primitive keywords will be bolded a specific color.

    // Today, we will be focusing on int, String, char, double, and boolean.

    // Let's assign a variable!
    // The proper way to assign a variable in Java is
    // [type] [variable name] = [value]
    // Variable names have restrictions. For example:

    // Variables cannot **start** with a number or special character!

    // int 5mynumber = 5; this won't work
    // int .number = 2; this won't work either!

    // They also cannot be a keyword in Java! You can't
    // define something like int int = 5;

    // ===========================
    // STRING
    // ===========================

    // for example, when defining a String, we can use.

    String str = "Hello World";
    // ^    ^         ^
    // Type Name     Value

    // Notice how the text has two quotations surrounding it. This is the definition
    // of a String. Now let's try characters.

    // Create a String, and paste it into Zoom chat!

    // ===========================
    // CHARACTER
    // ===========================

    char character = 'a';
    // Notice how the character has single quotes surrounding it. This is how you
    // define a character.

    // Create a character, and paste it into Zoom chat!

    // char notWorkingCharacter = 'ad'; this won't work because 'ad' isn't a character!
    // 'ad' is two characters combined. 'a' and 'd'. You can only define one character.

    // ===========================
    // INTEGER
    // ===========================

    // Let's try making an integer!
    // The integer must be a whole number, and must be between -2147483648 to 2147483647
    int integer = 0;
    // int b = -20;
    // int c = 30;
    // int d = 0.5; this won't work because it's a decimal!
    // int e = 10000000000000; this won't work because it's out of bounds

    // Create an integer, and paste it into Zoom chat!

    // ===========================
    // DOUBLE
    // ===========================

    // Let's say that we wanted to assign a double. A double is a decimal, and it must be
    // between 4.94065645841246544e-324d to 1.79769313486231570e+308d.

    // The e represents scientific notation. For example, the number that comes after e is the
    // power being raised. For example, 5e8 is equal to 5 * 10^8 (where ^ is power).

    double decimal = 5.5;
    // double g = -0.1;
    // double h = 5.00005;
    // double i = 5; this works because "5" is technically still a decimal! (converted to 5.0)

    // Create a decimal, and paste it into Zoom chat!

    // ===========================
    // BOOLEAN
    // ===========================

    // Booleans are a data type which stores true and false.
    // This is similar to binary, where bits can be "on" or "off". 1 for on, 0 for off
    boolean myBoolean = true;
    boolean myBooleanTwo = false;
    // boolean d = 0.5; // this won't work because boolean can be only assigned to "true" or "false"

    // Create a boolean, and paste it into Zoom chat!

    // Again, notice that all the variables above are always [type] [name] = [value]

    // Obviously, we have to use variables somehow. We can't just define them and not use them right?
    // We can print out the variables

    System.out.println(character); // print out the character
    System.out.println(integer); // print out the integer
    System.out.println(decimal); // print out the decimal

    // tip: control slash on selected code to make the whole code commented out. Commented out code is
    // not ran!

    // ===========================
    // RE-ASSIGNING VARIABLES
    // ===========================

    // In programming, variables are called variables because their value can vary, and change.
    // Suppose we want to change the variable. How do we do that?
    // The format is as follows:
    // [variable name] = [new value]
    // The new value MUST always be the same type for what it is defined originally!
    // For example, if we defined it as an integer originally, the new value must also be an integer

    int before = 5; // define an integer called "before" with value 5
    System.out.println(before); // print out the value before
    before = 2; // assign it to a new value 2. Notice how that 2 is also an integer!. This is called reassigning.
    System.out.println(before); // print out the new value after reassigning!

    // before = 2.1; <-- this won't work
    // before = false; <-- this won't work

    // We can't do before = 2.1 because 2.1 is a decimal, and we set the original value to be integer!

    // We can also assign variables to be other variables!

    before = integer; // we assign the current value of integer to before
    // In general, both integer and before have to be the same type (for example, they both
    // are integers), and we can't assign integer to before if before is a decimal, but there
    // are some exceptions. (We won't cover those today).

    // Let's test your knowledge

    // int whatGoesHere = ?; what can go into ?
    // double whatGoesHereTwo = ?; what can go here?
    // boolean whatAboutHere = ?; what about here?

    // ===========================
    // MATH OPERATIONS
    // ===========================

    // math operations can also be applied onto our variables.

    // When using math operations in Java, the numbers that we are
    // using MUST be the same as the type of variable we are assigning to.

    // Math operations can only be applied to numerical primitives. So this means
    // int, double, float, and short.

    // For example:
    int example = 2 + 2;
    // ^          ^   ^
    // integer    int int

    // Example is assigned to be type "integer". And our operations are ints only.
    // Something like 'int example = 2.5 * 2.5;' wouldn't work.

    // The following operators are for each math operation:

    // addition -> +
    // subtraction -> -
    // multiplication -> *
    // division -> /

    int addition = 5 + 5;
    double addition2 = 2.5 + 2.5;
    System.out.println(addition); // 10

    // what is addition if we assign it to be 5 + 5 + 5 + 5?
    // 20

    int subtract = 5 - 3;
    System.out.println(subtract); // 2

    // what is subtract if we assign it to be 5 - 5 - 5 - 5?
    // -10

    int multiplication = 5 * 5;
    System.out.println(multiplication); // 25

    // what is multiplication if we assign it to be 5 * 5 * 5 * 5?
    // 625

    // What about division?

    int result = 5 / 2; // we assign the value of "5 / 2" to our variable
    // think of "5 / 2" as our value

    System.out.println(5 / 2);

    // If you thought it is 2.5, you are actually wrong. It is 2.
    // Does anyone want to guess why?

    // The reason for this is because of what is called integer division. Because we set the
    // type of variable to be an int (integer), the result of the division also must be an
    // integer as well. By default, Java will round down to the nearest integer when performing
    // integer division IF your result is positive, and the opposite IF your result is negative.

    // Let's do some examples with integer division:

    result = 5 / 3; // we can also assign math expressions to variables too. What will be the new value of result?
    result = 6 / 2; // what about this?

    System.out.println(-5 / 2);

    result = -1 / 2; // what about this?
    result = -1 / -2; // what about this?


    // ===========================
    // CHAINING MATH OPERATIONS
    // ===========================

    result = 5 * (5 + 2) - 3; // what about this?
    System.out.println(result);

    // if you said 32, you would be correct. Java prioritizes parenthesis first, then division/multiplication, and finally addition/subtraction.

    result = 5 / 2 + 3; // what about this?
    System.out.println(result);

    // be careful here. The division goes first, however, we must remember that since the result of 5 / 2 is positive, it rounds down! So that means
    // that 5 / 2 is equivalent to 2. Then we add the 3 to it to get our answer -- 5. Let's try some more complex expressions.

    result = 5 * 5 * 5 + (2 + 3 / 2);
    // 3 / 2 -> 1
    // 2 + 1 -> 3
    // 5 * 5 * 5 -> 125
    // 125 + 3 -> 128


  }

}
