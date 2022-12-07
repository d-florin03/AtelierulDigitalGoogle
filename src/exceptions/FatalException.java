package exceptions;

public class FatalException extends RuntimeException {
    public FatalException(){
        super("Fatal exception");
    }
}
