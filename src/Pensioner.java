public class Pensioner extends Person {

    private double pension;


    public Pensioner() {

    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    @Override
    public void die() {
        double x = (getAge() - 50) * pension;
        System.out.println(getName() + " died who earned €" + x);
    }
}

