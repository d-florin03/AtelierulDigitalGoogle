package exceptions;

public class Main {
    public static void main(String[] args) throws NumberTooHigheException{
        ComplexCalculator cc= new ComplexCalculator();
        try{
            cc.complexOperation(6);

        }catch (NumberTooHigheException e){
            e.printStackTrace();
        }
        cc.complexOperation(0);
        System.out.println("End!");
    }

}
