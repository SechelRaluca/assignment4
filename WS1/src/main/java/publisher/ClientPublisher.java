package publisher;

import implementation.ClientServiceImpl;

import javax.xml.ws.Endpoint;

public class ClientPublisher {

    public static void main(String[] args)
    {
        Endpoint.publish("http://localhost:9089/client", new ClientServiceImpl());
        System.out.println("Client Web services is started!");
    }
}
