package upo.cpo3;

/**
 * Created by flthiebl on 01/10/2015.
 */
public class Transition {
    private Etat suivant;
    private Object etiquette;

    public Transition(Etat suivant, Object etiquette) throws TransitionException {
        if(etiquette == null)
            throw new TransitionException("Etiquette doit etre non nulle.\n");
        if(suivant == null)
            throw new TransitionException("Suivant doit etre non nul.\n");
        this.suivant = suivant;
        this.etiquette = etiquette;
    }

    public Object getEtiquette() {
        return etiquette;
    }

    public Etat franchir(){
        return suivant;
    }
}
