package upo.cpo4;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingUse;

/**
 * Created by flori_000 on 03/10/2015.
 */
public class TestParc {
    public static void main(String[] args) {
        ParcAttraction dysney = new ParcAttraction("Dysneyland Paris", 2000, 50, 30);
        System.out.println(dysney);
        dysney.vendreBillets(5,Tarif.ILLIMITE);
        dysney.vendreBillets(100, Tarif.REDUIT);
        dysney.vendreBillets(500, Tarif.ILLIMITE5);
        dysney.vendreBillets(1000, Tarif.REDUIT5);
        System.out.println(dysney.tauxRemplissage());
        System.out.println(dysney.nbPlacesDispo());
        System.out.println(dysney.chiffreAffaires());
        System.out.println(dysney);
    }
}
