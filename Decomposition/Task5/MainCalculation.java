package by.epam.Decomposition.Task5;

public class MainCalculation {

    public static void main(String[] args) {
        NumberReceiver numberReceiver = new NumberReceiver();
        double firstNumber = numberReceiver.receiveNumber("Enter the first number ");
        double secondNumber = numberReceiver.receiveNumber("Enter the second number ");
        double thirdNumber = numberReceiver.receiveNumber("Enter the third number ");

        NewValuesOutputting.outputNewValues(
                OperationsOnNumbers.operateOnNumbers(firstNumber));
        NewValuesOutputting.outputNewValues(
                OperationsOnNumbers.operateOnNumbers(secondNumber));
        NewValuesOutputting.outputNewValues(
                OperationsOnNumbers.operateOnNumbers(thirdNumber));

    }
}
