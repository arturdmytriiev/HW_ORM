package org.example.launcher;


import org.example.models.Client;
import org.example.models.Planet;
import org.example.service.UserService;
import org.h2.engine.User;

public class Launcher {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Client client = new Client();
        client.setId(12);
        client.setName("John Doe");
        Planet planet = new Planet();
        planet.setId("MOON");
        planet.setName("Moon");
        /*userService.saveClient(client);
        userService.savePlanet(planet);*/
        /*userService.deleteClient(client);
        userService.deletePlanet(planet);*/
        /*Client client1 = userService.findByIdClient(5);
        System.out.println(client1);
        Planet planet1 = userService.findByIdPlanet("SAT");
        System.out.println(planet1);*/
        userService.updateClient(client);
        userService.updatePlanet(planet);
    }
}
