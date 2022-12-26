public class SuperannuationFund {

    private final double COEFF_OF_PENSION = 0.02;
    private int averagePension = 1500;

    private String name;
    private boolean isNational;
    private final String dateCreated;


    public SuperannuationFund(String nameOfSF, boolean isNational, String dateCreated) {
        name = nameOfSF;
        this.isNational = isNational;
        this.dateCreated = dateCreated;
    }

    public double pensionCalculation (int timeWorked, double minWage, double maxWage) {
        double pension;
        if (isNational) {
            pension = HalfValueUtils.halfValue(minWage, maxWage);
        } else {
            pension = HalfValueUtils.halfValueOFThree(minWage, maxWage, averagePension);
        }
        return pension * COEFF_OF_PENSION * timeWorked;
    }
}
