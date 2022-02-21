package by.epam.decomposition.task5;

import java.util.Scanner;

public class NumberReceiver {
    private double number;
    private Scanner scanner = new Scanner(System.in);

    public NumberReceiver() {
    }

    public double receiveNumber(String str) {
        System.out.println(str);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                return this.number = scanner.nextDouble();
            } else {
                System.out.println("Incorrect number entry.Please re-enter ");
                scanner.next();
            }
        }
        return this.number;
    }
}
