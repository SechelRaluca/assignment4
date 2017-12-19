package interfaces;

import entity.Packagee;
import entity.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding
public interface ClientService {

    @WebMethod
    List getClientPackages(int id);

    @WebMethod
    Packagee getPackageByName(String name);

    @WebMethod
    String checkStatus(String name);

    @WebMethod
    User login(String username, String password);

    @WebMethod
    User addUser(User user);
}
