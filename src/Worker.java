public class Worker extends Person {

    private double minSalary;
    private double maxSalary;


    public Worker () {

    }


    public double getMinSalary() {
        return minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMinSalary(double minSalary) {
        if (minSalary >= 0) {
            this.minSalary = minSalary;
        } else if (minSalary < 0) {
            System.err.print("Error. Min salary was entered negative. ");
            System.out.println("Please, enter some positive number for min salary");
        } else {
            System.err.print("Error. Age was entered incorrectly. ");
            System.out.println("Please, enter some positive number for min salary");
        }
    }

    public void setMaxSalary(double maxSalary) {
        if (maxSalary >= 0) {
            this.maxSalary = maxSalary;
        } else if (maxSalary < 0) {
            System.err.print("Error. Max salary was entered negative. ");
            System.out.println("Please, enter some positive number for max salary");
        } else {
            System.err.print("Error. Age was entered incorrectly. ");
            System.out.println("Please, enter some positive number for max salary");
        }
    }

    @Override
    public void die() {

        System.out.println(getName() + " didn't live up to pension");
    }
}
