package by.epam.decomposition.task4;

public final class AreaBelonging {

    private AreaBelonging() {
    }

    public static boolean checkAreaBelonging(double abs, double ord) {
        return ((abs >= -2 && abs <= 2 && ord >= 0 && ord <= 4)
                || (abs >= -4 && abs <= 4) && ord >= -3 && ord <= 0);
    }
}

