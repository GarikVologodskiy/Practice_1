package Lesson_3;

public class Tarragona extends City {

    private float coeffEco;

    public Tarragona(String name, int population, Double size, int streets, int bikePathsLength, boolean isAfrican, String mayor) {
        super(name, population, size, streets, bikePathsLength, isAfrican, mayor);
        this.coeffEco = (float) 1.05;
    }

    public Tarragona(String name, int population, double size, int streets, Integer bikePathsLength, boolean isAfrican, String mayor, float coeffEco) {
        super(name, population, size, streets, bikePathsLength, isAfrican, mayor);
        this.coeffEco = coeffEco;
    }

    public float getCoeffEco() {
        return coeffEco;
    }

    public void setCoeffEco(float coeffEco) {
        this.coeffEco = coeffEco;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + "coeffEco=" + coeffEco + ";";
    }
}
