package upo.cpo5;

/**
 * Created by flori_000 on 22/10/2015.
 */
public class CompteEpargne implements Compte{
    private Client client;
    private double solde = 0;
    private static int numeroCompte = 130000;
    private final double plafondDepot;
    private final String statut = "epargne";
    private double tauxRem;

    public CompteEpargne(double plafondDepot, Client client, double versementInit, double tauxRem) {
        this.plafondDepot = plafondDepot;
        this.client = client;
        this.tauxRem = tauxRem;
        solde += versementInit;
        numeroCompte++;
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

    public void virementCompteToCompte(Compte compte, double montant) {
        try {
            this.debit(montant);
            compte.credit(montant);
        } catch (OpeException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getClient() {
        return client.toString();
    }

    @Override
    public double getSolde() {
        return solde;
    }

    @Override
    public String getStatut() {
        return statut;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompteEpargne{");
        sb.append(", solde=").append(solde);
        sb.append(", plafondDepot=").append(plafondDepot);
        sb.append(", statut='").append(statut).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void calculInteret(){
        double interet = this.getSolde()/100*tauxRem;
        System.out.println("Interet sur un an: "+interet);
        this.credit(interet);
    }
}
