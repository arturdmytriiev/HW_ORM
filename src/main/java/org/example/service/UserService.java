package org.example.service;

import org.example.dao.ClientDao;
import org.example.dao.PlanetDao;
import org.example.models.Client;
import org.example.models.Planet;

public class UserService {
    private ClientDao clientDao = new ClientDao();
    private PlanetDao planetDao = new PlanetDao();

    public void saveClient(Client client) {
        clientDao.save(client);
    }

    public void savePlanet(Planet planet) {
        planetDao.save(planet);
    }

    public void deleteClient(Client client) {
        clientDao.delete(client);
    }

    public void deletePlanet(Planet planet) {
        planetDao.delete(planet);
    }

    public Planet findByIdPlanet(String id) {
        return planetDao.get(id);
    }

    public Client findByIdClient(int id) {
        return clientDao.get(id);
    }

    public void updateClient(Client client) {
        clientDao.update(client);
    }

    public void updatePlanet(Planet planet) {
        planetDao.update(planet);
    }


}
