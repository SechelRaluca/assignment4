package controller;

//import view.AdminView;
import implementation.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AdminController {

    private User user, userInterm;
   // private AdminView adminView;
    private AdminServiceImplService service;
    private AdminServiceImpl adminService;


    public AdminController(User user) {
        this.user = user;
        service = new AdminServiceImplService();
        adminService = service.getAdminServiceImplPort();


//        List<Packagee> list = adminService.getAllPackages();
//        List<User> users = new ArrayList<>();
//        List<Route> lr = adminService.getAllRoutes();
//        /*for(int i=0; i<lr.size();i++)
//		{
//			System.out.println(lr.get(i));
//		}
//		*/
//        for (Packagee aList : list) {
//            this.userInterm = adminService.getUserById(aList.getSender().getId());
//            //	System.out.println(userInterm.getUsername());
//            users.add(userInterm);
//            this.adminView.updateTracking(new updateTracking());
//            this.adminView.updateStatus(new updateStatus());
//            this.adminView.delete(new delete());
//            this.adminView.addPackage(new addPackage());
//            this.adminView.addRoute(new addRoute());
//        }
//
//        class logoutListener implements ActionListener {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                adminView.closePanel();
//            }
//
//        }

//        class updateTracking implements ActionListener {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                adminService.updateStatus(adminView.getTracking(), adminView.getId());
//                adminView.reset();
//                List<Packagee> list = packageService.getAllPackages();
//                List<User> users = new ArrayList<>();
//                for (int i = 0; i < list.size(); i++) {
//                    User u = userService.getUserById(list.get(i).getSender());
//                    users.add(u);
//                    User u1 = userService.getUserById(list.get(i).getReceiver());
//                    users.add(u1);
//                }
//                adminView.updateTable(list, users);

//            }
//
//        }

//        class updateStatus implements ActionListener {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                adminService.updateStatus(adminView.getStatus(), adminView.getId());
//                adminView.reset();
//                List<Packagee> list = packageService.getAllPackages();
//                List<User> users = new ArrayList<>();
//                for (int i = 0; i < list.size(); i++) {
//                    User u = userService.getUserById(list.get(i).getSender());
//                    users.add(u);
//                    User u1 = userService.getUserById(list.get(i).getReceiver());
//                    users.add(u1);
//                }
//                adminView.updateTable(list, users);
//            }
//
//        }

//        class delete implements ActionListener {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                adminService.removePackage(adminView.getId());
//                adminView.reset();
//                List<Packagee> list = packageService.getAllPackages();
//                List<User> users = new ArrayList<>();
//                for (int i = 0; i < list.size(); i++) {
//                    User u = userService.getUserById(list.get(i).getSender());
//                    users.add(u);
//                    User u1 = userService.getUserById(list.get(i).getReceiver());
//                    users.add(u1);
//                }
//                adminView.updateTable(list, users);
//            }
//
//        }
//
//        class addPackage implements ActionListener {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                User u1 = userService.getUserByName(adminView.getSender());
//                User u2 = userService.getUserByName(adminView.getReceiver());
//                packageService.addPackage(new Packagee(u1.getId(), u2.getId(),
//                        adminView.getName(), adminView.getDescrition(), adminView.getSenderCity(),
//                        adminView.getReceiverCity(), adminView.getTracking(), adminView.getStatus()));
//
//                adminView.reset();
//                List<Packagee> list = packageService.getAllPackages();
//                List<User> users = new ArrayList<>();
//                for (int i = 0; i < list.size(); i++) {
//                    User u = userService.getUserById(list.get(i).getSender());
//                    users.add(u);
//                    User u3 = userService.getUserById(list.get(i).getReceiver());
//                    users.add(u3);
//                }
//                adminView.updateTable(list, users);
//            }
//
//        }
//
//        class addRoute implements ActionListener {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                routeService.addRoute(new Route(adminView.getId(), adminView.getCityForRoute(), adminView.getTime()));
//                List l = routeService.getAllRoutes();
//                //adminView.reset();
//                if (l.size() > 0) {
//                    Route r = (Route) l.get(l.size() - 1);
//                    adminView.showRoute(r);
//                    //packageService.updatePackageTrackingStatus(1, adminView.getId());
//                }
//            }
//        }
    }
}
