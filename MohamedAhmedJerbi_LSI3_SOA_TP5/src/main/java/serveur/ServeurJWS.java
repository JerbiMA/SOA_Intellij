package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServeurJWS {
    public static void main(String[] args) {
        BanqueService BS =new BanqueService(10);
        String url ="http://localhost:8084/";
        Endpoint.publish(url, BS);
        System.out.println("Server url:"+ url);
    }
}
