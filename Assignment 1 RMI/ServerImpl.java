import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {

    public ServerImpl() throws RemoteException {
    }

    public int addition(int a, int b) throws RemoteException {
        return a + b;
    }

    public int substraction(int a, int b) throws RemoteException {
        return a - b;
    }

    public int division(int a, int b) throws RemoteException {
        return a / b;
    }

    public int multiplication(int a, int b) throws RemoteException {
        return a * b;
    }

    public int square(int a) throws RemoteException {
        return a * a;
    }

    public int squareroot(int a) throws RemoteException {
        return (int) (Math.sqrt(a));
    }

    public String palindrome(String str) throws RemoteException {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if (str.equals(sb.toString())) {
            return "String is Palindrome!";
        } else {
            return "String is Not Palindrome!";
        }
    }
    
    public String isequalstring(String str1, String str2) throws RemoteException {
        if (str1.equals(str2)) {
            return "String is equal!";
        } else {
            return "String is not equal!";
        }
    }

    public String appendHello(String name) throws RemoteException {
        return "Hello " + name;
    }

    public String getLexicographicallyLargest(String str1, String str2) throws RemoteException {
        return (str1.compareTo(str2) > 0) ? str1 : str2;
    }

    public double celsiusToFahrenheit(double celsius) throws RemoteException {
        return (celsius * 9 / 5) + 32;
    }

    public double milesToKilometers(double miles) throws RemoteException {
        return miles * 1.60934;
    }

    public int factorial(int n) throws RemoteException {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public int countVowels(String word) throws RemoteException {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

}
