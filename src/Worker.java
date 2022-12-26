public class Worker extends Person {

    private double minSalary;
    private double maxSalary;


    public Worker(String name, int age, int height, int weight, double minSalary, double maxSalary) {
        super(name, age, height, weight);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    @Override
    public void die() {

        System.out.println(getName() + " didn't live up to pension");
    }
}
