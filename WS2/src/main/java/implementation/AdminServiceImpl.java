package implementation;

import dao.PackageDao;
import dao.RouteDao;
import dao.UserDao;
import entity.Packagee;
import entity.Route;
import entity.RoutePair;
import entity.User;
import interfaces.AdminService;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding
public class AdminServiceImpl implements AdminService {

    private PackageDao packageDao = new PackageDao();
    private UserDao userDao = new UserDao();
    private RouteDao routeDao = new RouteDao();

    @Override
    public User login(String username, String password) {
        return userDao.loginValidation(username, password);
    }

    @Override
    public Packagee addPackage(Packagee packagee) {
        return packageDao.addPackage(packagee);
    }

    @Override
    public void removePackage(int packageId) {
        packageDao.removePackage(packageId);
    }

    @Override
    public void registerPackage(int routeId) {
        packageDao.registerPackage(routeId);
    }

    @Override
    public Packagee updateStatus(RoutePair routePair, Packagee packagee) {
        return packageDao.updateStatus(routePair, packagee);
    }

    @Override
    public List<Packagee> getAllPackages() {
        return packageDao.getAllPackages();
    }

    @Override
    public List<Route> getAllRoutes() {
        return routeDao.getAllRoutes();
    }

    @Override
    public User getUserByName(String name) {
        return userDao.getUser(name);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

}
