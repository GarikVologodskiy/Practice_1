package Lesson_3;

public class City {
    private String Name;
    private Integer Population;
    private Double Size;
    private Integer Streets;
    private Integer BikePathsLength;
    private boolean isAfrican;
    private String Mayor;

    public City(String name, Integer population, Double size, Integer streets, Integer bikePathsLength, boolean isAfrican, String mayor, String coeffEco) {
    }

    public City(String name, Integer population, Double size, Integer streets, Integer bikePathsLength, boolean isAfrican, String mayor) {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Integer getPopulation() {
        return Population;
    }

    public void setPopulation(Integer population) {
        this.Population = population;
    }

    public Double getSize() {
        return Size;
    }

    public void setSize(Double size) {
        this.Size = size;
    }

    public Integer getStreets() {
        return Streets;
    }

    public void setStreets(Integer streets) {
        this.Streets = streets;
    }

    public Integer getBikePathsLength() {
        return BikePathsLength;
    }

    public void setBikePathsLength(Integer bikePathsLength) {
        this.BikePathsLength = bikePathsLength;
    }

    public boolean isAfrican() {
        return isAfrican;
    }

    public void setAfrican(boolean African) {
        this.isAfrican = African;
    }

    public String getMayor() {
        return Mayor;
    }

    public void setMayor(String mayor) {
        this.Mayor = mayor;
    }

    public void Info() {
        System.out.println("Name is " + getName() + "Population = "
                + getPopulation() + "Size (km) = " + getSize() + "Number of streets = "
                + getStreets() + "Bike paths length (km) = " + getBikePathsLength()
                + "Is African city = " + isAfrican() + "Your Mayor is " + getMayor());
    }
}