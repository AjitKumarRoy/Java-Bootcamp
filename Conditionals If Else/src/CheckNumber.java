import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        /*
        * if (condition 1) {
        * this block will only execute if condition 1 is true
        * ----Code---
        * }
        * else if (condition 2) {
        * this block will only execute if condition 2 is true
        * ----Code---
        * }
        * else if (condition 3) {
        * this block will only execute if condition 3 is true
        * ------Code---
        * }
        * else {
        * this block will only execute if none of the above condition is true
        * ---Code--
        * }
        *
        *
        * statemnt
        * statme
        * stseme
        *
        *
        *
        *
        * */

        /*
        * if (condition1) {
    // Code to execute if condition1 is true
} else if (condition2) {
    // Code to execute if condition1 is false and condition2 is true
} else if (condition3) {
    // Code to execute if both condition1 and condition2 are false, and condition3 is true
} else {
    // Code to execute if none of the above conditions are true
}*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println(a+ " is positive");
        }

        else if (a < 0) {
            System.out.println(a + " is negative");
        }

        else {
            System.out.println(a + " is zero");
        }


    }
}