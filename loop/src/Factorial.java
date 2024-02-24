import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int n = 5; //enter number here
        int count = 1;
        int fact = 1;

        while (count <= n) {
            fact = fact * count;
            count = count + 1; // count++;
        }

        System.out.println("Factorial of "+n+" is :"+fact);
    }
}