package interfaces;

import entity.Packagee;
import entity.RoutePair;
import entity.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding
public interface AdminService {

    @WebMethod
    User login(String username, String password);

    @WebMethod
    Packagee addPackage(Packagee packagee);

    @WebMethod
    void removePackage(int packageId);

    @WebMethod
    void registerPackage(int routeId);

    @WebMethod
    List getAllPackages();

    @WebMethod
    List getAllRoutes();

    @WebMethod
    Packagee updateStatus(RoutePair routePair, Packagee packagee);

    @WebMethod
    User getUserByName(String name);

    @WebMethod
    User getUserById(int id);
}
