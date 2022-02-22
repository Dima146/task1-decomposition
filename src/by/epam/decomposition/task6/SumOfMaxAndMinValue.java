package by.epam.decomposition.task6;

public final class SumOfMaxAndMinValue {

    private SumOfMaxAndMinValue() {
    }

    public static double calculateMinValue(double number1,
                                           double number2,
                                           double number3) {
        double minValue = Math.min(Math.min(number1, number2), number3);
        return minValue;
    }

    public static double calculateMaxValue(double number1,
                                           double number2,
                                           double number3) {
        double maxValue = Math.max(Math.max(number1, number2), number3);
        return maxValue;
    }

    public static double calculateSumOfMaxAndMinValues(double minVal,
                                                       double maxVal) {
        double sumOfMaxAndMin = minVal + maxVal;
        return sumOfMaxAndMin;
    }
}
