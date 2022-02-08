package Task6;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число ");
        double number1 = input.nextDouble();
        System.out.println("Введите второе число ");
        double number2 = input.nextDouble();
        System.out.println("Введите третье число ");
        double number3 = input.nextDouble();
        double maxValue = Math.max(Math.max(number1, number2), number3);
        double minValue = Math.min(Math.min(number1, number2), number3);
        double sumOfMaxAndMin = maxValue + minValue;
        System.out.println("Сумма большего и меньшего из трех чисел равна " + sumOfMaxAndMin);
    }

}
