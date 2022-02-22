package by.epam.decomposition.task6;

public class MainCalculation {

    public static void main(String[] args) {
        NumberReceiver numberReceiver = new NumberReceiver();
        double firstNumber = numberReceiver.receiveNumber("Enter the first number ");
        double secondNumber = numberReceiver.receiveNumber("Enter the second number ");
        double thirdNumber = numberReceiver.receiveNumber("Enter the third number ");

        double minValue = SumOfMaxAndMinValue.calculateMinValue(firstNumber,
                secondNumber, thirdNumber);
        double maxValue = SumOfMaxAndMinValue.calculateMaxValue(firstNumber,
                secondNumber, thirdNumber);
        double sumOfMinAndMax = SumOfMaxAndMinValue.calculateSumOfMaxAndMinValues(
                minValue, maxValue);

        SumOutputting.outputMinAndMaxValues(minValue, maxValue);
        SumOutputting.outputSumOfMinAndMaxValues(sumOfMinAndMax);
    }
}
