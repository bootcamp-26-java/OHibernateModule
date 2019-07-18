/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;


import daos.ActorDAO;
import java.util.List;
import models.Actor;
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
        
        ActorDAO adao = new ActorDAO(factory);
        
        List<Actor> actors = adao.getAll();
        for (Actor data : actors) {
            System.out.println(data.getActorId() + " " + data.getFirstName()+ " " + data.getLastName());
        }


    }
    
}
