package upo.cpo2;

/**
 * D�crivez votre classe MachineException ici.
 *
 */

public class EmpException extends Exception
{
    /**
     * Constructeur d'objets de classe MachineException
     */
    public EmpException(String message)
    {
        super("Probleme de gestion d'employe : \n" + message);
    }

}
