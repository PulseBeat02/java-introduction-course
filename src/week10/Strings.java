package week10;

public class Strings {

  public static void main(String[] args) {

    // QUICK REVIEW

    // Print out:
    // "Hello
    // World"
    // using only one System.out.println statement
    System.out.println("Hello \n World");

    // Print out \Hi with the backslash
    System.out.println("\\Hi");

    // Print out: I have [#] apples. (Replace [#] with the variable)
    int apples = 20;
    System.out.println("I have " + apples + " apples");

    // Print out: 5 less than the apples I have is [# - 5] apples. (Replace [# - 5] with 5 subtracted from the variable )
    System.out.println("5 less than the apples I have is " + (apples - 5) + " apples");

    // Which of the following produces the desired output?
    System.out.println("5 + 2 = " + (5 + 2));
    System.out.println("5 + 2 = " + 5 + 2);


    // REVIEWING == VS .EQUALS

    // In Java, we have two types of variables. Primitives and Objects.
    // Primitives are lowercase variables such as int, long, double, etc.
    // Objects are classes such as String

    // When we want to compare if two primitives are equal, we use the ==
    // operator.

    // However, when checking if two objects are equal (for example String),
    // we mainly use the .equals method

    int number1 = 5;
    int number2 = 5;
    // comparing primitives (int's)
    System.out.println(number1 == number2);


    String hello1 = "Hello";
    String hello2 = "Hello";
    // comparing objects (String is a class, which is an object)
    System.out.println(hello1.equals(hello2));


    // What if we try comparing hello1 and hello2 using == instead
    // of .equals?
    System.out.println(hello1 == hello2); // prints true

    // You may ask why can't we use == instead of .equals?

    // Let's try this example:
    String first = "lot";
    first += "s"; // add s to the String (becomes "lots" now)
    String second = "lots";
    System.out.println(first == second); // prints false

    // Why does it print false?
    // The reason why it prints false is because of String interning. This is
    // an important reason why we cannot compare these String's using ==. It
    // won't always work.

    // However, if we use .equals, we are guaranteed to always have the two
    // content to be compared and not risk getting an inaccurate result.

    // You may ask, even in the first place, what is the point of using ==
    // for objects then?

    // https://3.bp.blogspot.com/-KEIYp310Uds/WvZwpRtq5AI/AAAAAAAALV0/Gb6KNX5nJ2IIkvW2MGFUwv5zxqtX-utqwCLcBGAs/w613-h337/equals%2Bvs%2Bequality%2Boperator%2Bin%2BJava.png
    // In the image above, notice how each String belongs to some spot
    // inside the memory. We call this spot inside the memory the
    // "memory address" (address as in place where it is located, etc).

    // If you notice, each object has its own address inside the memory.

    // You can have two Strings which have different addresses in the memory,
    // but have the same content. For example, let's say I have a String with
    // the content "hello" that belongs to memory address #1. I can have another
    // String with the content "hello" that belongs to memory address #5. In other
    // words, we can have duplicate objects at different places inside the memory.

    // Now suppose we wanted to compare the actual references of two objects
    // rather than the content. For example:

    // "Hello" (first String)     ----------> Memory Address #1
    // "Hello" (second String)   ----------> Memory Address #2

    // And you want to compare to see if the memory address of the first String is the same
    // as the second String.

    // That's the proper use of == for objects! For objects, == is used to compare the
    // memory addresses of two objects! (it compares their location inside the memory)

    // IMPORTANT NOTE:
    // Suppose we have the following:
    String s = "Dog"; // (suppose this variable has memory address #1)
    // If we assign a variable to another object, we are setting their memory addresses
    // to be equal to each other.
    String sameMemoryAddressAsS = s; // (sameMemoryAddressAsS also has memory address #1 now)
    System.out.println(s);
    System.out.println(sameMemoryAddressAsS); // points to memory address #1 (String s)

    // NOTE THAT IS DIFFERENT FROM PRIMITIVES. PRIMITIVES WILL JUST COPY THE VALUE
    // OVER TO THE NEW VARIABLE. OBJECTS DO NOT DO THIS!!!!!!

    // PRIMITIVES DO NOT HAVE MEMORY ADDRESSES!!! ONLY OBJECTS DO!!

    String firstDemo = "Hello";
    String secondDemo = firstDemo;
    // we are checking if the memory addresses are equal
    System.out.println(firstDemo == secondDemo); // returns true


    // IN SUMMARY (Let's make a table)
    //  _________________________________________________________
    //  |       PRIMITIVES       |            OBJECTS           |
    //  |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
    //  | int, double, etc       | String, etc                  |
    //  |                        |                              |
    //  | comparing VALUE -> ==  | compare CONTENT -> .equals   |
    //  |                        |                              |
    //  | NO MEMORY ADDRESSES    | compare MEMORY ADDRESS -> == |
    //  |                        |                              |
    //  | int x = y -> copies    | String x = y -> copies MEMORY|
    //  | VALUE of y to x        | ADDRESS of y to x            |
    //  ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾

    // Obviously, primitives do have a memory address natively (or else
    // they wouldn't exist in the program). But they are handled differently
    // compared to object memory addresses.

    // PROBLEM SET AND QUESTIONS:

    // What is the difference between a primitive and an object?
    // What does == compare for objects? What does == compare for primitives?

    String str = "Demo";
    String copy = str;
    System.out.println(copy == str); // prints true

    int num = 5;
    int copyNum = num;
    copyNum = 6;
    System.out.println(num == 6); // prints false

    String firstString = "first";
    String secondString = "first";
    System.out.println(firstString == secondString); // prints true (why? - String interning)

    String firstContent = "Dog";
    firstContent += "e";
    String secondContent = "Doge";
    System.out.println(firstContent == secondContent); // prints false





    // USEFUL STRING METHODS

    // The String class contains many useful methods. Some of these methods include:
    // String#replace, String#substring, String#indexOf, String#lastIndexOf

    // String#replace
    // Replaces a character inside a String:
    System.out.println("abca".replace('a', 'b')); // bbcb

    // String#substring
    // Takes a specific portion from the String, where the beginning index is INCLUSIVE
    // and the ending index is EXCLUSIVE.

    // If a String had the content "abcd"
    // a -> index 0
    // b -> index 1
    // c -> index 2
    // etc..

    // Suppose you want to extract the "abc" part out of "abcd"
    // The starting index would be 0 because you want to start from the first
    // character. The ending index would be 3 because it is EXCLUSIVE, meaning
    // that the last character included would be the character before index 3,
    // or index 2 (which is 'c')
    System.out.println("abcd".substring(0, 3)); // abc

    // String#indexOf
    // Returns the first index of a String for a String.
    // For example, if we wanted to find where the String "bc" is located inside
    // a bigger String: (RETURNS -1 IF THE STRING CANNOT BE FOUND)
    System.out.println("abcd".indexOf("bc")); // returns 1

    // You can also pass a second argument. The second argument is an integer
    // and it specifies where to start looking. For example, if you had the
    // String "abcabcabc", and you wanted to get the second "cab" and not
    // the first "cab" inside the String, you could so something like:
    // (RETURNS -1 IF THE STRING CANNOT BE FOUND)
    System.out.println("abcabcabc".indexOf("abc", 5));

    // String#lastIndexOf
    // Exactly the same of String#indexOf, but pretty much just the opposite.
    // It looks for the last String inside the big String rather than the first one.
    // You can also pass a second argument for an integer for this method.
    System.out.println("ilovecabscabs".lastIndexOf("cabs", 9));

    // PROBLEMS

    // In the following String:
    String carInfo = "Red|Red|Honda|SUV";

    // Get the index of the SECOND "Red" part of the String
    System.out.println(carInfo.indexOf("Red", 3));

    // Get the substring "Honda" part of the String
    System.out.println(carInfo.substring(8, 13));

    // Replace all the pipe characters ('|'), with semi-colons
    System.out.println(carInfo.replace('|', ';'));

    // FINAL PROBLEM SET

    // Given the following data
    String[] data = {"Spigot", "Paper", "Bukkit", "Waterfall"};

    // Write a program which tries to find the index of "Paper" inside the array.
    // HINT #1: Use a normal for loop
    // HINT #2: Use String#equals to check if a String equals "Paper"

    for (int i = 0; i < data.length; i++) {
      String word = data[i];
      if (word.equals("Paper")) {
        System.out.println(i);
        break; // why do we break here?
        // We break here because we already found the element, and it isn't necessary
        // to keep looping through the array anymore.
      }
    }

    // Suppose you have a String[] with the following words:
    String[] words = {"prefix", "prender", "teacher", "professional", "prey"};

    // Write a program which checks if the first 3 letters of any element inside
    // the array is "pre".
    // HINT #1: Use String#substring to get the first 3 characters
    // HINT #2: Use String#equals to check if your substring is equal to "pre"

    int count = 0;
    for (String word : words) {
      String three = word.substring(0, 3);
      if (three.equals("pre")) {
        count++;
      }
    }
    System.out.println(count);
  }

}
