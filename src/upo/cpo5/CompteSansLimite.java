package upo.cpo5;

/**
 * Created by flori_000 on 22/10/2015.
 */
abstract public class CompteSansLimite implements Compte{
    private final Client client;
    private double solde = 0;

    public CompteSansLimite(Client client) {
        this.client = client;
    }

    @Override
    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String getClient() {
        return client.toString();
    }


}
