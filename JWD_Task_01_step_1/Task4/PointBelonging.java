package Task4;

import java.util.Scanner;

public class PointBelonging {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите координату x ");
        double x = input.nextDouble();
        System.out.println("Введите координату y ");
        double y = input.nextDouble();
        if ((x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4) && y >= -3 && y <=0) {
            System.out.println("Точка с координатами " + x + " и " + y + " принадлежит закрашенной области");
        } else {
            System.out.println("Точка с координатами " + x + " и " + y + " не принадлежит закрашенной области");

        }
    }

}
