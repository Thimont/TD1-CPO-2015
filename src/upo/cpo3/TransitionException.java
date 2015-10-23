package upo.cpo3;

/**
 * Décrivez votre classe MachineException ici.
 *
 */

public class TransitionException extends Exception
{
    /**
     * Constructeur d'objets de classe MachineException
     */
    public TransitionException(String message)
    {
        super("Problème de construction de transition : \n" + message);
    }

}
