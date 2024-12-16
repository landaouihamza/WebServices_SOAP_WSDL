package src.main.java.ws;

import jakarta.xml.ws.Endpoint;

public class ServerJws {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8787/";
        Endpoint.publish(url,new ws.BanqueService());
        System.out.println("web service deployé sur "+url);
    }
}
