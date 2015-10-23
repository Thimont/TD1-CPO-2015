package upo.cpo5;

/**
 * Created by flori_000 on 22/10/2015.
 */
public class CompteAction extends CompteSansLimite{
    private static int numeroCompte = 120000;
    private double plancherDec;
    private final double plafondCredit;
    private final String statut = "action";

    public CompteAction(Client client, double plafondCredit, double versementInit) {
        super(client);
        numeroCompte++;
        this.plafondCredit = plafondCredit;
        this.setSolde(versementInit);
    }

    public void debit(double montant) throws OpeException{
        if((this.getSolde() - montant) < 0)
            throw new OpeException("Decouvert non autorise.");
        else{
            this.setSolde(this.getSolde()-montant);
        }
    }

    public void credit(double montant){
        this.setSolde(this.getSolde()+montant);
    }

    @Override
    public void virementCompteToCompte(Compte compte, double montant){
        try {
            this.debit(montant);
            compte.credit(montant);
        } catch (OpeException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getStatut() {
        return statut;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompteAction{");
        sb.append("plancherDec=").append(plancherDec);
        sb.append(", plafondCredit=").append(plafondCredit);
        sb.append(", statut='").append(statut).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
