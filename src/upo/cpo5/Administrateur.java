package upo.cpo5;

/**
 * Created by flori_000 on 22/10/2015.
 */
public class Administrateur implements Utilisateur{

    public void creationCompte(Client client, String statutCompte){
        if(statutCompte.equals("courant")){
            Compte nouveauCompteCourant = new CompteCourant(client, plancherDec);
        }
    }


    public void credit(Compte compte, Client client){

    }

    public void debit(Compte compte, Client client){

    }

    public void virementCompteToCompte(Compte compteSource, Compte Destination, Client client){

    }

    public void affichageCompte(Compte compte, Client client){

    }

    public void affichageListeCompte(){

    }
}
