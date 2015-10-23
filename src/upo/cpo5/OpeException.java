package upo.cpo5;

/**
 * Created by flthiebl on 23/10/2015.
 */
public class OpeException extends Exception {
    public OpeException(String message) {
        super("Operation impossible: "+message);
    }
}
