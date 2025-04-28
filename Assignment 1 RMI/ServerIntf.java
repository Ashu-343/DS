import java.rmi.*;

interface ServerIntf extends Remote {

    public int addition(int a, int b) throws RemoteException;

    public int substraction(int a, int b) throws RemoteException;

    public int division(int a, int b) throws RemoteException;

    public int multiplication(int a, int b) throws RemoteException;

    public int square(int a) throws RemoteException;

    public int squareroot(int a) throws RemoteException;

    public String palindrome(String str) throws RemoteException;

    public String isequalstring(String str1, String str2) throws RemoteException;

    public double celsiusToFahrenheit(double celsius) throws RemoteException;

    public double milesToKilometers(double miles) throws RemoteException;

    public int factorial(int n) throws RemoteException;

    public int countVowels(String word) throws RemoteException;

    public String appendHello(String name) throws RemoteException;

    public String getLexicographicallyLargest(String str1, String str2) throws RemoteException;

}
