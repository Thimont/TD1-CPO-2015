package upo.cpo5;

/**
 * Created by flori_000 on 22/10/2015.
 */
public interface Compte{
    void debit(double montant) throws OpeException;
    void credit(double montant);
    String getClient();
    double getSolde();
    void virementCompteToCompte(Compte compte, double montant);
    String getStatut();
    @Override
    String toString();
}
