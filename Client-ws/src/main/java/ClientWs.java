import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToMd(23));
        Compte CT =proxy.getCompte(5);
        System.out.println(CT.getCode());
        System.out.println(CT.getSolde());
        System.out.println(CT.getDateCreation());
        List<Compte> CompteList = proxy.listeComptes();
        for (Compte compte : CompteList) {
            System.out.println("*******************");
            System.out.println("code ="+compte.getCode());
            System.out.println("solde ="+compte.getSolde());
            System.out.println("dateCreation ="+compte.getDateCreation());
        }
    }
}
