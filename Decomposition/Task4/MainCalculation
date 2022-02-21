package by.epam.decomposition.task4;

public class MainCalculation {

    public static void main(String[] args) {
        CoordinateReceiver receiver = new CoordinateReceiver();
        double abscissa = receiver.receiveCoordinate("Enter x coordinate ");
        double ordinate = receiver.receiveCoordinate("Enter y coordinate ");
        boolean result = AreaBelonging.checkAreaBelonging(abscissa, ordinate);

        BelongingOutputting.outputOfResult(result, abscissa, ordinate);

    }
}
