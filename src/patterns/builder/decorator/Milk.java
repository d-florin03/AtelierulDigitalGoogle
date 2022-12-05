package patterns.builder.decorator;

public class Milk extends Topping {
    public Milk(Beverage beverage){
        super(beverage, "Milk",  8);
    }
}
