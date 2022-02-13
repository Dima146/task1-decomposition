package by.epam.Decomposition.Task5;

public class OperationsOnNumbers {

    public  static double operateOnNumbers(double number) {
        if (number >= 0) {
            number = Math.pow(number, 2);
        } else {
            number = Math.pow(number, 4);
        }
        return number;
    }
}
