import dao.PackageDao;
import dao.RoleDao;
import dao.RouteDao;
import dao.UserDao;
import entity.Packagee;
import entity.Role;
import entity.RoutePair;
import entity.User;

import java.sql.Time;

public class Main {

    public static void main(String[] args) {
        PackageDao packageDao = new PackageDao();
        RouteDao routeDao = new RouteDao();
        RoleDao roleDao = new RoleDao();
        UserDao userDao = new UserDao();

        // CLIENT
        //System.out.println(packageDao.getClientPackages(1));
//        System.out.println(packageDao.getPackageByName("package"));
//         System.out.println(packageDao.getPackageStatus("package"));
//        System.out.println(packageDao.getPackageRoute("package"));


        Role role = roleDao.findRoleById(2);
        User user = User.builder()
                .username("clientRaluca")
                .password("clientRaluca")
                .role(role)
                .build();

        Packagee packagee = Packagee.builder()
                .name("packageR")
                .description("description")
                .destinationCity("Jibou")
                .senderCity("Cluj")
                .route(routeDao.findRouteById(1))
                .sender(user)
                .receiver(user)
                .build();

        RoutePair routePair = RoutePair.builder()
                .City("Jibou")
                .time("15:00:00")
                .build();

        // ADMIN
        packageDao.addPackage(packagee);
        //packageDao.removePackage(packagee.getId());
       // packageDao.registerPackage(1);

//        Packagee packagee1 = packageDao.getPackageByName("package");
//        System.out.println(packagee1.getRoute().getRoutePairs());
//        packageDao.updateStatus(routePair, packagee1);
//        System.out.println(packagee1.getRoute().getRoutePairs());

        // USER
//        System.out.println(userDao.loginValidation("client","client"));
//        System.out.println(userDao.addUser(user));
    }


}
