package controller;

import implementation.AdminServiceImpl;
import view.LoginView;
import implementation.AdminServiceImplService;
import implementation.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {

    private LoginView loginView;
    private AdminServiceImpl adminService;

    public LoginController() {
        AdminServiceImplService service = new AdminServiceImplService();
        adminService = service.getAdminServiceImplPort();

        this.loginView = new LoginView();
        this.loginView.addListener(new loginListener());
        this.loginView.registerListener(new RegisterListener());

    }

    class loginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            User user = adminService.login(loginView.getUsername(), loginView.getPassword());

            if (user.getRole().toString().equals("CLIENT")) {
                //new UserController(user);
                System.out.print("Welcome client!");
            } else if (user.getRole().toString().equals("ADMIN")) {
                new AdminController(user);
                System.out.print("Welcome admin!");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Username and/or password invalid",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    class RegisterListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {

            //new RegisterController();
        }

    }
}
