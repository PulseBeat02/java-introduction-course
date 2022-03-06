package week14;

public class Methods {

  public static void main(String[] args) {

    // This week we are starting our second part of this course: object-oriented programming
    // Today we are mainly focusing on methods.

    // What is a method to start off with?
    // A method is a block of code that can be called multiple times with arguments (things
    // you can pass in).

    // They are useful for:
    // a) organizing your code to be more readable
    // b) save repetitions of code by just calling the method

    // When we call a method, we basically run it.

    // In any Java application, there is always one method which is first called when the
    // program starts. This is called the "main" method. This method is always called first
    // before anything is called. The "public static void main" part you see above is the
    // main method! That is why when you run the code with System.out.println("Hello World");
    // inside this method, it prints out!

    // LOOK BELOW FOR METHOD INFORMATION


    // CALLING A METHOD

    // Obviously, we need to call a method if we want to use it. How do we call a method?

    printSum(5, 5);

    // You call a method by calling its method name and then passing the arguments separated by commas.
    // For the above example, I am calling the "printSum" method, and passing two arguments which
    // are integers.

    // Another example could be the System.out.println method. This is a method too!
    System.out.println("Hello World");

    // I am calling the "println" method and passing "Hello World" to be an argument.

    // I want you to:
    // a) Create an integer "a" with the value 9
    // b) Create an integer "b" with the value 7
    // c) Call the "product" method using the two variables.
    int a = 9;
    int b = 7;
    product(a, b);

    // Obviously this won't do anything. We know the product method returns an integer, but
    // we don't do anything with that result! We can either assign that to a variable, or just
    // directly pass it into another method.

    int product = product(a, b);

    // OR

    System.out.println(product(a, b));

    // That way, we are using our method output properly. However, we can't do that for void
    // functions. Void functions don't return anything, so we can't assign them to a variable
    // or pass them into another method.

    // For example, you can't do this:

    // System.out.println(printSum(5, 5));


    // PROBLEM SET

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
  }

  // (1)
  static double geometricMean(double a, double b, double c) {
    double product = a * b * c;
    return Math.sqrt(product);
  }

  // (2)
  static double averageMean(double a, double b, double c) {
    double sum = a + b + c;
    return sum / 3;
  }

  // (3)
  static boolean amGM(double a, double b, double c) {
    double geometric = geometricMean(a, b, c);
    double average = averageMean(a, b, c);
    return average > geometric;
  }


  // A very simple method looks like the following:
  int sum(int first, int second) {
    return first + second;
  }

  // [return type] [method name] (parameters) {
  //    // do some logic..
  //    return something...;
  // }

  // The parameters are basically things we pass into the method, and we do something with them.
  // For example, we have two parameters in the above method: first, and second. They are both
  // integers because we specified their types to be int.

  // The return value of a method is what you are returning from the method. For example, I am
  // specifying the return type to be "int", meaning that I have to always return an integer. We
  // use return [X] to return a value from a method.

  // Now suppose you don't want to return anything. How would you do that? You would use "void"
  // in place of the return type.
  void print() {
    System.out.println("Hello World!");
  }

  // Void basically allows you to run any logic inside the method without requiring you to return
  // anything from the method.

  // In the following methods, identify the:
  // a) name of the method
  // b) return type of the method
  // c) arguments of the method

  double average(int a, int b, int c) {
    return (a + b + c) / 3d;
  }

  void hi() {
    System.out.println("H");
    System.out.println("I");
  }

  String intellij(String a, long b, double c) {
    return "intellij";
  }

  String twosday() {
    return "2/22/22:22:22";
  }

  void little(int b) {
    System.out.println(b + 2);
  }

  long loooongNumber(long l, long l2, long l3, long l4) {
    return Long.MAX_VALUE;
  }


  // You cannot have methods in methods. For example, the following is not allowed:

//  void little(int b) {
//    void big(int b) {
//      System.out.println(b + 2);
//    }
//  }

  // VARARGS
  // There are methods which can sometimes have varargs. An example of varargs can be found
  // here:
  void varargs(int... infiniteArguments) {
    System.out.println(infiniteArguments.length);
  }

  // Varargs allow you to pass as many arguments as you want into the method. For example, you can
  // pass 2 integers, 5 integers, 1000 integers, or no integers into the method, and it will still
  // function. The only thing to keep in mind is that all the arguments must be the type. Also, the
  // varargs part must be the last parameter in a function, and there cannot be more than 1 vararg.
  // Treat the variable like an array. For example, the following function above is the same as:

//  void varargs(int[] infiniteArguments) {
//    System.out.println(infiniteArguments.length);
//  }

  // For example, you can't do:

//  void varargsError(int... infiniteArguments, String d) {
//    // illegal
//  }

  // or

//  void varargsError2(int... infiniteArguments, String... moreInfiniteArguments) {
//    // illegal
//  }


  // Now let's write your own method!

  // I want you to write a method which subtracts two integers from each other. Make the method
  // have two arguments that are both integers and return an integer. Name the method "subtract".
  static int subtract(int a, int b) {
    return a - b;
  }

  // Write a method that multiples two numbers together that are integers. Make it return an integer.
  // Name this method "product".
  static int product(int a, int b) {
    return a * b;
  }

  // Write a method that prints out the addition of two numbers. You do not have to return anything.
  // Name this method "printSum".
  static void printSum(int a, int b) {
    System.out.println(a + b);
  }

  // Write a method which accepts a vararg integer. Print out the first element of the vararg. You do
  // not have to return anything. Name this method "varargExample".
  static void varargExample(int... vararg) {
    System.out.println(vararg[0]);
  }

  // MODIFIERS

  // Methods can also have special modifiers such as final, static, volatile, etc. You don't need to know
  // what each of these modifiers do at the time being but they are placed before the return type. For
  // example:
  static void exampleStaticMethod() {
    System.out.println(1 + 2);
  }

  // For all the above methods you have written, I want you to add the static modifier to them.
}
