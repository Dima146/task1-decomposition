package by.epam.Decomposition.Task6;

public class MainCalculation {

    public static void main(String[] args) {
        NumberReceiver numberReceiver = new NumberReceiver();
        double firstNumber = numberReceiver.receiveNumber("Enter the first number ");
        double secondNumber = numberReceiver.receiveNumber("Enter the second number ");
        double thirdNumber = numberReceiver.receiveNumber("Enter the third number ");

        double minValue = SumOfMaxAndMinValues.calculateMinValue(firstNumber,
                secondNumber, thirdNumber);
        double maxValue = SumOfMaxAndMinValues.calculateMaxValue(firstNumber,
                secondNumber, thirdNumber);
        double sumOfMinAndMax = SumOfMaxAndMinValues.calculateSumOfMaxAndMinValues(
                minValue, maxValue);

        SumOutputting.outputMinAndMaxValues(minValue, maxValue);
        SumOutputting.outputSumOfMinAndMaxValues(sumOfMinAndMax);
    }
}