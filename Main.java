import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = s.nextInt();
        System.out.println("enter value of b");
        int b = s.nextInt();
        System.out.println("the sum of " + a + " and " + b + " is " + (a + b));
        System.out.println("the differance of " + a + " and " + b + " is " + (a - b));
        System.out.println("the product of " + a + " and " + b + " is " + (a * b));
        System.out.println("the div 10" +
                "20 of " + a + " and " + b + " is " + (a / b));
    }
    }