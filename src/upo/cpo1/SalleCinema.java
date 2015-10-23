package upo.cpo1;

/**
 * Définit le modèle d'une salle de cinéma.
 */
public final class SalleCinema {

    private String film;
    private final int nbPlaces;
    private double tarif;
    private int nbPlacesVendues = 0;

    public SalleCinema(int nbPlaces, double tarif, String film) {
        this.nbPlaces = nbPlaces;
        this.tarif = tarif;
        this.film = film;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public double getTarif() {
        return tarif;
    }

    public String getFilm() {
        return film;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public void vendrePlace(){
        if(!estPleine())
            nbPlacesVendues++;
        else
            System.out.println("La salle est pleine.\n");
    }

    public double tauxRemplissage(){
        return (double)nbPlacesVendues/nbPlaces;
    }

    public double chiffreAffaires(){
        return nbPlacesVendues*tarif;
    }

    public boolean estPleine(){
        if(nbPlacesVendues == nbPlaces)
            return true;
        else
            return false;
    }

    public int nbPlacesDisponibles(){
        return nbPlaces - nbPlacesVendues;
    }


    @Override
    public String toString() {
        return ("Film projete        :" + film + "\n" +
                "Tarif               :" + tarif + "\n" +
                "Nombre de places    :" + nbPlaces + "\n" +
                "Taux de remplissage :" + tauxRemplissage()+ "\n" +
                "Chiffre d'affaires  :" + chiffreAffaires());
    }


}
