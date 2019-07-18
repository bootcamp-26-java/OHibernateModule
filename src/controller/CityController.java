/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.CityDAO;
import icontroller.ICityController;
import idaos.ICityDAO;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import models.City;
import models.Country;
import org.hibernate.SessionFactory;

/**
 *
 * @author Arif Fridasari
 */
public class CityController implements ICityController {

    private ICityDAO iCityDAO;

    public CityController(SessionFactory factory) {
        iCityDAO = new CityDAO(factory);
    }

    @Override
    public List<City> getAll() {
        return iCityDAO.getAll();
    }

    @Override
    public List<City> search(Object keyword) {
        return iCityDAO.search(keyword);
    }

    @Override
    public City getById(String id) {
        return iCityDAO.getById(new Short(id));
    }

    @Override
    public String insert(String id, String name, String country, String lastUpdate) {
        City city = new City(new Short(id), name, new Country(new Short(id)), new Timestamp(new Date().getTime()));
        if (iCityDAO.insert(city)) {
            return "Insert Success";
        } else {
            return "Insert Failed";
        }
    }

    @Override
    public String update(String id, String name, String country, String lastUpdate) {
        City city = new City(new Short(id), name, new Country(new Short(id)), new Timestamp(new Date().getTime()));
        if (iCityDAO.update(city)) {
            return "Update Success";
        } else {
            return "Update Failed";
        }
    }

    @Override
    public String delete(String id) {
        if (iCityDAO.delete(new Short(id))) {
            return "Delete Success";
        } else {
            return "Delete Failed";
        }
    }

}
