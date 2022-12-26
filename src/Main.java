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


        Pensioner firstPerson = new Pensioner ("Anna", 65, 198, 118, forFirstPerson.pensionCalculation(44, 748.89, 3525.77));
        firstPerson.die();

        Worker secondPerson = new Worker("Sam", 41, 168, 75, 1184.11, 9514.78);
        secondPerson.die();

        Worker thirdPerson = new Worker("Bill", 11, 139, 31, 0, 0);
        thirdPerson.die();

        Worker fourthPerson = new Worker("Jessica", 25, 165, 52,4556.99, 5500);
        fourthPerson.die();

        Worker fifthPerson = new Worker("Jenifer", 0, 49, 4, 0, 0);
        fifthPerson.die();

        Worker sixthPerson = new Worker("Alisa", 49, 158, 51, 897.11, 7538.03);
        sixthPerson.die();

        Pensioner seventhPerson = new Pensioner("Bruce", 71, 187, 71, forSeventhPerson.pensionCalculation(52, 1965.75, 6784.88));
        seventhPerson.die();

        Worker eighthPerson = new Worker("Sarah", 19, 171, 61, 2358.07,3154.44);
        eighthPerson.die();

        Pensioner ninthPerson = new Pensioner("Laura", 57, 172, 61, forNinthPerson.pensionCalculation(4, 7780.87, 8584.88));
        ninthPerson.die();

        Worker tenthPerson = new Worker("Monica", 25, 175, 89, 7780.87, 8584.88);
        tenthPerson.die();

    }
}