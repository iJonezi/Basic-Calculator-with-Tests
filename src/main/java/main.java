/*
 *
 * @author ijonezi
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the first number");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Please provide the second number");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("(1) add (2) subtract (3) multiply (4) division");
        int operator = Integer.valueOf(scanner.nextLine());

        calculator calc = new calculator(first, second);

        if (operator == 1) {
            calc.add();
        } else if (operator == 2) {
            calc.subtract();
        } else if (operator == 3) {
            calc.multiply();
        } else if (operator == 4) {
            calc.division();
        }
        calc.results();
    }
}
