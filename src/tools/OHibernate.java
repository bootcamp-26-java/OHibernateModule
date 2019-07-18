/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import daos.ActorDAO;
import daos.CountryDAO;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import models.Actor;
import models.Country;
import org.hibernate.SessionFactory;

/**
 *
 * @author Arif Fridasari
 */
public class OHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory factory = new HibernateUtil().getSessionFactory();
        System.out.println(factory);
        
        //insert
        CountryDAO cdao = new CountryDAO(factory);
//        Country country = new Country(new Short ("100"), "Winterfell",new Timestamp(new Date().getTime()));
//        System.out.println(cdao.insert(country));

        
        //getAll
//        List<Country> countrys = cdao.getAll();
//        for (Country data : countrys) {
//            System.out.println(data.getCountryId() + " " + data.getCountry() + " " + data.getLastUpdate());
//        }

        //getByID
        Country country = cdao.getById(new Short("1"));
        System.out.println(country.getCountryId() + " - " + country.getCountry() + " - "+ country.getLastUpdate());
        
        
    }

}
