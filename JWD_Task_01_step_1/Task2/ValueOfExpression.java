package Task2;

import java.util.Scanner;

public class ValueOfExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Введите число a ");
        double a = input.nextDouble();
        System.out.println(" Введите число b ");
        double b = input.nextDouble();
        System.out.println(" Введите число c ");
        double c = input.nextDouble();
        double value = (b+ Math.sqrt(Math.pow(b, 2) + 4 * a * c) / (2 * a) - Math.pow(a, 3) * c +Math.pow(b, -2));
        System.out.println("Значение выражения = " + value);


    }
}
