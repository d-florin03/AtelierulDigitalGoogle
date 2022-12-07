package exceptions;

public class ComplexCalculator {
    public float calculate(float a, float b){
        if(b==0)throw new FatalException();
        return a/b;
    }
    public float complexOperation(int nr) throws NumberTooHigheException{
        float result = 3.5f;
        if(nr>4){
            throw new NumberTooHigheException();
        }else{
            result=calculate(result,nr);
        }
        return result;
    };
}
