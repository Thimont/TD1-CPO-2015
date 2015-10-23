package upo.cpo5;

import java.util.List;

/**
 * Created by flori_000 on 22/10/2015.
 */
public class Client implements Utilisateur{
    private List<Compte> listeCompte;
    private String nom;

    public Client(String nom) {
        this.nom = nom;
        System.out.println("Bienvenue "+nom);
        System.out.println(
                "1/ Liste des comptes\n"+
                        "2/ Credit compte\n"+
                        "3/ Debit compte\n"+
                        "4/ Virement compte a compte\n"+
                        "5/ Affichage solde compte");
    }

    public void affichageListeCompte(){
        for(int i = 0; i < listeCompte.size(); i++){
            System.out.println(listeCompte.get(i).toString());
        }
    }

    public void credit(Compte compte){

    }

    public void debit(Compte compte){

    }

    public void virementCompteToCompte(Compte compteSource, Compte Destination, Client client){

    }

    public void affichageCompte(Compte compte, Client client){

    }


}
