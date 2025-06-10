package assg1;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double avgNum1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double avgNum2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double avgNum3 = scanner.nextDouble();
        double average = (avgNum1 + avgNum2 + avgNum3) / 3;
        System.out.println("Average of the three numbers: " + average);

    }
}
