package assg1;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter base: ");
        double base = sc.nextDouble();
        System.out.print("enter exponent: ");
        double exponent = sc.nextDouble();
        double powerResult = Math.pow(base, exponent);
        System.out.println("result of " + base + " raised to " + exponent + ": " + powerResult);
    }
}
