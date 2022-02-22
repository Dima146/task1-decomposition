package by.epam.decomposition.task4;

public final class BelongingOutputting {

    private BelongingOutputting() {
    }

    public static void outputOfResult(boolean res,
                                      double abs,
                                      double ord) {
        System.out.println("Point with coordinates "
                + abs + " and " + ord
                + (res ? " belongs to the shaded area "
                : " does not belong to the shaded area "));
    }
}
