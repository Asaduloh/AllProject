package mysql;

public class WorldCity {

    private final int id;
    private final String name;
    private final String countryCode;
    private final String district;
    private final int population;

    public WorldCity(int id,
                     String name,
                     String countryCode,
                     String district,
                     int population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public int getPopulation() {
        return population;
    }
}