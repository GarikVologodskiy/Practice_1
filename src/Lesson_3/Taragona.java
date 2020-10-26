package Lesson_3;

public class Taragona extends City {

    private float coeffEco;

    public Taragona(String name, Integer population, Double size, Integer streets, Integer bikePathsLength, boolean isAfrican, String mayor) {
        super(name, population, size, streets, bikePathsLength, isAfrican, mayor);
        this.coeffEco = (float) 1.05;
    }

    public Taragona (String name, Integer population, Double size, Integer streets, Integer bikePathsLength, boolean isAfrican, String mayor, float coeffEco) {
        super(name, population, size, streets, bikePathsLength, isAfrican, mayor);
        this.coeffEco = coeffEco;
    }

    public float getCoeffEco() {
        return coeffEco;
    }

    public void setCoeffEco(float coeffEco) {
        this.coeffEco = coeffEco;
    }
}
