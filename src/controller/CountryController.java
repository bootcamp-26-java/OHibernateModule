/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.CountryDAO;
import icontroller.ICountryController;
import idaos.ICountryDAO;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import models.Country;
import org.hibernate.SessionFactory;

/**
 *
 * @author Arif Fridasari
 */
public class CountryController implements ICountryController {

    private ICountryDAO icdao;

    public CountryController(SessionFactory factory) {
        icdao = new CountryDAO(factory);
    }

    @Override
    public List<Country> getAll() {
        return icdao.getAll();
    }

    @Override
    public Country getById(String id) {
        return icdao.getById(new Short(id));
    }

    @Override
    public List<Country> search(Object keyword) {
        return icdao.search(keyword);
    }

    @Override
    public String insert(String id, String country, String lastUpdate) {
        Country country1 = new Country(new Short(id), country, new Timestamp(new Date().getTime()));
        if (icdao.insert(country1)) {
            return "Insert Success";
        } else {
            return "Insert Failed";
        }
    }

    @Override
    public String update(String id, String country, String lastUpdate) {
        Country country1 = new Country(new Short(id), country, new Timestamp(new Date().getTime()));
        if (icdao.update(country1)) {
            return "Update Success";
        } else {
            return "Update Failed";
        }
    }

    @Override
    public String deleteById(String id) {
        if (icdao.delete(new Short(id))) {
            return "Delete Success";
        } else {
            return "Delete Failed";
        }
    }
}


