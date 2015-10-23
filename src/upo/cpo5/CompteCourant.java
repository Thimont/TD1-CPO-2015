package upo.cpo5;


/**
 * Created by flori_000 on 22/10/2015.
 */
public class CompteCourant extends CompteSansLimite {
    private static int numeroCompte = 110000;
    private double plancherDec;
    private final String statut = "courant";

    public CompteCourant(Client client) {
        super(client);
        plancherDec = 0;
        numeroCompte++;
    }

    public CompteCourant(Client client, double plancherDec) {
        super(client);
        this.plancherDec = plancherDec;
        numeroCompte++;
    }

    public String getStatut(){
        return statut;
    }

    public void debit(double montant) throws OpeException{
        if((this.getSolde() - montant) < plancherDec)
            throw new OpeException("Plancher de decouvert est depasse.");
        else{
           this.setSolde(this.getSolde()-montant);
        }
    }

    public void credit(double montant){
        this.setSolde(this.getSolde()+montant);
    }

    @Override
    public void virementCompteToCompte(Compte compte, double montant) {
        try {
            this.debit(montant);
            compte.credit(montant);
        } catch (OpeException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompteCourant{");
        sb.append("plancherDec=").append(plancherDec);
        sb.append(", statut='").append(statut).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
