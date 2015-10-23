package upo.cpo2;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingUse;
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.xml.soap.SOAPPart;

/**
 * Created by flthiebl on 01/10/2015.
 */
public class EntrepriseJ {

    public static void afficherEmploye(String nom, double salaireHor, int nbHeure){
        int heureSup;
        double salaire;
        if(nbHeure > 40) {
            heureSup = nbHeure - 40;
            nbHeure = 40;
            salaire = salaireHor * nbHeure + heureSup * (1.5*salaireHor);
        }
        else{
            salaire = salaireHor * nbHeure;
        }
        System.out.println(nom + ", salaire horaire: " + salaireHor + " euros; heures travaillees: " + nbHeure);
        System.out.println("Salaire hebdomadaire: " + salaire);
    }
    public static void main(String[] args){
        try {
            Employe john = new Employe("John", 13, 35);
            afficherEmploye(john.getNom(), john.getSalaireHor(), john.getNbHeure());
        }catch (EmpException e){
            System.out.println(e);
        }
        try{
            Employe henry = new Employe("Henry", 15, 65);
            afficherEmploye(henry.getNom(), henry.getSalaireHor(), henry.getNbHeure());
        }catch (EmpException e){
            System.out.println(e);
        }
    }
}
