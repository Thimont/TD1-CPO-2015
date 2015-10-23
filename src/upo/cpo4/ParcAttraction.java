package upo.cpo4;

public class ParcAttraction {
    private final String nom;
    private final int capacite;
    private double tarifIlli;
    private double tarifIlli5;
    private int placeVendues = 0;
    private int placeIlli = 0;
    private int placeIlli5 = 0;
    private int placeReduit = 0;
    private int placeReduit5 = 0;

    public ParcAttraction(String nom, int capacite, double tarifIlli, double tarifIlli5) {
        this.nom = nom;
        this.capacite = capacite;
        this.tarifIlli = tarifIlli;
        this.tarifIlli5 = tarifIlli5;
    }

    public int nbPlacesDispo(){
        return capacite-placeVendues;
    }

    public void vendreBillets(int nb, Tarif tarif){
        if((capacite - placeVendues) < nb)
            System.out.println("Capacité d'acceuil insuffisante.");
        else{
            if(tarif == Tarif.ILLIMITE)
                placeIlli += nb;
            if(tarif == Tarif.ILLIMITE5)
                placeIlli5 += nb;
            if(tarif == Tarif.REDUIT)
                placeReduit += nb;
            if(tarif == Tarif.REDUIT5)
               placeReduit5 += nb;
            placeVendues += nb;
        }
    }

    public void reinitialiser(){
        placeVendues = 0;
    }

    public double chiffreAffaires(){
        return placeIlli*tarifIlli + placeIlli5*tarifIlli5 + placeReduit*(tarifIlli/100*70) + placeReduit5*(tarifIlli5/100*70);

    }

    public double tauxRemplissage(){
        return (double)placeVendues/capacite*100;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParcAttraction ");
        sb.append(nom).append(",\n");
        sb.append("Capacite d'acceuil : ").append(capacite).append(",\n");
        sb.append("Tarif normal illimite : ").append(tarifIlli).append(" euros,\n");
        sb.append("Tarif normal illimite 5 : ").append(tarifIlli5).append(" euros,\n");
        sb.append(placeIlli).append(" billets vendus au tarif illimites,\n");
        sb.append(placeIlli5).append(" billets vendus au tarif illimites 5,\n");
        sb.append(placeReduit).append(" billets vendus au tarif reduit,\n");
        sb.append(placeReduit5).append(" billets vendus au tarif reduit 5,\n");
        return sb.toString();
    }
}
