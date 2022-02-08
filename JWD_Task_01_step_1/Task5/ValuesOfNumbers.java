package Task5;

import java.util.Scanner;

public class ValuesOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число ");
        double number1 = input.nextDouble();
        System.out.println("Введите второе число ");
        double number2 = input.nextDouble();
        System.out.println("Введите третье число ");
        double number3 = input.nextDouble();
        if (number1 >= 0) {
            number1 = Math.pow(number1, 2);
        } else {
            number1 = Math.pow(number1, 4);
        }
        if (number2 >= 0) {
            number2 = Math.pow(number2, 2);
        } else {
            number2 = Math.pow(number2, 4);
        }
        if (number3 >= 0) {
            number3 = Math.pow(number3, 2);
        } else {
            number3 = Math.pow(number3, 4);
        }
        System.out.println("Новые значения чисел" + "\n" + number1 + "\n" + number2 + "\n" + number3 + "\n" );

    }

}


