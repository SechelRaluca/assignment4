
package implementation;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClientServiceImpl", targetNamespace = "http://implementation/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClientServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getClientPackages", targetNamespace = "http://implementation/", className = "implementation.GetClientPackages")
    @ResponseWrapper(localName = "getClientPackagesResponse", targetNamespace = "http://implementation/", className = "implementation.GetClientPackagesResponse")
    @Action(input = "http://implementation/ClientServiceImpl/getClientPackagesRequest", output = "http://implementation/ClientServiceImpl/getClientPackagesResponse")
    public List<Object> getClientPackages(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns implementation.Packagee
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPackageByName", targetNamespace = "http://implementation/", className = "implementation.GetPackageByName")
    @ResponseWrapper(localName = "getPackageByNameResponse", targetNamespace = "http://implementation/", className = "implementation.GetPackageByNameResponse")
    @Action(input = "http://implementation/ClientServiceImpl/getPackageByNameRequest", output = "http://implementation/ClientServiceImpl/getPackageByNameResponse")
    public Packagee getPackageByName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkStatus", targetNamespace = "http://implementation/", className = "implementation.CheckStatus")
    @ResponseWrapper(localName = "checkStatusResponse", targetNamespace = "http://implementation/", className = "implementation.CheckStatusResponse")
    @Action(input = "http://implementation/ClientServiceImpl/checkStatusRequest", output = "http://implementation/ClientServiceImpl/checkStatusResponse")
    public String checkStatus(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns implementation.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://implementation/", className = "implementation.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://implementation/", className = "implementation.LoginResponse")
    @Action(input = "http://implementation/ClientServiceImpl/loginRequest", output = "http://implementation/ClientServiceImpl/loginResponse")
    public User login(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns implementation.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://implementation/", className = "implementation.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://implementation/", className = "implementation.AddUserResponse")
    @Action(input = "http://implementation/ClientServiceImpl/addUserRequest", output = "http://implementation/ClientServiceImpl/addUserResponse")
    public User addUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

}
