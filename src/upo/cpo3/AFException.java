package upo.cpo3;

/**
 * D�crivez votre classe MachineException ici.
 *
 */

public class AFException extends Exception
{
    /**
     * Constructeur d'objets de classe MachineException
     */
    public AFException(String message)
    {
        super("Probleme d'automate : \n" + message);
    }

}
