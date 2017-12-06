package aplana.course.java.newyear;


/**
 * abstract class for gifts
 */
public abstract class Gift {
    private String name;
    private float weight;
    private float cost;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }


    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }
}
