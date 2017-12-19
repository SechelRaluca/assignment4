package publisher;

import implementation.AdminServiceImpl;

import javax.xml.ws.Endpoint;

public class AdminPublisher {

    public static void main(String[] args)
    {
        Endpoint.publish("http://localhost:9090/admin", new AdminServiceImpl());
        System.out.println("Admin Web services is started!");
    }
}
