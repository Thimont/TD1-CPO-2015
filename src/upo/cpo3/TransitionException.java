package upo.cpo3;

/**
 * D�crivez votre classe MachineException ici.
 *
 */

public class TransitionException extends Exception
{
    /**
     * Constructeur d'objets de classe MachineException
     */
    public TransitionException(String message)
    {
        super("Probl�me de construction de transition : \n" + message);
    }

}
