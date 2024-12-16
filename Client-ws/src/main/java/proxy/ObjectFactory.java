
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ConversionEuroToMd_QNAME = new QName("http://ws/", "ConversionEuroToMd");
    private static final QName _ConversionEuroToMdResponse_QNAME = new QName("http://ws/", "ConversionEuroToMdResponse");
    private static final QName _GetCompte_QNAME = new QName("http://ws/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://ws/", "getCompteResponse");
    private static final QName _ListeComptes_QNAME = new QName("http://ws/", "listeComptes");
    private static final QName _ListeComptesResponse_QNAME = new QName("http://ws/", "listeComptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEuroToMd }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToMd }
     */
    public ConversionEuroToMd createConversionEuroToMd() {
        return new ConversionEuroToMd();
    }

    /**
     * Create an instance of {@link ConversionEuroToMdResponse }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToMdResponse }
     */
    public ConversionEuroToMdResponse createConversionEuroToMdResponse() {
        return new ConversionEuroToMdResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ListeComptes }
     * 
     * @return
     *     the new instance of {@link ListeComptes }
     */
    public ListeComptes createListeComptes() {
        return new ListeComptes();
    }

    /**
     * Create an instance of {@link ListeComptesResponse }
     * 
     * @return
     *     the new instance of {@link ListeComptesResponse }
     */
    public ListeComptesResponse createListeComptesResponse() {
        return new ListeComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToMd }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToMd }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConversionEuroToMd")
    public JAXBElement<ConversionEuroToMd> createConversionEuroToMd(ConversionEuroToMd value) {
        return new JAXBElement<>(_ConversionEuroToMd_QNAME, ConversionEuroToMd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToMdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToMdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConversionEuroToMdResponse")
    public JAXBElement<ConversionEuroToMdResponse> createConversionEuroToMdResponse(ConversionEuroToMdResponse value) {
        return new JAXBElement<>(_ConversionEuroToMdResponse_QNAME, ConversionEuroToMdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listeComptes")
    public JAXBElement<ListeComptes> createListeComptes(ListeComptes value) {
        return new JAXBElement<>(_ListeComptes_QNAME, ListeComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listeComptesResponse")
    public JAXBElement<ListeComptesResponse> createListeComptesResponse(ListeComptesResponse value) {
        return new JAXBElement<>(_ListeComptesResponse_QNAME, ListeComptesResponse.class, null, value);
    }

}
