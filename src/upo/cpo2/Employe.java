package upo.cpo2;

/**
 * Created by flthiebl on 01/10/2015.
 */
public class Employe {
    private String nom;
    private double salaireHor;
    private int nbHeure;

    public Employe(String nom, double salaireHor, int nbHeure) throws EmpException {
        if(salaireHor < 13)
            throw new EmpException("Salaire horaire insuffisant.");
        if(nbHeure > 60)
            throw new EmpException("Trop d'heure travaillees.");
        if(salaireHor < 13 && nbHeure > 60)
            throw new EmpException("Coditions d'embauches non respectees.");
        this.nom = nom;
        this.salaireHor = salaireHor;
        this.nbHeure = nbHeure;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaireHor() {
        return salaireHor;
    }

    public void setSalaireHor(double salaireHor) {
        this.salaireHor = salaireHor;
    }

    public int getNbHeure() {
        return nbHeure;
    }

    public void setNbHeure(int nbHeure) {
        this.nbHeure = nbHeure;
    }


}
