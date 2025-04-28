import java.rmi.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String url = "rmi://localhost/Server";

            ServerIntf serverIntf = (ServerIntf) Naming.lookup(url);

            System.out.println("Enter num1 ");
            int a = sc.nextInt();

            System.out.println("Enter num2 ");
            int b = sc.nextInt();

            // System.out.println("Enter str1 ");
            // String str1 = sc.nextLine();

            // System.out.println("Enter str2 ");
            // String str2 = sc.nextLine();

            System.out.println("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            System.out.println("Celsius to Fahrenheit: " + serverIntf.celsiusToFahrenheit(celsius));

            System.out.println("Enter distance in Miles: ");
            double miles = sc.nextDouble();
            System.out.println("Miles to Kilometers: " + serverIntf.milesToKilometers(miles));

            System.out.println("Enter a number to calculate factorial: ");
            int n = sc.nextInt();
            System.out.println("Factorial is: " + serverIntf.factorial(n));

            System.out.println("Enter a word to count vowels: ");
            sc.nextLine(); // Consume the newline
            String word = sc.nextLine();
            System.out.println("Number of vowels: " + serverIntf.countVowels(word));

            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println(serverIntf.appendHello(name));

            System.out.println("Enter first string: ");
            String str1 = sc.nextLine();
            System.out.println("Enter second string: ");
            String str2 = sc.nextLine();
            System.out.println("Lexicographically largest string: " + serverIntf.getLexicographicallyLargest(str1, str2));
                        
            System.out.println("Add is " + serverIntf.addition(a, b));

            System.out.println("sub is " + serverIntf.substraction(a, b));

            System.out.println("mul is " + serverIntf.multiplication(a, b));

            System.out.println("div is " + serverIntf.division(a, b));

            System.out.println("square is " + serverIntf.square(a));

            System.out.println("squar root is " + serverIntf.squareroot(b));

            System.out.println(serverIntf.palindrome(str1));
            
            System.out.println(serverIntf.isequalstring(str1, str2));

        } catch (Exception e) {
            System.out.println("Exception at Client " + e);
        }
        sc.close();
    }
}
