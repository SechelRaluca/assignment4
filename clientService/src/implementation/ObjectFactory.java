
package implementation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the implementation package. 
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

    private final static QName _AddUserResponse_QNAME = new QName("http://implementation/", "addUserResponse");
    private final static QName _GetPackageByNameResponse_QNAME = new QName("http://implementation/", "getPackageByNameResponse");
    private final static QName _Login_QNAME = new QName("http://implementation/", "login");
    private final static QName _CheckStatusResponse_QNAME = new QName("http://implementation/", "checkStatusResponse");
    private final static QName _GetClientPackages_QNAME = new QName("http://implementation/", "getClientPackages");
    private final static QName _AddUser_QNAME = new QName("http://implementation/", "addUser");
    private final static QName _CheckStatus_QNAME = new QName("http://implementation/", "checkStatus");
    private final static QName _GetPackageByName_QNAME = new QName("http://implementation/", "getPackageByName");
    private final static QName _GetClientPackagesResponse_QNAME = new QName("http://implementation/", "getClientPackagesResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://implementation/", "loginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: implementation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckStatus }
     * 
     */
    public CheckStatus createCheckStatus() {
        return new CheckStatus();
    }

    /**
     * Create an instance of {@link GetPackageByName }
     * 
     */
    public GetPackageByName createGetPackageByName() {
        return new GetPackageByName();
    }

    /**
     * Create an instance of {@link GetClientPackagesResponse }
     * 
     */
    public GetClientPackagesResponse createGetClientPackagesResponse() {
        return new GetClientPackagesResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link CheckStatusResponse }
     * 
     */
    public CheckStatusResponse createCheckStatusResponse() {
        return new CheckStatusResponse();
    }

    /**
     * Create an instance of {@link GetClientPackages }
     * 
     */
    public GetClientPackages createGetClientPackages() {
        return new GetClientPackages();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link GetPackageByNameResponse }
     * 
     */
    public GetPackageByNameResponse createGetPackageByNameResponse() {
        return new GetPackageByNameResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link Route }
     * 
     */
    public Route createRoute() {
        return new Route();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Packagee }
     * 
     */
    public Packagee createPackagee() {
        return new Packagee();
    }

    /**
     * Create an instance of {@link RoutePair }
     * 
     */
    public RoutePair createRoutePair() {
        return new RoutePair();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://implementation/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPackageByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://implementation/", name = "getPackageByNameResponse")
    public JAXBElement<GetPackageByNameResponse> createGetPackageByNameResponse(GetPackageByNameResponse value) {
        return new JAXBElement<GetPackageByNameResponse>(_GetPackageByNameResponse_QNAME, GetPackageByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://implementation/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://implementation/", name = "checkStatusResponse")
    public JAXBElement<CheckStatusResponse> createCheckStatusResponse(CheckStatusResponse value) {
        return new JAXBElement<CheckStatusResponse>(_CheckStatusResponse_QNAME, CheckStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientPackages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://implementation/", name = "getClientPackages")
    public JAXBElement<GetClientPackages> createGetClientPackages(GetClientPackages value) {
        return new JAXBElement<GetClientPackages>(_GetClientPackages_QNAME, GetClientPackages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://implementation/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://implementation/", name = "checkStatus")
    public JAXBElement<CheckStatus> createCheckStatus(CheckStatus value) {
        return new JAXBElement<CheckStatus>(_CheckStatus_QNAME, CheckStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPackageByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://implementation/", name = "getPackageByName")
    public JAXBElement<GetPackageByName> createGetPackageByName(GetPackageByName value) {
        return new JAXBElement<GetPackageByName>(_GetPackageByName_QNAME, GetPackageByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientPackagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://implementation/", name = "getClientPackagesResponse")
    public JAXBElement<GetClientPackagesResponse> createGetClientPackagesResponse(GetClientPackagesResponse value) {
        return new JAXBElement<GetClientPackagesResponse>(_GetClientPackagesResponse_QNAME, GetClientPackagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://implementation/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

}
