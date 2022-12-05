package patterns.builder.decorator;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Beverage coffee = new Coffe();
        Topping milk= new Milk(coffee);
        Beverage milkchocolateCoffee = new Chocolate(coffee);
        System.out.println(milkchocolateCoffee.getDescription());
        System.out.println(milkchocolateCoffee.getCost());

        Beverage milktea = new Milk(new Tea());
        System.out.println((milktea.getDescription()));
        System.out.println(milktea.getCost());

    }
}
