package patterns.builder.decorator;

public class Beverage {
    private  String description;
    private int cost;
    public Beverage(String description, int cost){
        this.cost = cost;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    public int getCost(){
        return cost;
    }
}
