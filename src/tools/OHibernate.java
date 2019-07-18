/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import daos.ActorDAO;
import daos.CityDAO;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import models.Actor;
import models.City;
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

        CityDAO cdao = new CityDAO(factory);

        /**
         *
         * Test GetAll
         *
         */
//        List<City> city = cdao.getAll();
//        for (City data : city) {
//            System.out.println(data.getCityId() + " " + data.getCity() + " " 
//                    + data.getCountryId().getCountry()+ " " + data.getLastUpdate());
//        }
        /**
         *
         * Test GetById
         *
         */
//        City city1 = cdao.getById(new Short("494"));
//        System.out.println(city1.getCityId() + " - " + city1.getCity() + " - " 
//                + city1.getCountryId().getCountry() + " - " + city1.getLastUpdate());
        /**
         * 
         * Test Insert
         * 
         */
        City city1 = new City(new Short ("26"), "Bawen", new Country(new Short("15")), 
                new Timestamp(new Date().getTime()));
        System.out.println(city1.getCityId() + " - " + city1.getCity() + " - " 
                + city1.getCountryId().getCountry() + " - " + city1.getLastUpdate());
       
        
        
    }

}
