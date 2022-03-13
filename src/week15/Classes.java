package week15;

public class Classes {

  public static void main(String[] args) {

    // METHODS REVIEW

    // [return type] [method name] (parameters) {
    //    // do some logic..
    //    return something...;
    // }

    // AVERAGE MEAN VS GEOMETRIC MEAN

    // (1) Create a method called "geometricMean," which accepts three doubles. Return the geometric
    // mean of all three of these numbers in the method (and return a double). The geometric mean is
    // calculated by multiplying all numbers together and taking the square root of the product.
    // Use the Math.sqrt method to find the square root of a value. For example:
    double root = Math.sqrt(4);

    // (2) Create a method called "averageMean," which accepts three doubles. Return the average
    // of all three of these numbers in the method and return a double. The average is calculated
    // by adding all the numbers together and dividing it by the number of elements you have.

    // (3) Create a method called "amGM," which accepts three doubles. Using the methods you
    // created above ("geometricMean" and "averageMean"), return true if the averageMean is greater
    // than the geometricMean. Otherwise, return false.

    // (4) Add the "static" modifier to all 3 methods you have created above. Right below here,
    // call the amGM method with the values 0.1, 0.5, and 20, and print out the result.
    boolean result = amGM(0.1, 0.5, 20);
    System.out.println(result);

    // CLASSES

    // What is a class in a programming language?
    // A class is a blueprint for some object. Think of it like houses. You first create
    // a blueprint for the house in order to prepare the length of the walls, where to place
    // a door, etc. Then you do the actual building after.

    // Similarly, in Java, the class is a blueprint. You use this class (blueprint) to create
    // objects in Java.

    // For example, the String class:
    String str = "Hello World";

    // If you open the source code for the String class, you will notice that it has the "class"
    // heading on top. Everything in Java is a class.

    // The blueprint has things that store data. Just like we have dimensions of a walls for
    // a blueprint for a house, in a String class, we have a character array storing each
    // character.

    // When we actually use this blueprint, we create an object called an "instance". The "instance"
    // is something that is in the memory. The class is just the code itself, while the instance
    // is the actual object (like the house).

    // To make an "instance", we use the new keyword. For example:
    String example = new String("hello");

    // You may ask then what is the difference between:

    // String example = new String("hello");
    // AND
    // String example = "hello";

    // There isn't. String is the only exception to this where you can just define it without new. It
    // is just so it is easier to define String's for programmers.

    // Copy the code below into your IDE.

    class NumberStorer {

      int number;

      NumberStorer() {
        this.number = 0;
      }

      void setNumber(int number) {
        this.number = number;
      }

      int getNumber() {
        return number;
      }
    }

    // Create an instance of the NumberStorer class.

    // [type] [variable name] = new [type]();
    NumberStorer storer = new NumberStorer();

    // call the setNumber method, and pass the argument 5 to it. How we call this on an object
    // is we use the variable, then add a "." and then the method name.
    storer.setNumber(5);

    int number = storer.getNumber(); // Gets the number inside NumberStorer
    System.out.println(number); // Prints the number out

    // Let's divide each part of the class:

//    class NumberStorer {                <---- We are defining a class with the name "NumberStorer"
//                                                this line is known as the class header.
//      int number;                       <---- We create a variable "number" to store an integer.
//                                                this variable is called a "field".
//      NumberStorer() {                  <---- This is called a constructor. We will have more
//        this.number = 0;                        details on what this is below.
//      }
//
//      void setNumber(int number) {      <---- We create a method called "setNumber" to set the number
//        this.number = number;           <---- Sets the number to the number
//      }
//
//      int getNumber() {                 <---- We create a method called "getNumber" to get the number
//        return number;                  <---- Returns the number inside the class
//      }
//    }

    // Notice how that anywhere in the class, we are able to use the "number" variable. You may
    // be asking a lot of questions, however.

    // What is the "this" keyword?
    // This "this" keyword is a keyword that refers to its own object. Similar to self in Python,
    // it allows you to access all variables and methods within that class. For example, using
    // "this.number", will access the number variable inside the NumberStorer class. This isn't
    // only for variables, but for methods too. Using "this.getNumber()" will return the value
    // of the number. This keyword only works however if you are within the class. For example,
    // in this case, you can only use this.number if you are using it inside the NumberStorer class.
    // Otherwise, you cannot.

    // Methods in a class?
    // Yes, absolutely. Classes can have methods, and they follow the same exact format as we
    // described last week.

    // What is a constructor?
    // Similar to init in Python, a constructor is a type of method that is ALWAYS called first
    // after we call "new" on it. We can pass arguments to it if we want to. We, however,
    // cannot return anything from the constructor. The default format for it is [class name](arguments).

    // For example, for the NumberStorer class above, we have NumberStorer(), and we don't have
    // anything inside the parenthesis because we aren't doing anything with the arguments.

    // Usually in the constructor, we assign any necessary variables inside. For example, we can
    // use "this.variable" here, and use "this.variable = ..." to assign it from some argument.

    // As an example, take a look at the following class which stores a coordinate.

    class Coordinate {

      int x; // "x" integer variable
      int y; // "y" integer variable

      Coordinate(int xCoord, int yCoord) { // Constructor here. We pass in two variables "x" and "y"
        this.x = xCoord; // "this.x" to refer to our x variable
        this.y = yCoord; // "this.y" to refer to our y variable
      }

      int getX() { // Method to return the x coordinate
        return x;
      }

      int getY() { // Method to return the y coordinate
        return y;
      }
    }

    // Now let's create our own class step by step!

    // Let's create a class that stores three numbers. The class will be named "Triple".

    // Step #1: I want you to define the class header.

//      class Triple {
//      }

    // Step #2: Define three variables inside the class. Name these variables a, b, and c, and
    // make them integers.

//      class Triple {
//        int a;
//        int b;
//        int c;
//      }

    // Step #3: Add a constructor for the class. Pass three arguments, each being an integer.
    // Name them "a", "b", and "c". Inside the constructor method, use "this.a", "this.b", etc to
    // assign the variables.

//      class Triple {
//
//        int a;
//        int b;
//        int c;
//
//        Triple(int a, int b, int c) {
//          this.a = a;
//          this.b = b;
//          this.c = c;
//        }
//      }

    // Step #4: Add three methods for returning the value of a, b, and c. Name these methods
    // "getA", "getB", and "getC". They should each return an integer.

    class Triple {

      int a;
      int b;
      int c;

      Triple(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
      }

      int getA() {
        return this.a;
      }

      int getB() {
        return this.b;
      }

      int getC() {
        return this.c;
      }
    }

    Triple triple = new Triple(0, 1, 2);
    System.out.println(triple.getA());
    System.out.println(triple.getB());
    System.out.println(triple.getC());

  }

  // (1)
  static double geometricMean(double a, double b, double c) {
    double product = a * b * c;
    return Math.sqrt(product);
  }

  // (2)
  static double averageMean(double a, double b, double c) {
    double sum = a + b + c;
    return sum / 3d;
  }

  // (3)
  static boolean amGM(double a, double b, double c) {
    double geometric = geometricMean(a, b, c);
    double average = averageMean(a, b, c);
    return average > geometric;
  }
}
