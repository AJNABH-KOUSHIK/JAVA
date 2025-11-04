public class CodeSnippets{
    public static void main(String[] args) {
--------------------- JAVA BASICS ------------------------------------
        System.out.println("Koushik"); // ✅
        System.out.println("234");     // ✅
        System.out.println('3');       // ✅
        System.out.println('35');      // ❌
        System.out.println('358');     // ❌
        System.out.println(3);         // ✅
        System.out.println(33);        // ✅
        System.out.println(358 + 2);   // ✅
        System.out.println(358 - 2);   // ✅
        System.out.println(358 * 2);   // ✅
        System.out.println(358 / 2);   // ✅
        System.out.println('9'+1);     // ✅ ASCI 57+1 
        System.out.println('A'+1);     // ✅ ASCI 65+1 
        System.out.println(A);         // ❌
        System.out.println('A');       // ✅ A
        System.out.println('Hello World'); // ❌
        System.out.println("Hello World"); // ✅
        System.out.println(System.out.println("Koushik")); // ❌
        ------------------------------------------------------------
        public static void main(String[] args)    // ✅
        public static void main(String args[])    // ✅
        public static void main(String ...args)   // ✅
        ------------------------------------------------------------
        public static void main()                 // ❌
        static void main(String[] args)           // ❌
        public void main(String[] args)           // ❌
        public static int main(String[] args)     // ❌
        public static void mian(String[] args)   // ❌
        public static void main(String args)     // ❌
        ------------------------------------------------------------
        public static void main(String[] args) {
        System.out.println("Koushik");
        }
        public static void main(String args) {
        System.out.println("Teja");              
        }                                       // ✅ Koushik
        public static void main(String args) {
        System.out.println("Teja");              
        }
        public static void main(String[] args) {
        System.out.println("Koushik"); 
        }                                       // ✅ Koushik
        ------------------------------------------------------------
        Scanner sc = new Scanner(System.in);     // ✅
        Scanner sc = new Scanner();              // ❌
        Scanner sc = new Scanner("Hello World"); // ✅
        ------------------------------------------------------------
        import java.util.*;  // ✅ Must be written manually
        import java.lang.*;  // ✅  Need not to write java takes automatically writing this also no prblm 
        import java.lang.Math;  // ✅  Maths
        import java.io.*;   // ✅  Input/Output classes
        import java.sql.*;   // ✅  JDBC for database connectivity
        import java.text.*;  // ✅  Formatting dates, numbers, messages 
        import java.time.*;  // ✅  Modern Date-Time API 
        import java.util.stream.*; // ✅    Stream API f
--------------------- JAVA STATIC ------------------------------------
        public static void main(String[] args) { // ❌ main method
        static int x = 10;  // ❌ Compilation error: illegal modifier for local variable
        }-----------------------
        public StaticDemo1() { // ❌ Constructor
        static int count = 0;  // ❌ Compilation error: illegal modifier for local variable
        count++;
         }-----------------------
        public void someMethod() { // ❌ Regular method
        static String name = "Ajnabh";  // ❌ Compilation error
        } -----------------------
        public class StaticDemo1 {
        static int count = 0;  // ✅ Static variable declared at class level
        public StaticDemo1() { // ✅ Constructor
        count++;  // ✅ Valid usage: modifying static variable
        }
        public static void main(String[] args) { // ✅ main method
        StaticDemo1 obj1 = new StaticDemo1();
        StaticDemo1 obj2 = new StaticDemo1();
        StaticDemo1 obj3 = new StaticDemo1();
        System.out.println("Number of objects created: " + count);  // ✅ Output: 3
        }
        ----- PYQ ----- PYQ ----- PYQ ----- PYQ ----- PYQ -----
        class Outer {
        private static String message = "Hello, World!";
        static class Nested { // private static class Nested { also same output
        private void display() { // Static nested classes can access private static members of the outer class... private static class Nested { also same output private static void display() also same output {
            System.out.println("Message: " + message);
        }
        }
        public static void main(String[] args) {
        Nested nested = new Nested();
        nested.display();
        }
        } // Message: Hello, World!
        ----- PYQ ----- PYQ ----- PYQ ----- PYQ ----- PYQ -----
--------------------- JAVA TYPECASTING -------------------------------
        int d = 99;
        byte i = (byte) d;  // ✅
        byte d = 99;
        int i = (int) d;   // ✅
        int big = 130;    // 00000000 00000000 00000000 10000010
        byte b = (byte) big; // 10000010
        System.out.println("Casted byte: " + b);  // Output: -126
        ----- PYQ ----- PYQ ----- PYQ ----- PYQ ----- PYQ -----
        public class Main {
        public static void main(String[] args) {
        double d = 99.99;
        int i = (int)d;  // ✅ Explicit type casting
        System.out.println(i);
        }
        }
        ----- PYQ ----- PYQ ----- PYQ ----- PYQ ----- PYQ -----
        }
    }
}
