package CPT;

/* author: Nateram
 * date: 01/19/2025
 * Auto Repair Predictor
 */

public class CarIssue {
    private String description; // Description of the car issue
    private double cost; // Cost of fixing the car issue

    /**
     * Constructor to initialize CarIssue with a description and cost.
     * 
     * @param description Description of the car issue
     * @param cost Cost of fixing the car issue
     */
    public CarIssue(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    /**
     * Getter for description.
     * 
     * @return Description of the car issue
     */
    public String getDescription() {
        return description;
    }

    /**
     * Getter for cost.
     * 
     * @return Cost of fixing the car issue
     */
    public double getCost() {
        return cost;
    }

    /**
     * Returns a string representation of the CarIssue object.
     * 
     * @return String representation of the CarIssue object
     */
    @Override
    public String toString() {
        return "CarIssue [description=" + description + ", cost=" + cost + "]";
    }
}
