package week11;

public class Strings {

  public static void main(String[] args) {

    // REVIEW
    String str1 = "a";
    String str2 = "";
    str2 += "a";
    System.out.println(str1 == str2); // what should this print out?

    str2 = str1;
    System.out.println(str1 == str2); // what should this print out?

    String str3 = "a";
    System.out.println(str2.equals(str3)); // what should this print out?

    int a = 5;
    int b = a;
    System.out.println(a == b); // what should this print out?

    // Reviewing the difference between objects and primitives:
    // Fill in the empty spaces in the table.

    // IN SUMMARY (Let's make a table)
    //  _________________________________________________________
    //  |       PRIMITIVES       |            OBJECTS           |
    //  |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
    //  | int, double, etc       | String, etc                  |
    //  |                        |                              |
    //  | comparing VALUE -> (1) | compare CONTENT -> (2)       |
    //  |                        |                              |
    //  | NO MEMORY ADDRESSES    | compare MEMORY ADDRESS -> == |
    //  |                        |                              |
    //  | int x = y -> copies    | String x = y -> copies       |
    //  | (3) of y to x          | (4) of y to x                |
    //  ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾

    // (1) -> ==
    // (2) -> .equals
    // (3) -> VALUE
    // (4) -> MEMORY ADDRESS

    // What does == compare for objects? What does == compare for primitives?

    // Is the memory address of test3 the same as test1?
    String test1 = "address1";
    String test2 = test1;
    String test3 = test2;

    // What do we get if we print test3?


    // USEFUL STRING METHODS

    // The String class contains many useful methods. Some of these methods include:
    // String#replace, String#substring, String#indexOf, String#lastIndexOf



    // String#REPLACE
    // Replaces a character OR String inside a String:
    System.out.println("abca".replace('a', 'b')); // bbcb
    System.out.println("I hate ice cream".replace("hate", "love")); // I love ice cream

    // Replace every "eat" in "dogeatbone dogeatbone" with "fetch"
    System.out.println("dogeatbone dogeatbone".replace("eat", "fetch"));

    // Replace every '\\' "\\My\\name\\is\\Bob" with ' '
    System.out.println("\\My\\name\\is\\Bob".replace('\\', ' '));



    // String#SUBSTRING
    // Takes a specific portion from the String, where the beginning index is INCLUSIVE
    // and the ending index is EXCLUSIVE.

    // If a String had the content "abcdefg"
    // a -> index 0
    // b -> index 1
    // c -> index 2
    // etc..

    // What would be the character at index 5 for the above String?
    // index 5 -> f

    // Suppose you want to extract the "abc" part out of "abcd"
    // The starting index would be 0 because you want to start from the first
    // character. The ending index would be 3 because it is EXCLUSIVE, meaning
    // that the last character included would be the character before index 3,
    // or index 2 (which is 'c')
    System.out.println("abcd".substring(0, 3)); // abc

    // Extract the last three characters of a String
    // test -> "est"
    // apple -> "ple"
    // intellij -> ?
    String intellij = "intellij";
    int length = intellij.length();
    System.out.println(intellij.substring(length - 3, length));

    // Extract the last character of a String
    // test -> "t"
    // apple -> "e"
    // banana -> ?
    String banana = "banana";
    int len = banana.length();
    System.out.println(banana.substring(len - 1, len));



    // String#INDEXOF
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

    // Get the first index of "mode" of a String
    // "modemode" -> 0
    // "coolmode" -> 4
    // "ironmanmode" -> 7
    // "chillmode" -> ?
    System.out.println("chillmode".indexOf("mode"));



    // String#lastIndexOf
    // Exactly the same of String#indexOf, but pretty much just the opposite.
    // It looks for the last String inside the big String rather than the first one.
    // You can also pass a second argument for an integer for this method. Basically
    // the integer defines the index that it should start searching for the String. It
    // then proceeds to search backwards from that index.
    System.out.println("ilovecabscabs".lastIndexOf("cabs", 9));

    // Get the last index of "paper" of a String
    // "paperpaper" -> 5
    // "papermc" -> 0
    // "takepaper" -> ?
    System.out.println("takepaper".lastIndexOf("paper"));

    // Get the second to last index of "paper" of a String
    // "paperpaperpaper" -> 5
    // "papermcpaper" -> 0
    // "paperrollpaperonpaper" -> ?

    // HINT: You need to use the lastIndexOf method twice:
    String paper = "paperrollpaperonpaper";
    int last = paper.lastIndexOf("paper");
    System.out.println(paper.lastIndexOf("paper", last - 1));


    // ADVANCED PROBLEM SET

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
      String prefix = word.substring(0, 3);
      if (prefix.equals("pre")) {
        count++;
      }
    }
    System.out.println(count);
  }
}
