package Lesson_3;

public class Test_City {
    public static void main(String[] args) {
        City city1 = new City("Burgos", 230000, 3.45, 345, 55, false, "Blagoe Krasov");
        /*System.out.println(city1.getName());
        city1.Info();*/

        Tarragona tar = new Tarragona("Tarragona", 900000, 43.45, 1240, 654, false, "Hose Gonzales Ritorio");
        /*tar.Info();*/
        System.out.println(tar.toString());
        /*System.out.println(tar.getName());*/
        /*System.out.println(tar.getCoeffEco());*/
    }
}