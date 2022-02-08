package Task3;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину первого катета ");
        double firstLeg = input.nextDouble();
        System.out.println("Введите длину второго катета ");
        double secondLeg = input.nextDouble();
        double hypotenuse = Math.hypot(firstLeg, secondLeg);
        double squareOfTriangle = (firstLeg * secondLeg) / 2;
        double perimeterOfTriangle = firstLeg + secondLeg + hypotenuse;
        System.out.println("Площадь треугольника равна " + squareOfTriangle);
        System.out.println("Периметр треугольника равен " + perimeterOfTriangle);
    }


}
