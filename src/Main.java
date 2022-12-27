public class Main {
    public static void main(String[] args) {

        SuperannuationFund forFirstPerson = new SuperannuationFund("Pupkin and Ko", false, "15.07.1981");
        SuperannuationFund forSecondPerson = new SuperannuationFund("NPF", true, "21.09.2007");
        SuperannuationFund forThirdPerson = new SuperannuationFund("No fund", false, "");
        SuperannuationFund forFourthPerson = new SuperannuationFund("PensCorp", false, "15.07.2022");
        SuperannuationFund forFifthPerson = new SuperannuationFund("No fund", false, "");
        SuperannuationFund forSixthPerson = new SuperannuationFund("Social Protection fund", true, "26.10.1991");
        SuperannuationFund forSeventhPerson = new SuperannuationFund("National Pension fund", true, "30.11.1970");
        SuperannuationFund forEighthPerson = new SuperannuationFund("New State fund", true, "21.11.2021");
        SuperannuationFund forNinthPerson = new SuperannuationFund("Horns and hooves", false, "15.07.1983");
        SuperannuationFund forTenthPerson = new SuperannuationFund("Freedom Peak Financial", true, "01.07.2022");


        Pensioner firstPerson = new Pensioner ();
        firstPerson.setName("Sam");
        firstPerson.getName();
        firstPerson.setAge(65);
        firstPerson.getAge();
        firstPerson.setHeight(198);
        firstPerson.getHeight();
        firstPerson.setWeight(118);
        firstPerson.getWeight();
        firstPerson.setPension(forFirstPerson.pensionCalculation(38, 748.89, 3525.77));
        firstPerson.die();

        Worker secondPerson = new Worker ();
        secondPerson.setName("Anna");
        secondPerson.getName();
        secondPerson.setAge(41);
        secondPerson.getAge();
        secondPerson.setHeight(168);
        secondPerson.getHeight();
        secondPerson.setWeight(75);
        secondPerson.getWeight();
        secondPerson.setMinSalary(1184.11);
        secondPerson.getMinSalary();
        secondPerson.setMaxSalary(9514.78);
        secondPerson.getMinSalary();
        secondPerson.die();

        Worker thirdPerson = new Worker ();
        thirdPerson.setName("Bill");
        thirdPerson.getName();
        thirdPerson.setAge(11);
        thirdPerson.getAge();
        thirdPerson.setHeight(139);
        thirdPerson.getHeight();
        thirdPerson.setWeight(31);
        thirdPerson.getWeight();
        thirdPerson.setMinSalary(0);
        thirdPerson.getMinSalary();
        thirdPerson.setMaxSalary(0);
        thirdPerson.getMinSalary();
        thirdPerson.die();

        Worker fourthPerson = new Worker ();
        fourthPerson.setName("Jessica");
        fourthPerson.getName();
        fourthPerson.setAge(25);
        fourthPerson.getAge();
        fourthPerson.setHeight(165);
        fourthPerson.getHeight();
        fourthPerson.setWeight(52);
        fourthPerson.getWeight();
        fourthPerson.setMinSalary(4556.99);
        fourthPerson.getMinSalary();
        fourthPerson.setMaxSalary(5500);
        fourthPerson.getMinSalary();
        fourthPerson.die();

        Worker fifthPerson = new Worker ();
        fifthPerson.setName("Jenifer");
        fifthPerson.getName();
        fifthPerson.setAge(0);
        fifthPerson.getAge();
        fifthPerson.setHeight(49);
        fifthPerson.getHeight();
        fifthPerson.setWeight(4);
        fifthPerson.getWeight();
        fifthPerson.setMinSalary(0);
        fifthPerson.getMinSalary();
        fifthPerson.setMaxSalary(0);
        fifthPerson.getMinSalary();
        fifthPerson.die();

        Worker sixthPerson = new Worker ();
        sixthPerson.setName("Alisa");
        sixthPerson.getName();
        sixthPerson.setAge(49);
        sixthPerson.getAge();
        sixthPerson.setHeight(158);
        sixthPerson.getHeight();
        sixthPerson.setWeight(51);
        sixthPerson.getWeight();
        sixthPerson.setMinSalary(897.11);
        sixthPerson.getMinSalary();
        sixthPerson.setMaxSalary(7538.03);
        sixthPerson.getMinSalary();
        sixthPerson.die();

        Pensioner seventhPerson = new Pensioner ();
        seventhPerson.setName("Bruce");
        seventhPerson.getName();
        seventhPerson.setAge(71);
        seventhPerson.getAge();
        seventhPerson.setHeight(187);
        seventhPerson.getHeight();
        seventhPerson.setWeight(71);
        seventhPerson.getWeight();
        seventhPerson.setPension(forFirstPerson.pensionCalculation(45, 1965.75, 6784.88));
        seventhPerson.die();

        Worker eighthPerson = new Worker ();
        eighthPerson.setName("Sarah");
        eighthPerson.getName();
        eighthPerson.setAge(19);
        eighthPerson.getAge();
        eighthPerson.setHeight(171);
        eighthPerson.getHeight();
        eighthPerson.setWeight(61);
        eighthPerson.getWeight();
        eighthPerson.setMinSalary(2358.07);
        eighthPerson.getMinSalary();
        eighthPerson.setMaxSalary(3154.44);
        eighthPerson.getMinSalary();
        eighthPerson.die();

        Pensioner ninthPerson = new Pensioner ();
        ninthPerson.setName("Laura");
        ninthPerson.getName();
        ninthPerson.setAge(57);
        ninthPerson.getAge();
        ninthPerson.setHeight(172);
        ninthPerson.getHeight();
        ninthPerson.setWeight(61);
        ninthPerson.getWeight();
        ninthPerson.setPension(forFirstPerson.pensionCalculation(33, 1965.75, 6784.88));
        ninthPerson.die();

        Worker tenthPerson = new Worker ();
        tenthPerson.setName("Sarah");
        tenthPerson.getName();
        tenthPerson.setAge(19);
        tenthPerson.getAge();
        tenthPerson.setHeight(171);
        tenthPerson.getHeight();
        tenthPerson.setWeight(61);
        tenthPerson.getWeight();
        tenthPerson.setMinSalary(2358.07);
        tenthPerson.getMinSalary();
        tenthPerson.setMaxSalary(3154.44);
        tenthPerson.getMinSalary();
        tenthPerson.die();
    }
}