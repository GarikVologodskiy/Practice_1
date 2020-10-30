package Lesson_3;

public class City {
    private String name;
    private int population;
    private double size;
    private int streets;
    private int bikePathsLength;
    private boolean isAfrican;
    private String mayor;

    public City(String name, int population, double size, int streets, int bikePathsLength, boolean isAfrican, String mayor) {
        this.name = name;
        this.population = population;
        this.size = size;
        this.streets = streets;
        this.bikePathsLength = bikePathsLength;
        this.isAfrican = isAfrican;
        this.mayor = mayor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Integer getStreets() {
        return streets;
    }

    public void setStreets(int streets) {
        this.streets = streets;
    }

    public Integer getBikePathsLength() {
        return bikePathsLength;
    }

    public void setBikePathsLength(int bikePathsLength) {
        this.bikePathsLength = bikePathsLength;
    }

    public boolean isAfrican() {
        return isAfrican;
    }

    public void setAfrican(boolean african) {
        this.isAfrican = isAfrican;
    }

    public String getMayor() {
        return mayor;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", population=" + population +
                ", size=" + size +
                ", streets=" + streets +
                ", bikePathsLength=" + bikePathsLength +
                ", isAfrican=" + isAfrican +
                ", mayor='" + mayor + '\'';
    }

    public void Info() {
        System.out.println("Name is " + getName() + "; " + "Population = "
                + getPopulation() + "; " + "Size (km) = " + getSize() + "; " + "Number of streets = "
                + getStreets() + "; " + "Bike paths length (km) = " + getBikePathsLength() + "; "
                + "Is African city = " + isAfrican() + "; " + "Your Mayor is " + getMayor() + "; ");
    }
}