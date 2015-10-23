package upo.cpo3;

import java.util.Objects;

/**
 * Created by flthiebl on 01/10/2015.
 */
public class MachineCafe {

    public void creationEvent(Object etiquette, Etat etat){

    }

    public static void main(String[] args){
        Etat depart = new Etat("Depart");
        Etat unJet = new Etat("Un jet");
        Etat deuxJet = new Etat("Deux jets", true);

        try {
            AutomateFini machine = new AutomateFini(depart);
            machine.start();
        }catch(AFException e){
            System.out.println(e);
        }
    }
}
