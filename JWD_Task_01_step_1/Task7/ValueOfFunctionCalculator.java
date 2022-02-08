package Task7;

import java.util.Scanner;

public class ValueOfFunctionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите начало отрезка ");
        double beginningOfSegment = input.nextDouble();
        System.out.println("Введите конец отрезка ");
        double endOfSegment = input.nextDouble();
        System.out.println("Введите значение шага ");
        double step = input.nextDouble();
        double valueOfFunction = 0;
        for (double x = beginningOfSegment; x <= endOfSegment; x += step) {
            valueOfFunction = Math.pow(Math.sin(x) - Math.cos(2 * x); // error - why?
            System.out.println("Значение аргумента " + x + " | " + "Значение функции " + valueOfFunction + "\n");
        }

    }

}
