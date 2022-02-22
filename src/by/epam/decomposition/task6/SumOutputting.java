package by.epam.decomposition.task6;

public final class SumOutputting {

    private SumOutputting() {
    }

    public static void outputMinAndMaxValues(double minVal, double maxVal) {
        System.out.println("The smallest number entered "
                + minVal + "\n" +
                "The largest number entered " + maxVal);
    }
    public static void outputSumOfMinAndMaxValues(double sum) {
        System.out.println("The sum of the smallest and largest of the numbers is "
                + sum);
    }
}

