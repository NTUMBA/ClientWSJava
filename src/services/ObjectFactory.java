
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _Compte_QNAME = new QName("http://services/", "compte");
    private final static QName _ConversionEuroToDh_QNAME = new QName("http://services/", "ConversionEuroToDh");
    private final static QName _GetBanqueServicePort_QNAME = new QName("http://services/", "getBanqueServicePort");
    private final static QName _AddCompteResponse_QNAME = new QName("http://services/", "addCompteResponse");
    private final static QName _AddCompte_QNAME = new QName("http://services/", "addCompte");
    private final static QName _AddLotComptesResponse_QNAME = new QName("http://services/", "addLotComptesResponse");
    private final static QName _GetComptes_QNAME = new QName("http://services/", "getComptes");
    private final static QName _GetComptesResponse_QNAME = new QName("http://services/", "getComptesResponse");
    private final static QName _ConversionEuroToDhResponse_QNAME = new QName("http://services/", "ConversionEuroToDhResponse");
    private final static QName _GetCompte_QNAME = new QName("http://services/", "getCompte");
    private final static QName _AddLotComptes_QNAME = new QName("http://services/", "addLotComptes");
    private final static QName _GetCompteResponse_QNAME = new QName("http://services/", "getCompteResponse");
    private final static QName _GetBanqueServicePortResponse_QNAME = new QName("http://services/", "getBanqueServicePortResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link AddLotComptes }
     * 
     */
    public AddLotComptes createAddLotComptes() {
        return new AddLotComptes();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link GetBanqueServicePortResponse }
     * 
     */
    public GetBanqueServicePortResponse createGetBanqueServicePortResponse() {
        return new GetBanqueServicePortResponse();
    }

    /**
     * Create an instance of {@link AddLotComptesResponse }
     * 
     */
    public AddLotComptesResponse createAddLotComptesResponse() {
        return new AddLotComptesResponse();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDhResponse }
     * 
     */
    public ConversionEuroToDhResponse createConversionEuroToDhResponse() {
        return new ConversionEuroToDhResponse();
    }

    /**
     * Create an instance of {@link AddCompteResponse }
     * 
     */
    public AddCompteResponse createAddCompteResponse() {
        return new AddCompteResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDh }
     * 
     */
    public ConversionEuroToDh createConversionEuroToDh() {
        return new ConversionEuroToDh();
    }

    /**
     * Create an instance of {@link GetBanqueServicePort }
     * 
     */
    public GetBanqueServicePort createGetBanqueServicePort() {
        return new GetBanqueServicePort();
    }

    /**
     * Create an instance of {@link AddCompte }
     * 
     */
    public AddCompte createAddCompte() {
        return new AddCompte();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link BanqueService_Type }
     * 
     */
    public BanqueService_Type createBanqueService_Type() {
        return new BanqueService_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDh }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ConversionEuroToDh")
    public JAXBElement<ConversionEuroToDh> createConversionEuroToDh(ConversionEuroToDh value) {
        return new JAXBElement<ConversionEuroToDh>(_ConversionEuroToDh_QNAME, ConversionEuroToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanqueServicePort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getBanqueServicePort")
    public JAXBElement<GetBanqueServicePort> createGetBanqueServicePort(GetBanqueServicePort value) {
        return new JAXBElement<GetBanqueServicePort>(_GetBanqueServicePort_QNAME, GetBanqueServicePort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "addCompteResponse")
    public JAXBElement<AddCompteResponse> createAddCompteResponse(AddCompteResponse value) {
        return new JAXBElement<AddCompteResponse>(_AddCompteResponse_QNAME, AddCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "addCompte")
    public JAXBElement<AddCompte> createAddCompte(AddCompte value) {
        return new JAXBElement<AddCompte>(_AddCompte_QNAME, AddCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLotComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "addLotComptesResponse")
    public JAXBElement<AddLotComptesResponse> createAddLotComptesResponse(AddLotComptesResponse value) {
        return new JAXBElement<AddLotComptesResponse>(_AddLotComptesResponse_QNAME, AddLotComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDhResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "ConversionEuroToDhResponse")
    public JAXBElement<ConversionEuroToDhResponse> createConversionEuroToDhResponse(ConversionEuroToDhResponse value) {
        return new JAXBElement<ConversionEuroToDhResponse>(_ConversionEuroToDhResponse_QNAME, ConversionEuroToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLotComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "addLotComptes")
    public JAXBElement<AddLotComptes> createAddLotComptes(AddLotComptes value) {
        return new JAXBElement<AddLotComptes>(_AddLotComptes_QNAME, AddLotComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBanqueServicePortResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getBanqueServicePortResponse")
    public JAXBElement<GetBanqueServicePortResponse> createGetBanqueServicePortResponse(GetBanqueServicePortResponse value) {
        return new JAXBElement<GetBanqueServicePortResponse>(_GetBanqueServicePortResponse_QNAME, GetBanqueServicePortResponse.class, null, value);
    }

}
