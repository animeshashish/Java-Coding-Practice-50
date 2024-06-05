package JavaCodingPractice50;

import java.util.Scanner;

public class MathUtils {

    static void square(int x) {
        System.out.println("Square of given is:" + x*x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();

        square(x);
    }
}
