package patterns.builder.decorator;

public class Chocolate extends Topping{
    public Chocolate(Beverage beverage){
        super(beverage, "Dark Chocolate", 12);
    }
}
