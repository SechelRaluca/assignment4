package implementation;

import dao.PackageDao;
import dao.UserDao;
import entity.Packagee;
import entity.User;
import interfaces.ClientService;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding
public class ClientServiceImpl implements ClientService {

    private PackageDao packageDao = new PackageDao();
    private UserDao userDao = new UserDao();

    @Override
    public List getClientPackages(int id) {
        return packageDao.getClientPackages(id);
    }

    @Override
    public Packagee getPackageByName(String name) {
        return packageDao.getPackageByName(name);
    }

    @Override
    public String checkStatus(String name) {
        Packagee packagee = packageDao.getPackageByName(name);
        if (packagee.isTracking()) return "Package is tracking";
        else return "Package is not tracking";
    }

    @Override
    public User login(String username, String password) {
        return userDao.loginValidation(username, password);
    }

    @Override
    public User addUser(User user) {
        return userDao.addUser(user);
    }


}
