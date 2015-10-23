package upo.cpo5;

/**
 * Created by flori_000 on 22/10/2015.
 */
public interface Utilisateur {
    void affichageListeCompte();
    void virementCompteToCompte(Compte compteSource, Compte Destination, Client client);
    void affichageCompte(Compte compte, Client client);


}
