package CPT;

/* author: Nateram
 * date: 01/19/2025
 * Auto Repair Predictor
 */

public class City {
    private String name; // Name of the city
    private String[] repairShops; // List of repair shops in the city

    /**
     * Constructor to initialize City with a name and a list of repair shops.
     * 
     * @param name Name of the city
     * @param repairShops List of repair shops in the city
     */
    public City(String name, String[] repairShops) {
        this.name = name;
        this.repairShops = repairShops;
    }

    /**
     * Getter for name.
     * 
     * @return Name of the city
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for repair shops.
     * 
     * @return List of repair shops in the city
     */
    public String[] getRepairShops() {
        return repairShops;
    }

    /**
     * Returns a string representation of the City object.
     * 
     * @return String representation of the City object
     */
    @Override
    public String toString() {
        return "City [name=" + name + ", repairShops=" + String.join(", ", repairShops) + "]";
    }
}
