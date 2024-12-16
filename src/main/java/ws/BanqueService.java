package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import javax.naming.Name;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToMd")
    public double Conversion(@WebParam(name = "montant") double mt){
        return mt * 10;
    }
    @WebMethod
    public compte getCompte(@WebParam(name = "code") int code){
      return  new compte(code,Math.random()*5000,new Date());
    }
    @WebMethod
    public List<compte> listeComptes(){
        return  List.of(
                new compte(1,Math.random()*5000,new Date()),
                new compte(2,Math.random()*5000,new Date()),
                new compte(3,Math.random()*5000,new Date())

        );


    }

}